package util;

public class Util {
	public static float clamp(float value, float low, float high) {
		return Math.min(Math.max(value, low), high);
	}
}
