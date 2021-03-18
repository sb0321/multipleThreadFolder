package Logic;

import util.FileOutputStreamUtil;

public class MakeFileThread implements Runnable {
    private int count;

    public MakeFileThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {

        FileOutputStreamUtil fo = new FileOutputStreamUtil(Thread.currentThread().getName());
        fo.makeDirIfDoesNotExist();

        for (int i = 0; i < count; i++) {
            fo.makeFile(Thread.currentThread().getName() + "-" + i);
        }
        System.out.println(Thread.currentThread().getName() + " 끝남");

    }
}
