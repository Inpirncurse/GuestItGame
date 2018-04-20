public class Factory{

    private static Factory instance;

    private Factory(){
    }

    public static Factory getInstance(){
        if(instance==null){
            instance= new Factory();
        }
        return instance;
    }

    public GameState createState(String tag){
        if(tag.equalsIgnoreCase("start")){
            return new GameStateStart();
        }
        if(tag.equalsIgnoreCase("load")){
            return new GameStateLoad();
        }
        if(tag.equalsIgnoreCase("playerOne")){
            return new PlayerOne();
        }
        if(tag.equalsIgnoreCase("playerTwo")){
            return new PlayerTwo();
        }
        if(tag.equalsIgnoreCase("over")){
            return new GameStateOver();
        }
        if(tag.equalsIgnoreCase("winOne")){
            return new GameStateWin(1);
        }
        if(tag.equalsIgnoreCase("winTwo")){
            return new GameStateWin(2);
        }
        return null;
    }

}
