public class Counter{
  private static int value;

  public int readValue(){
    return value;
  }

  public void writeValue(int num){
    value = num + 1;
    System.out.println(value);
  }
}
