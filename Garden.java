public class Garden{
  Counter counter = new Counter();
  public static void main(String[] args) {
    Trunstile thread_east = new Trunstile();
    Trunstile thread_west = new Trunstile();
    thread_east.start();
    thread_west.start();
  }
}
