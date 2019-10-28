package com.company.DEMO02;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


/**
 * The Convertors class provide converting different types.
 *
 * @author Roman Shamakhin
 * @version 0.11 26 Oct 2019
 */
public class Convertors {

    /* Method convertToLocalDate provide converting values of type Date to values of type LocalDate */
    static protected LocalDate convertToLocalDate(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

}
