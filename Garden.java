import java.io.IOException;
public class Garden{
  public static void main(String[] args) {
    Counter counter = new Counter();
    Trunstile thread_east = new Trunstile();
    Trunstile thread_west = new Trunstile();
    thread_east.start();
    thread_west.start();
    try{
      thread_west.join();
    } catch (InterruptedException e){

    }
    System.out.println(counter.readValue());
  }
}
