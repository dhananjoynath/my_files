package com.djbhai.fm;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.widget.ImageView;
import android.widget.Toast;
import java.io.IOException;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class djbhai {

/* class started */

   public static WallpaperManager setMainScreenWallpaper(Context context, ImageView imageView) {
      WallpaperManager manager = WallpaperManager.getInstance(context);

      try {
         Bitmap bitmap = ((BitmapDrawable)imageView.getDrawable()).getBitmap();
         if (VERSION.SDK_INT >= 24) {
            manager.setBitmap(bitmap, (Rect)null, true, 1);
         } else {
            manager.setBitmap(bitmap);
         }



           String message = "Wallpaper set successfully";   

         Toast.makeText(context,
          message, 1
          ).show();
         
      } catch (NullPointerException var6) {
         var6.printStackTrace();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      return null;
   }




   public static WallpaperManager setLockScreenWallpaper(Activity activity, ImageView imageView) {
      if (VERSION.SDK_INT >= 24) {
         WallpaperManager manager = WallpaperManager.getInstance(activity);

         try {
            manager.setBitmap(((BitmapDrawable)imageView.getDrawable()).getBitmap(), (Rect)null, true, 2);
            
           String message = "Lock Screen Wallpaper set successfully";
            

            Toast.makeText(activity,
             message, 0
            ).show();
           
           
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      } else {
         Toast.makeText(activity,
          "Not supported with the version",
         0).show();
      }

      return null;
   }
  
 

  public static WallpaperManager setBothScreenWallpaper(Activity activity, ImageView imageView) {
      if (VERSION.SDK_INT >= 24) {
         WallpaperManager manager = WallpaperManager.getInstance(activity);

         try {
            manager.setBitmap(((BitmapDrawable)imageView.getDrawable()).getBitmap(), (Rect)null, true, 3);
            
           String message = "both Screen Wallpaper set successfully";
            

            Toast.makeText(activity,
             message, 0
            ).show();
           
           
         } catch (IOException var5) {
            var5.printStackTrace();
         }
      } else {
         Toast.makeText(activity,
          "Not supported with the version",
         0).show();
      }

      return null;
   }
  
 





public  static String base64_decode (final String _text) {
		String decoded ="";
		try {
			byte[] data = android.util.Base64.decode(_text, android.util.Base64.DEFAULT);
			decoded = new String(data, "UTF-8");
			
		}
		catch (Exception e) {
			decoded = "Error : " + e.toString();
		
		}
		return decoded;
	}
	
	
	
	
	
	
public static String base64_encode (final String _text) {
		String encoded = "";
		final byte[] data;
		try {
			data = _text.getBytes("UTF-8");
			String base64 = android.util.Base64.encodeToString(data, android.util.Base64.DEFAULT);
			encoded = base64;
		
		}
		catch (Exception e) {
			encoded = "Error : " + e.toString();
			
		}
		return encoded;
}




public static String file2base64 (final String _filepath) {
		String djbhai_base64_outData ="";

		    java.io.File file = new java.io.File(_filepath);
		
		    try (java.io.FileInputStream InFile = new java.io.FileInputStream(file)) {
			    byte fileData[] = new byte[(int) file.length()];
			    InFile.read(fileData);
			    byte[] encodedBytesFile = org.apache.commons.codec.binary.Base64.encodeBase64(fileData);

			    djbhai_base64_outData = new String(encodedBytesFile);
			    
			    } catch (java.io.FileNotFoundException e) {
			return "file_not_found";
			
			    } catch (java.io.IOException ioe) {
			        return "file_cant_read";
			    }
		    
		    return djbhai_base64_outData;
		
		
}






public static String md5 (final String _input) {
		
		  try {      MessageDigest md = MessageDigest.getInstance("MD5"); 
			            byte[] messageDigest = md.digest(_input.getBytes()); 
			            BigInteger no = new BigInteger(1, messageDigest); 
			
			            String hashtext = no.toString(16); 
			            while (hashtext.length() < 32) { 
				                hashtext = "0" + hashtext; 	}
			            return hashtext; 
			       }
		  catch (NoSuchAlgorithmException e) { 
			    throw new RuntimeException(e); 
		} 
}


public static String First_Letter_Uppercase (final String _string) {
	return _string.substring(0, 1).toUpperCase() + _string.substring(1);
		
}



/* class ended */

}
