import java.util.Scanner;
public class Lab05_Q1{
    public static int largestDigit(int number){
        int maxDigit=0;
        while (number>0){
            int currentDigit = number%10;
            if (maxDigit<currentDigit){
                maxDigit=currentDigit;
            }
            number=number/10;
        }
        return maxDigit;
    }
    public static int secondSmallestDigit(int number){
        int secondDigit=10;
        int firstDigit=10;
        if (number==0){
            return 10;
        }
        while (number>0){
            int currentDigit=number%10;
            if (firstDigit>currentDigit){
                secondDigit=firstDigit;
                firstDigit=currentDigit;
            }
            else if (firstDigit<currentDigit && secondDigit>currentDigit){
                secondDigit=currentDigit;
            }
            number=number/10;
        }
        return secondDigit;
    }
    public static int countEvenDigits(int number){
        int i = 0;
        number=Math.abs(number);
        if (number==0){
            return 1;
        }
        while (number>0){
            int currentDigit=number%10;
            if (currentDigit%2==0){
                i++;
            }
            number=number/10;
        }
        return i;
    }
    public static boolean  hasLocalPeak(int number){
        while (number>=100){
            int previousDigit=number%10;
            int currentDigit=number/10%10;
            int nextDigit=number/100%10;
            if (currentDigit>previousDigit&&currentDigit>nextDigit){
                return true;
            }
            number=number/10;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - Find largest digit");
            System.out.println("2 - Find second smallest digit");
            System.out.println("3 - Count even digits");
            System.out.println("4 - Has local peak");
            System.out.println("5 - EXIT");
            System.out.print("Enter choice: ");
            int userChoice=scanner.nextInt();
            if (userChoice==5){
                System.out.println("Goodbye....");
                return;
            } else if (userChoice >= 1 && userChoice <= 4) {
                System.out.print("Enter number: ");
                int userNumber=scanner.nextInt();
                while (userNumber<=0){
                    System.out.print("Enter number: ");
                    userNumber=scanner.nextInt();
                }
                if (userChoice==1){
                    System.out.println("The largest digit in "+userNumber+" is "+largestDigit(userNumber));
                }else if(userChoice==2){
                    if (secondSmallestDigit(userNumber)==10){
                        System.out.println(userNumber + " has no second smallest");
                    }else{
                        System.out.println("The second smallest digit in "+userNumber+" is "+secondSmallestDigit(userNumber));
                    }
                }else if(userChoice==3){
                    System.out.println("The number of even digits in "+userNumber+" is "+countEvenDigits(userNumber));
                }else{
                    if (hasLocalPeak(userNumber)==false){
                        System.out.println(userNumber + " has no local peak");
                    }else{
                        System.out.println(userNumber + " has a local peak");
                    }
                }
            } else {
                System.out.println("Invalid Choice!");
            }
            
        }
    }
}
