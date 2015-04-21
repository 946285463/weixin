package com.niu.testjni;

import android.util.Log;

public class NativeClass {

	public static native boolean jniArrayAdd(int[] a, int b);
	
	public static native int[] jniArrayMul(int[] a, int b);
	
	static {
		Log.i("info", "NativeClass before load library");
		
		System.loadLibrary("TestJni");
		
		Log.i("info", "NativeClass after load library");
	}
}
