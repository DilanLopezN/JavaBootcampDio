public class SmartTv {
  boolean isOn = false;
  int channel = 1;
  int volume = 25;

  public void turnOn() {
    if(isOn) {
      isOn =  false;
    }
    
    isOn = true;
   
  }


}
