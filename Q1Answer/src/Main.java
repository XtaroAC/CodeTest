import java.util.Scanner; // import the Scanner class


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter No. of kids:");
        String N = input.nextLine();
        int n = Integer.parseInt(N);
//        if(n==0){  //Assume that non-negative integers are entered.I am lazy to validate with while-loop to ensure that non-negative integers must be entered.
//        }
//        if(n==1){
//        }
//        else if(n==2){
//            System.out.print(1+", "+2);
//        }
//        else {  //Assume that the type of input is integer.
//            System.out.print(1+", "+2+", Fizz");
//        }
        //Assume that non-negative integers are entered.I am lazy to validate with while-loop to ensure that non-negative integers must be entered.
        switch(n){
            case 0:
                System.out.print("There are no kids.");
                break;
            case 1:
                System.out.print(1);
                break;
            case 2:
                System.out.print(1+", "+2);
                break;
            default:
                System.out.print(1+", "+2+", Fizz");
        }
        int count = 4;
        boolean flag = false;
        while(count<=n){
            int [] temp = { count%3, count%5, count%7}; // Check whether the number is a multiple of 3, 5 or 7.
            System.out.print(", ");
            boolean space = false;//Check whether a space is needed for common multiples of 3, 5 and 7.
            for(int i=0;i<3;i++){
                if(temp[i]==0){
                         if (space){
                             System.out.print(" ");
                             space = false;
                         }
                        flag=true;
                        switch(i) {
                            case 0:
                                System.out.print("Fizz");
                                space=true;
                                break;
                            case 1:
                                System.out.print("Buzz");
                                space=true;
                                break;
                            default:
                                System.out.print("Woof");
                        }
                }
            }
            if(!flag)System.out.print(count);
            flag=false;
            count++;
         }
        }
}