package Part2;

public class ShellSort {
    public static long sort(Comparable[] a, int[] H, boolean print) {
        long exchanges = 0;
        int N = a.length;

        for (int h : H) {
            if (h < 1 || h >= N) continue;

            for (int i = h; i < N; i++) {

                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                    exchanges++;
                    if (print){
                        IO.println(printAr(a));
                        IO.print("  ");
                        for(int l = 0; l < (j - h); ++l) IO.print("  ");
                        IO.print("^ ");
                        for(int l = 0; l < (h - 1); ++l) IO.print("  ");
                        IO.println("^ ");
                    }
                }
            }

        }

        return exchanges;
    }
    //helper
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    //helper
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static String printAr(Comparable[] a){

        String s = "[ ";
        for (var i : a) s = s + i + " ";
        s = s + "]";
        return s;
    }
}
