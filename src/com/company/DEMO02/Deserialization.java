package com.company.DEMO02;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static com.company.DEMO02.Settings.fileNameXML;


public class Deserialization {

    protected static ArrayList<Person> DeserializeArrayListPersonFromXML() {
        ArrayList<Person> decodedArrayListPerson = null;

        try {
            FileInputStream fis = new FileInputStream(fileNameXML);
            XMLDecoder decoder = new XMLDecoder(fis);
            decodedArrayListPerson = (ArrayList<Person>) decoder.readObject();
            decoder.close();
            fis.close();
            System.out.println("\nDeserialization is done. Result of deserialization:");
        } catch (IOException e) {
            System.out.println("\nDeserialization is failed.\n");
            e.printStackTrace();
            System.exit(0);
        } finally {
            return decodedArrayListPerson;
        }

    }
}
