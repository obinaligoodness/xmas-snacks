package Airlines;

public class Airlines {
    private boolean [] seats;
    private  final int firstClassTicketCategory = 1;
    private final int economyClassTicketBookingRequest = 2;
    public Airlines(){
        int numberOfSeat = 10;
        this.seats=new boolean[numberOfSeat];
    }
    public boolean[] getSeats() {
        return seats;
    }

    public void bookTicket(int bookingCategory) {
        if(bookingCategory == firstClassTicketCategory){
            for (int counter = 0; counter < seats.length-5; counter++) {
             if(!seats[counter]) seats[counter] = true;
             break;
            }
        }
        else{
            for (int counter = 0; counter < seats.length; counter++) {
                if(!seats[counter]) seats[counter] = true;
                break;
            }
            }}
    public void bookEconomyClassSeat(){

    }
}
