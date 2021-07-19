package com.manager.system.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.MessageDigest;
import java.util.Enumeration;

/**
 * 获取设备UUID、Mac、MD5
 * @author cbigd
 *
 */
public class ServerInfo {
	public static String getLocalMac() {
		String result = "";
		try{
			Process p;
			p = Runtime.getRuntime().exec("blkid");
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream(), "utf-8"));
			String line = null;
			while ((line = input.readLine()) != null) {
				result = result + line;
			}
			p = Runtime.getRuntime().exec("cat /sys/class/net/eth0/address");
			input = new BufferedReader(new InputStreamReader(p.getInputStream(), "utf-8"));
			while ((line = input.readLine()) != null) {
				result = result + line;
			}
			result = result + getLinuxLocalIp();
		}catch(Exception e){
			return null;
		}
		return result;
	}

	private static String getLinuxLocalIp() {
		String ip = "";
		try {
			for (Enumeration<NetworkInterface> en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();) {
				NetworkInterface intf = en.nextElement();
				String name = intf.getName();
				if (!name.contains("docker") && !name.contains("lo")) {
					for (Enumeration<InetAddress> enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();) {
						InetAddress inetAddress = enumIpAddr.nextElement();
						if (!inetAddress.isLoopbackAddress()) {
							String ipaddress = inetAddress.getHostAddress().toString();
							if (!ipaddress.contains("::") && !ipaddress.contains("0:0:") && !ipaddress.contains("fe80")) {
								ip = ipaddress;
							}
						}
					}
				}
			}
		} catch (SocketException ex) {
			ip = "127.0.0.1";
		}
		return ip;
	}

	public static String getMd5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();
			int i;
			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			return buf.toString();
		} catch (Exception e) {
			return null;
		}
	}

}
