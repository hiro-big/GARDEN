import java.lang.Thread;

public class Trunstile extends Thread{
  Counter counter = new Counter();
  public void run(){
    for(int i=1;i<=1000;i++){
      System.out.printf("%sから来場(合計:%d) ",getName(),i);
      counter.writeValue(counter.readValue());
    }
  }
}
