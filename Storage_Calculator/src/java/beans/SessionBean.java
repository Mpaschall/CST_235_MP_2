package beans;

import Interfaces.SessionBeanLocal;
import beans.Storage_Bean;
import javax.ejb.Stateless;

@Stateless
public class SessionBean implements SessionBeanLocal {

    private double multStorage;
    private double storage;
    private int videos;

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public double getMultStorage() {
        return multStorage;
    }

    public void setMultStorage(double multStorage) {
        this.multStorage = multStorage;
    }
    //creates method to calculate storage with multiple videos
    @Override
    public void allStorage() {
        multStorage = storage * videos;
    }
}
