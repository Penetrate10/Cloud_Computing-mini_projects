package project1.part2;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class part2Mapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    private Text outKey = new Text();
    private IntWritable outValue = new IntWritable(1);
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        String line = value.toString();
        // 获取n-gram
        String ngram_str = context.getConfiguration().get("ngram");
        int ngram = Integer.parseInt(ngram_str);
        // int ngram = 2;
        String[] words = line.split(" ");
        String strLine = "";
        for(String word: words){
            strLine += word;
        }

        for(int i = 0; i < strLine.length(); i++){
            if(i + ngram > strLine.length())
                break;

            String temp = "";
            for(int j = 0; j < ngram; j++) {
                temp += String.valueOf(strLine.charAt(i + j));
            }
            // 封装outKey
            outKey.set(temp);
            // 写出
            context.write(outKey, outValue);
        }
    }
}
