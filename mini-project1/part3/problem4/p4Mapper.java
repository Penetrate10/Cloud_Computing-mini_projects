package project1.part3;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class p4Mapper extends Mapper<LongWritable, Text, Text, IntWritable>{
    private Text outKey = new Text();
    private IntWritable outValue = new IntWritable(1);
    @Override
    protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        String line = value.toString();
        String[] parts = line.split(" ");
        String path = parts[0];
        outKey.set(path);
        context.write(outKey, outValue);
    }
}
