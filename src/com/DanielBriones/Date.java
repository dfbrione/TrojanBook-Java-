package com.DanielBriones;

//All methods copied from C++;

public class Date {
    enum MONTH_TYPE {
        Jan(1),
        Feb(2),
        Mar(3),
        Apr(4),
        May(5),
        Jun(6),
        Jul(7),
        Aug(8),
        Sep(9),
        Oct(10),
        Nov(11),
        Dec(12);

        private final int value;

        MONTH_TYPE(int m){
            this.value = m;
        }

        public int getValue(){
            return this.value;
        }


    };

    private int day, month, year;


    public Date() {
        day = 1;
        month = 1;
        year = 1;
    }

    public Date(int m, int d, int y){
        setDate(m,d,y);
    }


    public void setDate(int m, int d, int y){
        if (checkDate(m, d, y) ){
            day = d;
            month = m;
            year = y;
        }

        else {
            day = 1;
            month = 1;
            year = 1970;
        }
    }

    public void setDate(String date){
        int day_, month_, year;
        int state = 0;
        String temp_month = "", temp_year = "", temp_day = "";

        for (int i = 0; i < date.length(); i++){

            if (date.charAt(i) == '/'){
                state++;
                continue;
            }

            if (state == 0){
                temp_month = temp_month + date.charAt(i);

            }

            if (state == 1){
                temp_day = temp_day + date.charAt(i);
            }

            if (state == 2){
                temp_year = temp_year + date.charAt(i);
            }


        }

        setDate(Integer.parseInt(temp_day), Integer.parseInt(temp_month), Integer.parseInt(temp_year));

    }

    private boolean checkDate(int _month, int _day, int _year){


        if (_day<1 | _day > 31)
            return false;


        if (_month <1 | _month >12)
            return false;


        if ((_month == MONTH_TYPE.Apr.getValue()) || (_month == MONTH_TYPE.Jun.getValue()) || (_month == MONTH_TYPE.Sep.getValue()) || (_month == MONTH_TYPE.Nov.getValue())){

            if (_day > 30)
                return false;

        }

        if ((_month == MONTH_TYPE.Jan.getValue()) || (_month == MONTH_TYPE.Mar.getValue()) || (_month == MONTH_TYPE.May.getValue()) || (_month == MONTH_TYPE.Jul.getValue()) || (_month == MONTH_TYPE.Aug.getValue()) || (_month == MONTH_TYPE.Oct.getValue()) || (_month == MONTH_TYPE.Dec.getValue())){
            if (_day > 31)
                return false;

        }



        if (_month == MONTH_TYPE.Feb.getValue()){

            if ((_year %100 == 0) && (_year%400!=0)){ //NOT a leap year
                if(_day >28)
                    return false;
            }

            else if (_year %4 == 0){ // Leap year!
                if (_day >29)
                    return false;
            }

            else{ // Not a leap year
                if (_day >28 ){
                    return false;
                }
            }

        }

        return true;
    }

    public void PrintDate(String type){

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        if(type.equals("M/D/YYYY")){
            System.out.println(month + "/" + day + "/"+ year);
        }

        else if (type.equals("Month D, YYYY")){
            System.out.println(months[month-1] + " " + day + ", " + year);
        }

        else if (type.equals("D-Month-YYYY")){
            System.out.println(day + "-" + months[month -1] + "-" + year );
        }

        else{
            System.out.println("Wrong print type! ");
        }

    }

    public String getDate(){
        String date = "";
        date = date + Integer.toString(day)+ "/" + Integer.toString(month) + "/" + Integer.toString(year);
        return date;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return month + " " + day + " " + year;
    }
}