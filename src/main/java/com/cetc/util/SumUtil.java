package com.cetc.util;

import com.sun.jna.Library;
import com.sun.jna.Native;

import java.io.File;

public class SumUtil {

    public interface Sum extends Library{

        //动态库接口
        int sum(int x,int y);

        Sum INSTANCE = (Sum) Native.loadLibrary("sum", Sum.class);

    }

    static {
        File file = new File("src/main/resources/lib/sum.dll");
        System.load(file.getAbsolutePath());
    }


    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println(Sum.INSTANCE.sum(1,2));
        System.out.println("***************************");
    }
}
