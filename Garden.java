/* 更新日 2020/11/2 */
import java.io.IOException;
public class Garden{
  public static void main(String[] args) {
    Counter counter = new Counter();
    Trunstile thread_east = new Trunstile();
    Trunstile thread_west = new Trunstile();
    thread_east.setName("east");
    thread_west.setName("west");
    thread_east.start();
    thread_west.start();
    try{
      thread_east.join();
      thread_west.join();
    } catch (InterruptedException e){

    }
    System.out.printf("最終結果：%d\n",counter.readValue());
  }
}
