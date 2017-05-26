package com.goldmsg;


import java.io.File;
import java.util.Date;

/**
 * 删除D:/server/tem文件夹所有所有超时的文件。
 * 获取D:/server/tem下的所
 * */
public class ScheduleJob implements Runnable {

    final String basePath = "D:/server/tem";

    public ScheduleJob() {
    }

    public void run() {
        /**
         *run（）一定要破获第一层异常，如果任何异常没有处理将会终止循环作业！！！！（重要）
         * */
        try {
            File file = new File(basePath);
            showAllFiles(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllFiles(File dir) {
        File[] fs = dir.listFiles();//获取文件夹下所有文件
        try {
            for (int i = 0; i < fs.length; i++) {
                System.out.println(fs[i].getAbsolutePath());//文件绝对路径
                if (fs[i].getAbsolutePath().contains("_")) {
                    String url = fs[i].getAbsolutePath().substring(fs[i].getAbsolutePath().lastIndexOf("\\") + 1, fs[i].getAbsolutePath().indexOf("_"));
                    Date d = new Date(Long.parseLong(url));
                    Long a = new Date().getTime() - d.getTime();
                    int hour = (int) (a / 1000 / 60 / 60);
                    if (!fs[i].isDirectory() && hour > 1) {//当前不是文件夹和临时文件超过一小时则删除
                        File file = new File(fs[i].getAbsolutePath());
                        file.delete();
                    }

                    if (fs[i].isDirectory()) {//如果有文件夹进入文件夹内
                        try {
                            showAllFiles(fs[i]);//
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }

}
