/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount_lab1;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 *
 * @author pratik
 */
public class WordCount_Reducer extends Reducer<Text,IntWritable,Text,IntWritable>{
    
    private IntWritable result = new IntWritable();

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException {
       // super.reduce(key, values, context); //To change body of generated methods, choose Tools | Templates.
        int sum = 0;
        for(IntWritable val:values){
            sum +=val.get();
        }
        
        result.set(sum);
        context.write(key, result);
        
    }
    
    
}