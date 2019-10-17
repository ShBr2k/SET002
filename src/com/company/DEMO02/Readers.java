package com.company.DEMO02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Readers {

    public static String stringReader ()
    {
        String input;
        String result = null;

        try
        {
            InputStreamReader inputStreamReader = new InputStreamReader (System.in);
            BufferedReader bufferedReader = new BufferedReader (inputStreamReader);
            input = bufferedReader.readLine ();
            result = input;
        } catch (IOException e) {
            e.printStackTrace ();
        }

        return result;

    }

    public static Integer integerReader ()
    {
        String input;
        Integer result = 0;

        try
        {
            InputStreamReader inputStreamReader = new InputStreamReader (System.in);
            BufferedReader bufferedReader = new BufferedReader (inputStreamReader);
            input = bufferedReader.readLine ();
            result = Integer.parseInt (input);

        } catch (NumberFormatException ex) {
            System.out.println ("Not a number!");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace ();
        }

        return result;
    }
}
