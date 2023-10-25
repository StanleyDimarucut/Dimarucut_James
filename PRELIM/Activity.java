import java.util.Scanner;

class Activity {
   public static void main(String[] args) {
      Animal animal = new Animal();
      int num;
      char ans;
      Scanner scanner = new Scanner(System.in);
   
      do {
         System.out.println("============Activity Animal Sounds===========");
         do {
            System.out.println("Choose an animal.");
            System.out.println(" 1. Dog \n 2. Cat \n 3. Fish \n 4. Lion ");
            System.out.printf("Enter a number: ");
            num = scanner.nextInt();
         
            if (num > 4 || num < 1) {
               System.out.println("The number entered is beyond my programming :D\nPlease try again.");
            }
         } while (num > 4 || num < 1);
      
         switch (num) {
            case 1:
               animal.dog();
               break;
            case 2:
               animal.cat();
               break;
            case 3:
               animal.fish();
               break;
            case 4:
               animal.lion();
               break;
         }
      
         System.out.println("\nChoose again? [Y/N]");
         ans = scanner.next().charAt(0);
      } while (ans == 'Y' || ans == 'y');
   
      System.out.println("Thanks! Have a great day!!");
      scanner.close();
   }
}

class Animal {
   public void dog() {
      System.out.println("Woof Woof");
   }

   public void cat() {
      System.out.println("Meow");
   }

   public void fish() {
      System.out.println("Blob Blob");
   }

   public void lion() {
      System.out.println("Raawrr");
   }
}