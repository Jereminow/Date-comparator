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
}
