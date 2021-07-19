package com.manager.system.util;

import java.io.*;
import java.util.Properties;

/**
 * FileUtils文件工具类
 * @author 
 *
 */
public class FileUtils {

	/**
	 * 根据PropertyName获取Properties
	 * @param key
	 * @return
	 * @throws  
	 */
	public static Properties getProperties() {
		Properties prop = new Properties();
		try(InputStream inStream = new FileInputStream("/home/Server/server.conf")){
			prop.load(inStream);
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return prop;
	}
	
	/**
	 * 读取文件内容
	 * @param Filename
	 * @return
	 * @throws IOException
	 */
	public static byte[] readFile(String fileName) {
		byte[] buffer = null;
		try(FileInputStream r =  new FileInputStream(new File("/home/Server/"+ fileName))){
			int length = r.read();
			if(length == -1){
				return null;
			}
			buffer = new byte[length];
			length = r.read(buffer, 0, length);
			if(length == -1){
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return buffer;
	}
	
	public static void writeLicenseLog(String value, boolean append){
		try(FileOutputStream w = new FileOutputStream(new File("/home/Server/RCS_license.log"), append);) {
			w.write(value.getBytes("utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
