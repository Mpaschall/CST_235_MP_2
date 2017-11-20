package beans;

import java.io.Serializable;

public class Storage_Bean implements Serializable{
    private int videoQuality;
    private int runTime;
    private int transRate;
    private double videoSpace;
    
    public int getVideoQuality() {
        return videoQuality;
    }

    public int getRunTime() {
        return runTime;
    }

    public int getTransRate() {
        return transRate;
    }

    public void setVideoQuality(int videoQuality) {
        this.videoQuality = videoQuality;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public void setTransRate(int transRate) {
        this.transRate = transRate;
    }

    public double getVideoSpace() {
        return videoSpace;
    }

    public void setVideoSpace(double videoSpace) {
        this.videoSpace = videoSpace;
    }

    public Storage_Bean() {
    }

    public Storage_Bean(int videoQuality, int runTime, int transRate, double videoSpace) {
        this.videoQuality = videoQuality;
        this.runTime = runTime;
        this.transRate = transRate;
        this.videoSpace = videoSpace;
    }

    
    
}


