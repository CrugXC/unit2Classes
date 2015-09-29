public class DistanceConverter
{
   private static final double YARDS = 3.5;
   private static final double  FEET = YARDS * 3;
   private static final double INCHES = YARDS * 12;
   public static void main(String[] args)
   {
      
      
      System.out.println(YARDS + " yards are " + FEET + " feet");
      System.out.println(YARDS + " yards are " + INCHES + " inches");
   }
}