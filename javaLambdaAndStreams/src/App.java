import java.util.*;

public class App {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        //Question-1
        ArrayList<Integer> numberList =new ArrayList<Integer>();
        System.out.println("How many integers do you want to enter :");
        int num=sc.nextInt();
        System.out.println("Enter your numbers:");
        for(int i=0;i<num;i++)
        {
            numberList.add(sc.nextInt());
        }
        System.out.println("Average of numbers is :- "+Average.calculateAverage(numberList));

        //Question-2
        ArrayList<String> stringList =new ArrayList<String>();
        System.out.println("How many strings do you want to enter :");
        int stringNum=sc.nextInt();
        System.out.println("Enter your strings:");
        for(int i=0;i<stringNum;i++)
        {
            stringList.add(sc.next());
        }
        System.out.println("List of all strings that start with 'a' and have exactly 3 letters:-");
        System.out.println(ExactlyThreeLetters.search(stringList));

        //Question-3
        ArrayList<String> stringList2 =new ArrayList<String>();
        System.out.println("How many strings do you want to enter :");
        int stringNum2=sc.nextInt();
        System.out.println("Enter your strings:");
        for(int i=0;i<stringNum2;i++)
        {
            stringList2.add(sc.next());
        }
        System.out.println("List of all palindrome strings :-");
        Palindrome.checkPalindrome(stringList2);
    }
}
