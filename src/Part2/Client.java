package Part2;

public class Client {

    static void main() {
        Character[] a = {'S', 'H', 'E', 'L', 'L', 'S', 'O' ,'R', 'T', 'R', 'O', 'C', 'K'};

        IO.println("For h [10, 4, 1]");
        long ex = ShellSort.sort(a.clone(), new int[]{10, 4, 1}, false);
        IO.println("Exchanges: " + ex + "\n");


        IO.println("For h [12, 7, 3, 1]");
        ex = ShellSort.sort(a.clone(), new int[]{12, 7, 3, 1}, false);
        IO.println("Exchanges: " + ex + "\n");

        IO.println("For h [12, 10, 7, 5, 3, 1]");
        ex = ShellSort.sort(a.clone(), new int[]{12, 10, 7, 5, 3, 1}, false);
        IO.println("Exchanges: " + ex + "\n");
    }
}
