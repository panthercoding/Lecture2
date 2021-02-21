public class bank
{

  public static void main(String[] args)
  {
    double savings = 1000;

    savings++; //increase by 1, savings is now 1001
    savings+=1; //also increase by 1, savings is now 1002
    savings = savings + 1;//also increase by 1, savings is now 1003

    savings+= 10; //increase by 10, savings is now 1013
    savings-= 10; //decrease by 10, savings is now 1003

    savings*=2; //multiply by 2, savings is now 2006
    savings/=2; //divide by 2, savings is now 1003

    savings--; //decrease by 1, savings is now 1002
    
  }
}
