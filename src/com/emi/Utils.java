/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ararage
 */
public final class Utils {
    
    public static String createNewDate() throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String reportDate = df.format(Calendar.getInstance().getTime());
        return df.format(addDays(df.parse(reportDate), 50));
    }
    
    public static Date addDays(Date date, int days){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        return cal.getTime();
    }
    
    public static String getLastData() throws FileNotFoundException{
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get("temp.dat")));
        } catch (IOException ex) {
            Logger.getLogger(IngresarPista.class.getName()).log(Level.SEVERE, null, ex);
        }
        return content.split("\\r?\\n")[content.split("\\r?\\n").length - 1];
    }
}
