package joglover.wordcount;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class wordcountReducer extends Reducer<Text, IntWritable, Text, IntWritable>{
    Logger logger = LoggerFactory.getLogger(wordcountReducer.class);

    @Override
    protected void reduce(Text key, Iterable<IntWritable> values,
                          Context context)
            throws IOException, InterruptedException {
        logger.debug("Entering wordcountReducer.reduce() " + this);

        int sum = 0;
        Iterator<IntWritable> valuesIt = values.iterator();
        while(valuesIt.hasNext()){
            sum = sum + valuesIt.next().get();
        }
        logger.debug(key + " -> " + sum);
        context.write(key, new IntWritable(sum));
        logger.debug("Exiting wordcountReducer.reduce()");
    }


}