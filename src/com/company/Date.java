package com.company;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return day + "." + month + "." + year;
    }
    public static void compareDates(Date date1, Date date2){
        if(date1.year > date2.year){
            System.out.println(date1.toString() + " jest późniejszą datą niż " + date2);
        }else if(date1.year < date2.year){
            System.out.println(date1.toString() + " jest wcześniejszą datą niż " + date2);
        }else{
            if(date1.month > date2.month){
                System.out.println(date1.toString() + " jest późniejszą datą niż " + date2);
            }else if (date1.month < date2.month){
                System.out.println(date1.toString() + " jest wcześniejszą datą niż " + date2);
            }else{
                if(date1.day > date2.day){
                    System.out.println(date1.toString() + " jest późniejszą datą niż " + date2);
                }else if(date1.day < date2.day){
                    System.out.println(date1.toString() + " jest wcześniejszą datą niż " + date2);
                }else{
                    System.out.println("Daty są takie same.");
                }
            }
        }
    }

    public static Date convertToDate(String n){
        String[] o = n.split("\\.");
        Date date = new Date(Integer.parseInt(o[0]),Integer.parseInt(o[1]),Integer.parseInt(o[2]));
        return date;
    }
    public static int calculateDaysFromBeginningOfXXCentury(Date date) {
        int days = 0;
        days = 365 * (date.year - 1900);
        for (int i = 1900; i < date.year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i%4==0 && i % 400 == 0)) {
                days = days + 1;
            }

        }
        if (date.month != 1){
            for (int i = 1; i < date.month; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    days = days + 30;
                } else if (i == 2 && date.year%4==0) {
                    days = days + 29;
                } else if (i == 2) {
                    days = days + 28;
                } else {
                    days = days + 31;
                }

            }

    }
        days = days + date.day;
        days = days - 1;
        return days;
    }
}
