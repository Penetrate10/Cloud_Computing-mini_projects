package project1.part3;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.LinkedList;

public class p4Reducer extends Reducer<Text, IntWritable, Text, IntWritable> {
    private Text outKey = new Text();
    private IntWritable outValue = new IntWritable();
    private LinkedList<Integer> max_value = new LinkedList<>();
    private LinkedList<String> max_key = new LinkedList<>();
    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        int sum = 0;
        for (IntWritable value : values){
            sum += value.get();
        }
        if (max_value.size() == 0){
            max_key.add(key.toString());
            max_value.add(sum);
        } else {
            if (max_value.get(0) < sum){
                max_value.clear();
                max_key.clear();
                max_key.add(key.toString());
                max_value.add(sum);
            } else if (max_value.get(0) == sum){
                max_key.add(key.toString());
                max_value.add(sum);
            }
        }
    }

    @Override
    protected void cleanup(Reducer<Text, IntWritable, Text, IntWritable>.Context context) throws IOException, InterruptedException {
        for (int i = 0; i < max_key.size(); i++) {
            outKey.set(max_key.get(i));
            outValue.set(max_value.get(i));
            context.write(outKey, outValue);
            System.out.println(max_key.get(i));
            System.out.println(max_value.get(i));
        }
    }
}
