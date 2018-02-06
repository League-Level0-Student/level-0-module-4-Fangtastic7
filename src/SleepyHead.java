//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         * *Use Yes or no command in confirm dialog
         */
        int day =  JOptionPane.showConfirmDialog(null, "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
        
        
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         * *Use if statement and else if
         */
        
         if(day==1) {
        	 JOptionPane.showMessageDialog(null, "Sleep in.");
         }
        	
         else if(day==0) {
        	 
        	 int vaca = JOptionPane.showConfirmDialog(null, "Are we on vacation?");
        	 if(vaca==0) {
        		 JOptionPane.showMessageDialog(null, "Sleep in.");
        	 }
        	 else {
        		 JOptionPane.showMessageDialog(null, "Get up lazybones!");
        	 }
         }
         
    }

	

	
}
