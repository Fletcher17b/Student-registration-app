/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author MarioJr
 */
public class calendarconfigs {
    LocalDate currentDate = LocalDate.now();
    
    public calendarconfigs() {    
    }
    
    private int evaluateMonth(int month)
    {
        int days = 30;
        switch(month){
            case 2: 
                
                          
            case 12:
                days =31;
                break;
            default: 
                days = 30;
                break;
        }
        
        return days;
    }
    
    private int isleapyear(int year) 
    {
        int numberofdays;
        
        if ( year %400 == 0 && year % 4 == 0) {
                    numberofdays = 29;
                } else {
                    numberofdays = 28;
                }      
        
        
        
        return numberofdays;
    }
    
    
    
    public DefaultComboBoxModel showday()
    {
        DefaultComboBoxModel dia = new DefaultComboBoxModel();
        int month = currentDate.getMonthValue();
        int numberofdays = evaluateMonth(month);
        
        for ( int i = 1; i <= numberofdays; i ++)
        {
            dia.addElement(i);
        }
       
        
        return dia;
    }
   
    public DefaultComboBoxModel showMonth()
    {
        DefaultComboBoxModel mes1 = new DefaultComboBoxModel();
               
        for (int m = 1; m <= 12; m++) {
                mes1.addElement(m);
            }
        
        return mes1;
    }
    
    public DefaultComboBoxModel showYear() 
    {
        DefaultComboBoxModel year = new DefaultComboBoxModel();
        int recentYear = LocalDate.now().getYear();
        for (int y = recentYear; y >= recentYear - 100; y--) {
            year.addElement(y);

        }
        return year;
    }
}
