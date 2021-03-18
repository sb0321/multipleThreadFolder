package logic;

import java.util.ArrayList;
import java.util.List;

public class ThreadWrapper {

    private final List<Thread> threadList;

    public ThreadWrapper(int n, int m) {
        List<Thread> temp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            temp.add(new Thread(new MakeFileThread(m), "makeFileThread-" + i));
        }

        threadList = temp;
    }

    public void executeAll() {
        // 모든 스레드를 시작시킨다.
        for(Thread t : threadList) {
            t.start();
            System.out.println(t.getName() + " 시작");
        }
    }
}
