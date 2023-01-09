package chapterTwo;

public class GrossPay{
        private int straightPay;
        private double  timeAndAHalf;
        private int hourlyRate;
        private int hoursSpent;

        public GrossPay (int hourlyrate,int hoursSpent){
            this.hourlyRate= hourlyrate;
            this.hoursSpent = hoursSpent;
        }
        public void setStraightPay(int hourlyrate,int hoursSpent){
            this.hourlyRate= hourlyrate;
            this.hoursSpent = hoursSpent;
}
        public int getStraightPay(){
            return straightPay = hourlyRate * hoursSpent;
        }

        public void settimeAndAHalf(int hourlyrate,int hoursSpent){
            this.hourlyRate= hourlyrate;
            this.hoursSpent = hoursSpent;
        }
    public double gettimeAndAHalf(){
            timeAndAHalf = (hourlyRate * 1.5) * hoursSpent ;
            return timeAndAHalf;
    }

}
