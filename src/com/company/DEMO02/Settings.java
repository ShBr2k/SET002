package com.company.DEMO02;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * The Settings class provide to store constant values:
 * pattern date - "dd.MM.yyyy";
 * instance dateFormat of SimpleDateFormat;
 * fileNameLog;
 * fileNameXML;
 *
 * @author Roman Shamakhin
 * @version 0.02 26 Oct 2019
 */
public class Settings {

    protected static final String patternDate = "dd.MM.yyyy";
    protected static final SimpleDateFormat dateFormat = new SimpleDateFormat(patternDate);

    protected static final String fileNameLog = "Text_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log";
    protected static final String fileNameXML = "Serialize_ArrayListPerson_" + LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".xml";

}
