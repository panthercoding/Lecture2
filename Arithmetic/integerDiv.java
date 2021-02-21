public class integerDiv{
  public static void main(String[] args){

    int num1 = 2, num2 = 3;
    double num3 = 2.0, num4 = 3.0;

    int num5 = num1/num2; //int divided by int is an int 

    //double divided by int, int divided by double
    //or double divided by double all result in doubles
    double num6 = num1/num3;
    double num7 = num3/num4;

    int num1 = 12/5;
    //results in 2

    double num2 = 12.0/5;
    //results in 2.4

    double num3 = 12/5.0;
    //results in 2.4

    double num4 = 12.0/5.0;
    //results in 2.4

  }
}