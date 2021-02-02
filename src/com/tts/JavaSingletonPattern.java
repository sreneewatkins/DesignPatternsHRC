package com.tts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

// Once submitted, our hidden Solution class will check
// your code by taking a String as input and then using
// your Singleton class to print a line.

public class JavaSingletonPattern {

    // A private Singleton non parameterized constructor.
    private JavaSingletonPattern() {}

    // A public String instance variable named str.
    public String str;

    // Write a static method named getSingleInstance that returns the single           // instance of the Singleton class.
    public static JavaSingletonPattern getSingleInstance() {

        return new JavaSingletonPattern();
    }

}//end JavaSingletonPattern

/* from Joshua
class Singleton{

    public String str;
    private static Singleton ourRef;

    private Singleton(){
        this.str = "Hello I am a singleton! Let me say hello world to you";
    }

    public static Singleton getSingleInstance(){
        if (ourRef == null){
            return ourRef = new Singleton();
        } else return ourRef;
    }
}
*/
/* from Yusuf
class Singleton{
    public String str;
    private static Singleton instance = null;
    private Singleton(){
    }
    public static Singleton getSingleInstance(){
        if (instance==null) instance = new Singleton();
        return instance;
    }
}
 */