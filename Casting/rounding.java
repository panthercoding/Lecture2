public class rounding{

  public static void main(String[] args){

    //rounding for positive numbers
    double avgTemperature1= 55.4;
    int roundedAvg1 = (int) (avgTemperature1 + 0.5);
    
    System.out.println(roundedAvg1);

    //rounding for negative numbers
    double avgTemperature2 = 55.4;
    int roundedAvg2 = (int) (avgTemperature2 - 0.5);

    System.out.println(roundedAvg2);
  }
}
