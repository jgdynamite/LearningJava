package joglover.wordcount;


import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.SequenceFileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.hadoop.mapreduce.lib.input.NLineInputFormat;


public class wordcount extends Configured implements Tool{

    Logger logger = LoggerFactory.getLogger(wordcount.class);

    public static void main(String[] args) throws Exception{
        int exitCode = ToolRunner.run(new wordcount(), args);
        System.exit(exitCode);

    }

    public int run(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.printf("Usage: %s [generic options] <input> <output>\n",
                    getClass().getSimpleName());
            ToolRunner.printGenericCommandUsage(System.err);
            return -1;
        }

        Job job = new org.apache.hadoop.mapreduce.Job();
        job.setJarByClass(wordcount.class);
        job.setJobName("WordCounter");
        logger.info("Input path " + args[0]);
        logger.info("Oupput path " + args[1]);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));

        job.setNumReduceTasks(2);

        job.setPartitionerClass(wordcountPartitioner.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        //Set output format to SequenceFileOutputFormat
      //  job.setOutputFormatClass(SequenceFileOutputFormat.class);
        job.setMapperClass(wordcountMapper.class);
        job.setReducerClass(wordcountReducer.class);


        int returnValue = job.waitForCompletion(true) ? 0:1;
        System.out.println("job.isSuccessful " + job.isSuccessful());
        return returnValue;
    }

}
