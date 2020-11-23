package com.everis.bootcamp;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("La fecha de hoy es " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
    }
}
