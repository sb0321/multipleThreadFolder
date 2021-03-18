package util;

import java.io.*;

public class FileOutputStreamUtil {

    private final String THREAD_NAME;
    private static final String DIR_PROPERTY = "user.dir";
    private static final String FOLDER = "/folder/";
    private final String ROOT;

    public FileOutputStreamUtil(String name) {
        this.THREAD_NAME = name;
        ROOT = System.getProperty(DIR_PROPERTY) + FOLDER;
        System.out.println(ROOT);
    }

    public void makeDirIfDoesNotExist() {

        File root = new File(ROOT);

        File d = new File(ROOT + THREAD_NAME);

        if (!root.isDirectory() && root.mkdir()) {
            System.out.println("경로 생성: " + root.toPath());
        }

        if(!d.isDirectory() && d.mkdir()) {
            System.out.println(THREAD_NAME + " 쓰레드의 폴더 생성: " + d.toPath());
        }
    }

    public void makeFile(String name) {

        String fileName = name + ".txt";

        try {
            FileWriter fileWriter = new FileWriter(ROOT + THREAD_NAME + "/" + fileName);
            fileWriter.write(name);

            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
