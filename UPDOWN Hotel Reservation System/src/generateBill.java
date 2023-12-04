public class generateBill extends date {
    private int roomRate = 4000;

    public generateBill() {

        super.storeData(month, day, monthOut, dayOut);
    }

    public void calculateBill() {
        int totalDays = (newMonthList.get(0) * 30) + newDayList.get(0);
        double bill = totalDays * roomRate;
        System.out.println("Your Bill is LKR : " + bill);
    }

}
