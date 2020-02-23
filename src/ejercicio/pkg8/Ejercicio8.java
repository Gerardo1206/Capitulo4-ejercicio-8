package ejercicio.pkg8;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Ejercicio8 {
    public static void main(String[] args) {
        Calendar f1=GregorianCalendar.getInstance();
        Integer a=f1.getActualMaximum(Calendar.DATE);
        Integer b=f1.get(Calendar.DATE);
        Integer resultado=a-b;
        System.out.println("Faltan:"+ resultado +" dias para acabar el mes");
    }
    
}
