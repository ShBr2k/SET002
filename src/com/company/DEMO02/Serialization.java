package com.company.DEMO02;


import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;

import static com.company.DEMO02.Settings.fileNameXML;


/**
 * The Serialization class provide serialization of instances of classes Person and Student
 * from ArrayList's records to XML file.
 *
 * @author Roman Shamakhin
 * @version 0.31 26 Oct 2019
 */
public class Serialization {

    protected static void SerializeArrayListPersonToXML(ArrayList<Person> arrayListPerson) {

        try {
            FileOutputStream fos = new FileOutputStream(fileNameXML);
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
