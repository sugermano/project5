package project5;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch() {
    	startTime=0;
    }
    public void setStartTime(long newStartTime) {
    	startTime=newStartTime;
    }
    public void setEndTime(long newEndTime) {
    	endTime=newEndTime;
    }
    public long getStartTime() {
    	return startTime;
    }
    public long getEndTime() {
    	return endTime;
    }
    public void start() {
    	Date dt=new Date();
    	startTime=dt.getTime();
    }
    public void stop() {
    	Date dt=new Date();
    	endTime=dt.getTime();
    }
    public long getElapsedTime() {
    	long elapsedTime;
    	elapsedTime=getEndTime()-getStartTime();
    	return elapsedTime;
    }
}
