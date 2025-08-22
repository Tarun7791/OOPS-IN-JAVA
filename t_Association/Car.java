package t_Association;

public class Car {

    Engine engine=new Engine();
    Musicplayer player=new Musicplayer();

    public void startEngine(){
        engine.start();
    }

    public void startPlayer(){
        player.play();
    }




}
