public class Droid {
  
    int batteryLevel;
    
    public Droid () {
      batteryLevel = 100;
    }
    
    public void activate() {
      System.out.println("Droid is Activated. HELLO");
      batteryLevel = batteryLevel - 5;
      System.out.println("battery is at " + batteryLevel + "%");
    }
    
    public void chargeBattery(int hours) {
      System.out.println("droid-bot is charging...");
      batteryLevel = batteryLevel + hours;
       if (batteryLevel > 100) {
              System.out.println("battery is fully charged");
         batteryLevel = 100;
         System.out.println("battery is at " + batteryLevel + "%");
      } else {
            System.out.println("battery is at " + batteryLevel + "%");
       }
    }
    
    public int checkBatteryLevel() {
      System.out.println("battery is at " + batteryLevel + "%");
      return batteryLevel;
    }
    
    public void hover(int feet) {
      if (feet > 2) {
        System.out.println("Sorry 2 feet is the hover limit!");
      } else {
        System.out.println("Hovering now...");
        batteryLevel = batteryLevel - 20;
        System.out.println("battery is at " + batteryLevel + "%");
      }
    }
    
        public static void main(String[] args){
        Droid testDroid = new Droid();
        testDroid.activate();
        testDroid.chargeBattery(5);
        testDroid.hover(1);
      }
  }