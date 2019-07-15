public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        int newVolume = this.volume - 10;
        this.volume = newVolume;
        if (this.volume < 0){
            this.volume = 0;
        }
    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }
}

