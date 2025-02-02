import java.util.Scanner;
public class Input{

    public static void main(String[] args){
      Scanner input = new Scanner(System.in);

      String name;
      System.out.print("Enter your name: ");
      name = input.nextLine();

      int age;
      System.out.print("Enter your age:");
      age = input.nextInt();

      float weight;
      System.out.print("Enter your weight: ");
      weight = input.nextFloat();

      Boolean smoker;
      System.out.print("Are you a smoker? True or False: ");
      smoker = input.nextBoolean();

      System.out.println("Name: " +name );
      System.out.println("Age: " + age);
      System.out.println("Weight: " + weight);
      System.out.println("Are you a smoker: "+ smoker);

    }

}
