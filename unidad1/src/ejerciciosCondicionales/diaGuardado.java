import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;
public class diaGuardado {
    public static void main(String[] args) throws Exception{

        int day = 9;
        String dayName;

        switch(day){
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "thursday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default: dayName = "Invalid day";
            break;
        }

        System.out.println("The day of the week is: " + dayName);

    }
}
