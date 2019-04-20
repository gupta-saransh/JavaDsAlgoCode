/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextProcessing;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Saransh
 */
public class Trie {

    static class Node {

        char data;
        boolean eow = false;
        HashMap<Character, Node> cmap = new HashMap<>();

        Node(char data, boolean eow) {
            this.data = data;
            this.eow = eow;
        }

    }

    void addWord(Node root, String word) {
        if (word.length() == 0) {
            root.eow = true;
            return;
        }
        char ch = word.charAt(0);
        String ros = word.substring(1);
        if (root.cmap.containsKey(ch) == false) {
            Node child = new Node(ch, false);
            root.cmap.put(ch, child);
            addWord(child, ros);
        } else {
            Node child = root.cmap.get(ch);
            addWord(child, ros);

        }

    }

    void displayWord(Node root, String wsf) {

        if (root.eow == true) {
            System.out.println(wsf);
            //return;                                   -----------> Removed to traverse lower elements

        }
        ArrayList<Character> keys = new ArrayList<>(root.cmap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            Character Key = keys.get(i);
            Node child = root.cmap.get(Key);
            displayWord(child, wsf + Key);

        }

    }

    boolean searchWord(Node root, String word) {
        if (word.length() == 0) {

            if (root.eow == true) {
                return true;
            } else {
                return false;
            }
        }
        char ch = word.charAt(0);
        String ros = word.substring(1);
        boolean var = true;

        if (root.cmap.containsKey(ch) == false) {
            return false;
        } else {
            Node child = root.cmap.get(ch);
            var = searchWord(child, ros);

            return var;
        }

    }

    void displayTrie(Node root) {
        String s = root.data + "->";
        ArrayList<Character> keys = new ArrayList<>(root.cmap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            Character Key = keys.get(i);
            s += Key + ",";

        }
        System.out.println(s + ".");
        for (int i = 0; i < keys.size(); i++) {
            Character Key = keys.get(i);
            Node child = root.cmap.get(Key);
            displayTrie(child);
        }
    }

    void removeWord(Node root, String word) {
        if (searchWord(root, word) == false) {
            System.out.println("Word Doesn't Exist");
        } else {
            if (word.length() == 0) {
                root.eow = false;
                return;

            }
            char ch = word.charAt(0);
            String ros = word.substring(1);

            Node child = root.cmap.get(ch);
            removeWord(child, ros);
            if (child.cmap.size() == 0 && child.eow == false) {         //Post Area
                root.cmap.remove(ch);
            }

        }

    }

    public static void main(String args[]) {

        Trie obj = new Trie();
        Node root = new Node('$', false);
        obj.addWord(root, "are");
        obj.addWord(root, "art");
        obj.addWord(root, "an");
        obj.addWord(root, "and");
        obj.addWord(root, "ant");
        obj.addWord(root, "as");
        obj.addWord(root, "ask");
        obj.addWord(root, "see");
        obj.addWord(root, "sea");
        obj.addWord(root, "seen");
        obj.removeWord(root,"as");
        obj.displayTrie(root);
        System.out.println("-------------------------------");
        obj.removeWord(root,"as");
        obj.displayTrie(root);
        //obj.displayWord(root, "");
        //System.out.print(obj.searchWord(root, "sea"));
        //obj.displayTrie(root);

    }

}
