package com.niu.testjni;

import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int[] array = new int[] {1, 2, 3};
        String log = "���飬 ����C++ǰ" + Arrays.toString(array);
        boolean isCopyOfArrayInCpp = NativeClass.jniArrayAdd(array, 1);
        log += "\n��C++��Ϊ������  " + isCopyOfArrayInCpp;
        log += "\n���飬����C++��" + Arrays.toString(array);
        
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.text_view)).setText(log) ;
        
    }
}
