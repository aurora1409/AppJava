/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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
public class IOFileColor {
    public static <T> T doc(String file) {
        T t = null;
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(file));
            t = (T) o.readObject();
            o.close();
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return t;
    }
    
    public static <T> void viet(String file, T t) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(file));
            o.writeObject(t);
            o.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
