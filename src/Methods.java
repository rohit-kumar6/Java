public class Methods {

    // methods overloading
    // Same method definition with different parameters

    public static void main(String args[]){
        calculateScore("Tim",500);
        calculateScore(1000);
    }

    public static void calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score);
    }

    public static void calculateScore(int score){
        System.out.println("Unnamed player scored " + score);
    }
}
