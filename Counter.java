/* 更新日 2020/11/2 */
public class Counter{
  private static int value;

  public int readValue(){
    return value;
  }

  public void writeValue(int num){
    value = num + 1;
    System.out.printf("カウンタ：%d\n",value);
  }
}
