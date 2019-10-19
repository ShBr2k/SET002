package com.company.DEMO02;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import static com.company.DEMO02.Settings.fileNameXML;


public class Deserialization {

    protected static ArrayList<Person> DeserializeArrayListPersonFromXML() throws IOException {
        FileInputStream fis = new FileInputStream(fileNameXML);
        XMLDecoder decoder = new XMLDecoder(fis);
        ArrayList<Person> decodedArrayListPerson = (ArrayList<Person>) decoder.readObject();
        decoder.close();
        fis.close();
        return decodedArrayListPerson;
    }

}
