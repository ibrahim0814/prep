//Implement a trie tree with insert, search word, and search prefix functionality

//There are a lot of tiny details here that you need to remember
//I'll break it down by Node and the 3 methods

//Node class:
//The array is a pointer to other Nodes!
//Have a variable for the letter itself and if its the end of a word
//Need to have a constructor for each node. I made it so that it takes the letter as the argument.
//Within the constructor, you need to set the array = new Node[26] as well as assign the letter

class Node{
    Node[] array;
    char letter;
    boolean endOfWord;
    Node(char let){
        array = new Node[26];
        letter = let;
    }
}

public class Trie {

    private Node root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new Node('r');

    }

    /** Inserts a word into the trie. */
    //Things to remember:
    //Use a copy of the root node to iterate over the word
    //Use the .charAt() method to access individual characters, looks cleaner
    //Yes, you can access the array within the node like this (copy.array)[index]
    //At the end, make sure you assign endOfWord boolean to true
    //Also, remember that the index we're trying to access is whatever char we're currently looking at minus 'a'
    public void insert(String word) {

        Node copy = root;
        for(int i = 0; i<word.length(); i++){

            int index = word.charAt(i)-'a';
            if((copy.array)[index] == null){
                (copy.array)[index] = new Node(word.charAt(i));
            }
            copy= (copy.array)[index];
        }
        copy.endOfWord = true;

    }

    /** Returns if the word is in the trie. */
    //Pretty straighforward, loop through and check to see if the element is not null
    //At the end, make sure you check to see if its actually the end of the word
    public boolean search(String word) {

        Node copy = root;
        for(int i =0; i<word.length(); i++){
            int index = word.charAt(i)-'a';
            if((copy.array)[index]==null){
                return false;
            }
            copy = (copy.array)[index];
        }
        return copy.endOfWord;

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    //Also straighforward
    //If we get out of the for loop, we know its a prefix. Do not need to check if its the end of the word.
    public boolean startsWith(String prefix) {

        Node copy = root;
        for(int i =0; i<prefix.length(); i++){
            int index = prefix.charAt(i)-'a';
            if((copy.array)[index]==null){
                return false;
            }
            copy = (copy.array)[index];
        }
        return true;

    }
}
