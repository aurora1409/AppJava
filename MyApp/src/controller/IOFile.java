/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */

public class IOFile {
    public static Integer doc(String file) {
        Integer s = null;
        try {
            FileInputStream fis= new FileInputStream(file);
            DataInputStream dis= new DataInputStream(fis);
            s=dis.readInt();
            fis.close();
            dis.close();
        } catch (Exception e) {
        }
        return s;
    }
    
    public static void viet(String file, Integer x) {
        try {
            FileOutputStream fos=new FileOutputStream(file);
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeInt(x);
            fos.close();
            dos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void viet(String srccontrollersizetxt, String font1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
