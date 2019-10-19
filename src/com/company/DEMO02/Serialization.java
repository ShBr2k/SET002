package com.company.DEMO02;

import java.beans.ExceptionListener;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import static com.company.DEMO02.Settings.fileNameXML;


public class Serialization {

    protected static void SerializeArrayListPersonToXML(ArrayList<Person> arrayListPerson) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileNameXML);
        XMLEncoder encoder = new XMLEncoder(fos);
        encoder.setExceptionListener (new ExceptionListener() {
            public void exceptionThrown(Exception e) {
                System.out.println("Exception! :" + e.toString());
            }
        });
        encoder.writeObject(arrayListPerson);
        encoder.close();
        fos.close();
    }
}
