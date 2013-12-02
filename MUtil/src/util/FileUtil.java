package util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FileUtil {
	public static String readFully(InputStream is) {
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
			StringBuilder s = new StringBuilder();
			String l;
			while((l = reader.readLine()) != null){
				s.append(l).append('\n');
			}
			
			return s.toString();
		} catch(Exception exc) {
			throw new RuntimeException("Failure reading input stream", exc);
		}
	}
	
	public static String readFromFile(Class<?> clazz, String file) {
		try {
			return readFully(clazz.getResourceAsStream(file));
		} catch(Exception exc) {
			throw new RuntimeException("Failure reading file " + file, exc);
		}
	}
	
    public static java.net.URL getResource(Class<?> clazz, String file) {
    	return clazz.getResource(file);      
    }
}
