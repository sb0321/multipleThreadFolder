import Logic.ThreadWrapper;

public class Main {

    public static void main(String[] args) {

        int n, m;

        if (args.length == 0) {
            n = m = 0;
        } else {
            n = Integer.parseInt(args[0]);
            m = Integer.parseInt(args[1]);
        }

        ThreadWrapper threadWrapper = new ThreadWrapper(n, m);

        threadWrapper.executeAll();
    }
}
