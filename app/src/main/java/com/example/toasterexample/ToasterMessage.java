package com.example.toasterexample;

public class ToasterMessage {
    public static void s(Context c,String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
