package u_Aggregation;

public class Car {

    private String name;

    private MusicPlayer player;

    public Car(String name, MusicPlayer player){
        this.name=name;
        this.player=player;
    }

    public String getName(){
        return name;
    }

    public void startPlayer(){
        player.start();
    }

    public void stopPlayer(){
        player.stop();
    }











}
