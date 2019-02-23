import java.util.Scanner; // import the Scanner class for user input

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Assume that the types of coins are entered in ascending order according to values.
        System.out.print("Types of coin: ");
        String N = input.nextLine();
        System.out.print("Amount: ");
        String Amount = input.nextLine();
        int amount = Integer.parseInt(Amount);
//      Convert a string into an integer array,modified from https://stackoverflow.com/questions/7646392/convert-string-to-int-array-in-java
        String[] coins = N.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
        int[] typeofcoin = new int[coins.length];
        for (int i=0; i<coins.length; i++) {
                typeofcoin[i] = Integer.parseInt(coins[i]);
        }
        System.out.println(combination(typeofcoin,amount,0));
    }
    private static boolean combination(int[] type,int amount, int pos) {
        int len=type.length;
        int remainder = amount % type[pos];
        if (remainder == 0) return true;
        if(pos==len-1) return false;
        return remainder >= type[pos++] && combination(type, remainder, pos);
    }
}

