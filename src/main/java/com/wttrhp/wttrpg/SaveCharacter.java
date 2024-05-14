package com.wttrhp.wttrpg;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveCharacter {
    static Humanoids h;
    public SaveCharacter(){

    }
    public static void main(String[] args) {



    }
    public void save(Humanoids hum){
        this.h = hum;
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializedObject.dat"))) {
        oos.writeObject(h);
        System.out.println("Object has been serialized to serializedObject.dat");
    } catch (IOException e) {
        e.printStackTrace();
    }}
}
