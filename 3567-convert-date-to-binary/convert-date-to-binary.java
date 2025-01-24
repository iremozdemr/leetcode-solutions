class Solution {
    public String convertDateToBinary(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));

        String yearBinary = "";
        String monthBinary = "";
        String dayBinary = "";

        while(year != 0){
            if(year % 2 == 0){
                yearBinary = "0" + yearBinary;
            }
            else{
                yearBinary = "1" + yearBinary;
            }

            year = year / 2;
        }

        while(month != 0){
            if(month % 2 == 0){
                monthBinary = "0" + monthBinary;
            }
            else{
                monthBinary = "1" + monthBinary;
            }

            month = month / 2;
        }

        while(day != 0){
            if(day % 2 == 0){
                dayBinary = "0" + dayBinary;
            }
            else{
                dayBinary = "1" + dayBinary;
            }

            day = day / 2;
        }

        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}