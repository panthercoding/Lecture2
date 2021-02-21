/*
generates arithmetic exception error due to attempted
division by 0
*/

public class exception
{
  public static void main(String[] args)
  {
    int num1 = 10;
    int num2 = 0;

    int num3 = num1/num2; //arithmetic exception error
    int num4 = num1 % num2; //also arithmetic exception error
  }
}