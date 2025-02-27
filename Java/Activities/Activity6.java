package activities;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
   private int maxPassenger;
   private List<String> passengers;
   private Date lastTimeTookOf;
   private Date lastTimeLanded;
   public Plane(int maxPasseneger){
       this.maxPassenger=maxPasseneger;
       this.passengers = new ArrayList<>();
   }
   public void onboard(String passenger){
       this.passengers.add(passenger);
   }

   public Date takeOff(){
       this.lastTimeTookOf = new Date();
       return lastTimeTookOf;
    }

    public void land(){
       this.lastTimeLanded = new Date();
       this.passengers.clear();
    }
    public Date getLastTimeLanded(){
       return lastTimeLanded;
    }
    public List<String> getPassengers(){
       return passengers;
    }
}
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        //add passengers:
        plane.onboard("Adi");
        plane.onboard("Sheikh");
        plane.onboard("Aujla");

        //Plane takeOff time:
        System.out.println("Take off time of plane: "+plane.takeOff());
        //Passengers details
        System.out.println("passengers onboard: "+plane.getPassengers());

        Thread.sleep(5000);


        //land the plane
        plane.land();
        //land time of plane
        System.out.println("Plane landed at : " + plane.getLastTimeLanded());
        System.out.println("People on plane after landing: "+ plane.getPassengers());

    }
}
