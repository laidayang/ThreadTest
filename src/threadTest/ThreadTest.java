package threadTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Creat By laiyang at 2018/12/19
 */
public class ThreadTest {


    public static void main(String[] args){

        //TestThread testThread = new TestThread(2018,12,18,14,13,2);
        //testThread.start();

        new Test02().print((i,m) -> "" + i + " " + m);

        List<String> li = new ArrayList<>();


    }


}

class TestThread extends Thread{
    int year = 0;
    int month = 0;
    int day = 0;
    int hour = 0;
    int min = 0;
    int second = 0;

    public TestThread(int year, int month, int day, int hour, int min, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.min = min;
        this.second = second;
    }

    @Override
    public void run() {

            for (int a =year; a < 2024; a ++) {
                for (int b = month; b <= 12; b++) {
                    for (int c = day; c <= 30; c++) {
                        for (int d = hour; d <= 24; d++) {
                            for (int e = min; e <= 60; e++) {
                                for (int f = second; f <= 60; f++) {
                                    System.out.println("当前时间为：" + a + ":" + b +":" + c +":" + d +":" + e + ":" + f);

                                    /**
                                     * 睡眠
                                     */
                                    try {
                                        Thread.sleep(1000);
                                    } catch (InterruptedException e1) {
                                        e1.printStackTrace();
                                    }

                                }
                            }
                        }
                    }
                }
            }



    }
}
