import java.util.ArrayList;
public class date {
    public int month;
    public int day;
    public int monthOut;
    public int dayOut;


    public ArrayList<Integer> newDayList = new ArrayList<>();
    public ArrayList<Integer> newMonthList = new ArrayList<>();


    public void storeData(int month,int day,int monthOut,int dayOut){
        this.month = month;
        this.day = day;
        this.monthOut = monthOut;
        this.dayOut = dayOut;



        if((dayOut-day)<0){


            int newDay = (dayOut+30)-day;
            int newMonth = (monthOut-1)-month;
            newDayList.add(newDay);
            newMonthList.add(newMonth);
            System.out.println(" ");
            System.out.println("You Stay with us "+ newDay +" Days and " + newMonth +" Months.....");
            System.out.println(" ");

        }else{
            int newDay = dayOut-day;
            int newMonth = monthOut-month;
            newDayList.add(newDay);
            newMonthList.add(newMonth);
            System.out.println("You Stay with us "+ newDay +" Days and " + newMonth +" Months.....");
            System.out.println(" ");

        }


    }

}

