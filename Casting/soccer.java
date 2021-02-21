public class soccer{
  public static void main(String[] args){
    int goals = 8;
    int games = 5;

    /*the value of goals temporarily acts like 
    a double, preventing integer division */
    double goalsPerGame = (double) goals / games;
    System.out.println(goalsPerGame);
  }
}