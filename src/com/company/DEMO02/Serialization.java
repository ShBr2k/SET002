package com.company.DEMO02;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

import static com.company.DEMO02.Settings.fileNameXML;


public class Serialization {

    protected static void SerializeArrayListPersonToXML(ArrayList<Person> arrayListPerson) {
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(fileNameXML);
            XMLEncoder encoder = new XMLEncoder(fos);
            encoder.writeObject(arrayListPerson);
            encoder.close();
            fos.close();
            System.out.println("\nSerialization is done. File: " + fileNameXML + " is saved.");
        } catch (IOException e) {
            System.out.println("\nSerialization is failed.\n");
            e.printStackTrace();
            System.exit(0);
        }

    }
}
