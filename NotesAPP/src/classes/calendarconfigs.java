/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.time.LocalDate;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author MarioJr
 */
public class calendarconfigs {
    
    public calendarconfigs() {    
    }
    
    public int evaluateMonth(int month, int year)
    {
        int days;
//        
//        if ( month == 2 ) {
//           days = this.isleapyear(year);
//        } else if(month == 12) {
//            days = 31;
//        }
       days = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> this.isleapyear(year);
            default -> 30;
        };
     
        System.out.println("func: evualtemonth, retorna: "+days);
        System.out.println("month: "+month);
        System.out.println("year: "+year);
         System.out.println("break line");
        return days;
    }
    
    public int isleapyear(int year) 
    {
        int numberofdays;
        
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
                {
                    numberofdays = 29;
                } else { numberofdays = 28; }    
        System.out.println("func: isleapyear, retorna:  "+numberofdays);
         System.out.println("year: "+year);
          System.out.println("break line");
        return numberofdays;
    }
    
    
    
    public DefaultComboBoxModel showday(int mes,int year)
    {
        DefaultComboBoxModel dia = new DefaultComboBoxModel();
        int numberofdays = this.evaluateMonth(mes, year);
       
        for ( int i = 1; i <= numberofdays; i ++)
        {
            dia.addElement(i);
        }
        
        System.out.println("func: showday, retorna:  "+numberofdays);
        System.out.println("nes: "+mes);
        System.out.println("year: "+year);
        System.out.println("break line");
        System.out.println("cycle line");
        
        
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
