package com.company.DEMO02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;

import static com.company.DEMO02.Settings.*;


public class ConsoleReaders {

    protected static Date DateReader() throws ParseException {

        String input = null;
        Date result = null;
        Pattern patternDate = Pattern.compile("^([0-3]{1}[0-9]{1}[.]{1}[0-1]{1}[0-9]{1}[.]{1}[1-2]{1}[0-9]{3})$");

        do {

            try {
                InputStreamReader inputStreamReader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                input = bufferedReader.readLine();
            } catch (IOException e) {
                System.out.println("\nSomething wrong with Input Stream Reader.");
                e.printStackTrace();
                System.exit(0);
            }

            if (!patternDate.matcher(input).find()) {
                System.out.print("Entered Date is wrong. Please try again: ");
            }

        } while (!patternDate.matcher(input).find());


        //newer rise exception
        try {
            result = (dateFormat.parse(input));
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("\nParsing Date is failed. Default Date will be set to: 01.01.1900.");
            result = dateFormat.parse("01.01.1900");
        } finally {
            return result;
        }
    }


    protected static String StringReader() {
        String input;
        String result = null;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            input = bufferedReader.readLine();
            result = input;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;

    }


    protected static Integer integerReader() {
        String input;
        Integer result = 0;

        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            input = bufferedReader.readLine();
            result = Integer.parseInt(input);

        } catch (NumberFormatException ex) {
            System.out.println("Not a number!");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
