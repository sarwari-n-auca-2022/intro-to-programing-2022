import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int child1 = input.nextInt();
        int child2 = input.nextInt();

        int dif = child2 - child1;
        int child3 = child2 + dif;
        System.out.println(child3);
    }
}