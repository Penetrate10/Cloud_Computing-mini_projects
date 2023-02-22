# Part 1:

1. Make sure docker is properly installed.
2. Run the CMD console in the directory where the code is located.
3. Run "docker build -t hadoop:part1"
4. Run "docker run -it hadoop:part1"
5. Now you can see the word count results in the console for the self-contained file core-site.xml

Source code include:
> Dockerfile
> core-site.xml
> hdfs-site.xml
> mapred-site.xml
> yarn-site.xml
> hadoop-env.sh
> bootstarp.sh

# Part 2:

1. Make sure Hadoop is properly installed and set in server.
2. Make a jar package based on all source code in "source_code/part2"
3. Put the jar package to the server (Assume path is "~/")
4. Run Hadoop: "~/hadoop/sbin/start-all.sh"
5. Run "hadoop jar ~/project1/project1.jar  project1.part2.part2Driver /input/part2 /output/part2_result_n2 2" (The first parameter indicate the path of the input file, the second parameter indicate the path of the output file. If you want to run our program in server, you need to change the second parameter, because “/output2” is already existed. The third parameter is the n-gram.)
6. See result "hdfs dfs -cat /output/part2_result_n2/part-r-00000" 

Source code in "part2"

# Part 3:

Problem1:
1. Make sure Hadoop is properly installed and set in server.
2. Make a jar package based on all source code in "source_code/part3"
3. Run Hadoop: "~/hadoop/sbin/start-all.sh"
4. Run "hadoop jar ~/project1/project1.jar  project1.part3.p1Driver /input/part3 /output/part3_p1_result"  (The first parameter indicate the path of the input file, the second parameter indicate the path of the output file. If you want to run our program in server, you need to change the second parameter, because “/output/part3_p1_result” is already existed.)
5. See result "hdfs dfs -cat /output/part3_p1_result/part-r-00000"

Problem2:
1. Make sure Hadoop is properly installed and set in server.
2. Make a jar package based on all source code in "source_code/part3"
3. Run Hadoop: "~/hadoop/sbin/start-all.sh"
4. Run "hadoop jar ~/project1/project1.jar  project1.part3.p2Driver /input/part3 /output/part3_p2_result"  (The first parameter indicate the path of the input file, the second parameter indicate the path of the output file. If you want to run our program in server, you need to change the second parameter, because “/output/part3_p2_result” is already existed.)
5. See result "hdfs dfs -cat /output/part3_p2_result/part-r-00000"

Problem3:
1. Make sure Hadoop is properly installed and set in server.
2. Make a jar package based on all source code in "source_code/part3"
3. Run Hadoop: "~/hadoop/sbin/start-all.sh"
4. Run "hadoop jar ~/project1/project1.jar  project1.part3.p3Driver /input/part3 /output/part3_p3_result"  (The first parameter indicate the path of the input file, the second parameter indicate the path of the output file. If you want to run our program in server, you need to change the second parameter, because “/output/part3_p3_result” is already existed.)
5. See result "hdfs dfs -cat /output/part3_p3_result/part-r-00000"

Problem4:
1. Make sure Hadoop is properly installed and set in server.
2. Make a jar package based on all source code in "source_code/part3"
3. Run Hadoop: "~/hadoop/sbin/start-all.sh"
4. Run "hadoop jar ~/project1/project1.jar  project1.part3.p4Driver /input/part3 /output/part3_p4_result"  (The first parameter indicate the path of the input file, the second parameter indicate the path of the output file. If you want to run our program in server, you need to change the second parameter, because “/output/part3_p4_result” is already existed.)
5. See result "hdfs dfs -cat /output/part3_p4_result/part-r-00000"

Source code in "part3"


