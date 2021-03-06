/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3_assignment4;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Writable;

/**
 *
 * @author pratik
 */
public class MedianSD implements Writable{

    private double median;
    private double stdDev;

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public double getStdDev() {
        return stdDev;
    }

    public void setStdDev(double stdDev) {
        this.stdDev = stdDev;
    }
   
    
    @Override
    public void write(DataOutput d) throws IOException {
        d.writeDouble(median);
        d.writeDouble(stdDev);
    }

    @Override
    public void readFields(DataInput di) throws IOException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       median = di.readDouble();
       stdDev = di.readDouble();
    
    }

    @Override
    public String toString() {
        return ("median:"+this.median+" Standard Deviation:"+this.stdDev); //To change body of generated methods, choose Tools | Templates.
    }
}
