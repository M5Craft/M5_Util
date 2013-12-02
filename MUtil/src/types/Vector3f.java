package types;

import java.util.StringTokenizer;

public class Vector3f {

    public float x, y, z;
    public Vector3f clone(){
    	return new Vector3f(x, y, z);
    }
    
    public Vector3f(float x, float y, float z) {
            this.x = x;
            this.y = y;
            this.z = z;
    }
    
    public void multiply(Vector3f a) {
            x *= a.x;
            y *= a.y;
            z *= a.z;
    }
    
    public void add(Vector3f a) {
            x += a.x;
            y += a.y;
            z += a.z;
    }
    
    public static Vector3f multiply(Vector3f a, Vector3f b) {
            return new Vector3f(a.x * b.x, a.y * b.y, a.z * b.z);
    }
    
    public static Vector3f multiply(Vector3f a, float b) {
            return new Vector3f(a.x * b, a.y * b, a.z * b);
    }
    
    public static Vector3f add(Vector3f a, Vector3f b) {
            return new Vector3f(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    
    public String println(){
    	return ""+ x+" "+y+" "+z;
    }
    
   
    public double getRadiansX(){
    	 return Math.toRadians(x);
    }
    
    public double getRadiansY(){
   	 return Math.toRadians(y);
   }  
    
	public static Vector3f parse(StringTokenizer tokenizer) {
		return new Vector3f(Float.valueOf(tokenizer.nextToken()), Float.valueOf(tokenizer.nextToken()), Float.valueOf(tokenizer.nextToken()));
	}
}