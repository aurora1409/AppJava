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

/**
 *
 * @author PC
 */
public class IOFileFont {
    public static String doc(String file) {
        String s = "";
        try {
            FileInputStream fis= new FileInputStream(file);
            DataInputStream dis= new DataInputStream(fis);
            s=dis.readUTF();
            fis.close();
            dis.close();
        } catch (Exception e) {
        }
        return s;
    }
    
    public static void viet(String file, String x) {
        try {
            FileOutputStream fos=new FileOutputStream(file);
            DataOutputStream dos=new DataOutputStream(fos);
            dos.writeUTF(x);
            fos.close();
            dos.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
