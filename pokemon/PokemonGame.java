public class PokemonGame{
    public static void main(String[] args){
        System.out.println("Hello Pokemon");
        Trainer t = new Trainer("Player1");
        // MainGame mg = new MainGame(t);
        t.play();
        System.out.println("End Pokemon Game");
    }
}