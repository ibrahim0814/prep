/*

Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array. The Player class is provided in the editor below; it has two fields:

A string, .
An integer, .

Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.

*/

// Write your Checker class here

class Checker implements Comparator<Player> {

    // if x < y return negative
    //  if x == y return 0
    // if x > y return positive

    // this is the method the comparator uses
    // Checker.compare(a,b) with types Player
    public int compare(Player a, Player b){

        // if score is equal we want to compare names
        if(a.score == b.score){

            //use compareTo for strings
            return a.name.compareTo(b.name);

        } else{

            //ASK --- why is it b-a and not a-b?
            return b.score - a.score;
        }
    }
}

// each player has a name and a score (GIVEN)
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

// this basically scans in all the values -- main method (GIVEN)
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
