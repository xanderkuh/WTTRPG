package com.wttrhp.wttrpg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
    Humanoids hum;
    public static void main(String[] args) {

    } public Humanoids load() {
        Humanoids loaded = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializedObject.dat"))) {
            loaded = (Humanoids) ois.readObject();
            System.out.println("Object has been deserialized: " + loaded);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } return loaded;
    }
}
