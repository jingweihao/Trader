package com.action;

import java.io.*;
import org.apache.commons.codec.binary.Base64;

public class Image 
{
	public static String imageToBase64(File upload) 
	{
	    byte[] data = null;
	    try 
	    {
	        InputStream in = new FileInputStream(upload);
	        data = new byte[in.available()];
	        in.read(data);
	        in.close();
	    } 
	    catch (IOException e) 
	    {
	        e.printStackTrace();
	    }
	    
	    return Base64.encodeBase64String(data);
	}
	
	public static boolean base64ToImage(String base64, String download) 
	{
	    if (base64 == null)
	        return false;
	    
	    try {
	    	
	        byte[] bytes = Base64.decodeBase64(base64);
	        for (int i = 0; i < bytes.length; ++i) {
	            if (bytes[i] < 0) {
	                bytes[i] += 256;
	            }
	        }
	        
	        OutputStream out = new FileOutputStream(download);
	        out.write(bytes);
	        out.flush();
	        out.close();
	        return true;
	     } 
	     catch (Exception e) 
	     {
	        return false;
	     }
	    
	}
	
	

}
