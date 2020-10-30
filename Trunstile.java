import java.lang.Thread;

public class Trunstile extend Thread{
  Counter counter = new Counter();

  public void run(){
    for(int i=1;i<100;i++){
      system.out.println("来場"+(i));
      counter.writeValue(counter.readValue());
    }
  }
}
