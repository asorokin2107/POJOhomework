public class Computer {

    private int videoMemory;
    private int cpuMemory;
    private int ssdMemory;

    public Computer(int videoMemory, int cpuMemory) {
        this.videoMemory = videoMemory;
        this.cpuMemory = cpuMemory;
    }

    public int getVideoMemory() {
        return videoMemory;
    }

    public void setVideoMemory(int videoMemory) {
        this.videoMemory = videoMemory;
    }

    public int getCpuMemory() {
        return cpuMemory;
    }

    public void setCpuMemory(int cpuMemory) {
        this.cpuMemory = cpuMemory;
    }

    public int getSsdMemory() {
        return ssdMemory;
    }

    public void setSsdMemory(int ssdMemory) {
        this.ssdMemory = ssdMemory;
    }
}
