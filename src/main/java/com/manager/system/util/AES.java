package com.manager.system.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 批处理中所用AES加密工具
 * @author cbigd
 *
 */
public class AES {
	public static String convertByteToHexString(byte[] bytes){
		String result = "";
		for(int i=0;i<bytes.length;i++){
			int temp = bytes[i] & 0xff;
			String tempHex = Integer.toHexString(temp);
			if(tempHex.length()<2){
				result += "0" + tempHex;
			}else{
				result += tempHex;
			}
		}
		return result;
	}
	public static byte[] convertHexStringToByte(String hexString) {
		if (hexString == null || hexString.equals("")) {  
	        return null;  
	    }  
	    hexString = hexString.toUpperCase();  
	    int length = hexString.length() / 2;  
	    char[] hexChars = hexString.toCharArray();  
	    byte[] d = new byte[length];  
	    for (int i = 0; i < length; i++) {  
	        int pos = i * 2;  
	        d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));  
	    }  
	    return d;  
	}
	private static byte charToByte(char c) {  
		    return (byte) "0123456789ABCDEF".indexOf(c);  
	}  
	public static byte[] AESJDKEncode(String message, String password){
		try {
			SecretKeySpec key = new SecretKeySpec(password.getBytes(),"AES");
			IvParameterSpec iv = new IvParameterSpec("0123456789012345".getBytes());
//			IvParameterSpec iv = new IvParameterSpec("".getBytes());
//			Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
//			Cipher cipher = Cipher.getInstance("AES/ECB/NoPadding");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE,key,iv);
			byte[] result = cipher.doFinal(message.getBytes());
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//解密算法
	public static byte[] AESJDKDecode(byte[] message, String password){
		try {
			SecretKeySpec key = new SecretKeySpec(password.getBytes(),"AES");
			IvParameterSpec iv = new IvParameterSpec("0123456789012345".getBytes());
//			IvParameterSpec iv = new IvParameterSpec("".getBytes());
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE,key,iv);
			byte[] result = null;
			try{
				result = cipher.doFinal(message);
			}catch (Exception e) {
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		String content = "1234567890123456";
		String password = "7624A358ACCEA2B3";
		
		byte[] license_buf = FileUtils.readFile("license");
		byte[] decodeMessage = AES.AESJDKDecode(license_buf, password);
		String decodeMessage_s = new String(decodeMessage);
//		System.out.println("AES 解密后为:"+ new String(decodeMessage_s));

		byte[] encodeMessage = AESJDKEncode(content,password);
//		System.out.println("AES 加密后为:"+convertByteToHexString(encodeMessage));
//		byte[] decodeMessage = AESJDKDecode(encodeMessage,password);
//		System.out.println("AES 解密后为:"+ new String(decodeMessage));
	}

}
