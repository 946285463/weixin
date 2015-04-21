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
        String log = "数组， 调用C++前" + Arrays.toString(array);
        boolean isCopyOfArrayInCpp = NativeClass.jniArrayAdd(array, 1);
        log += "\n在C++中为副本？  " + isCopyOfArrayInCpp;
        log += "\n数组，调用C++后：" + Arrays.toString(array);
        
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.text_view)).setText(log) ;
        
    }
}
