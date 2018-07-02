package com.emi.main;

import com.emi.admin.IngresarPista;
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

public final class Utils {
    
    public static String today() throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String reportDate = df.format(Calendar.getInstance().getTime());
        return df.format(addDays(df.parse(reportDate), 0));
    }
    
    public static String tomorrow() throws ParseException{
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String reportDate = df.format(Calendar.getInstance().getTime());
        return df.format(addDays(df.parse(reportDate), 1));
    }
    
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
