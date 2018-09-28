package com.hong.mapreduce;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;

/**
 * Created by caihongwei on 2018/9/19 9:51.
 */
public class Excise {
    public static void main(String[] args) throws IOException {
        String uri = "hdfs://s2:9000/";
        Configuration config = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(uri), config);

        // 列出hdfs上的/user/hadoop/input目录下的所有文件和目录
        FileStatus[] statuses = fs.listStatus(new Path("/user/hadoop/input"));
        for (FileStatus status : statuses) {
            System.out.println(status);
        }
    }
}
