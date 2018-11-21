package cn.com;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class MyUDF extends UDF{
    public Text evaluate(Text text){
        text.set(text.toString().toUpperCase());
        return text;
    }
}
