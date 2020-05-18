package com.amit.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message+"  "+"ok",Toast.LENGTH_SHORT).show();

    }
}
