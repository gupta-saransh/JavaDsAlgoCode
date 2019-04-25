/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh
 */
public class MyGenericHashMap<K,V> {
    
    private class HMnode {

        K key;
        V value;

        HMnode(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }

    MyGenericHashMap() {
        initBuckets(4);
        size = 0;

    }

    private LinkedList<HMnode>[] buckets; //N
    private int size;  //n

    private void initBuckets(int nob) {     //No. of buckets

        buckets = new LinkedList[nob];
        for (int i = 0; i < buckets.length; i++) {

            buckets[i] = new LinkedList<>();

        }

    }

    private int findWithinBuckets(K key, int bi) {
        for (int di = 0; di < buckets[bi].size(); di++) {
            HMnode node = buckets[bi].get(di);
            if (node.key.equals(key)) {

                return di;
            }

        }
        return -1;

    }

    private int hashFn(K key) {

        int hc = key.hashCode();
        int bi = Math.abs(hc) % buckets.length;
        return bi;

    }

    private void reHash() {
        LinkedList<HMnode>[] buckets2 = buckets; //N
        buckets = new LinkedList[buckets2.length * 2];
        size = 0;
        for (int i = 0; i < buckets.length; i++) {

            buckets[i] = new LinkedList<>();

        }

        for (int i = 0; i < buckets2.length; i++) {

            for (int j = 0; j < buckets2[i].size(); j++) {
                HMnode node = buckets2[i].get(j);

                int bi = hashFn(node.key);
                int found = findWithinBuckets(node.key, bi);
                buckets[bi].add(node);
                size++;

            }

        }

    }

    public void put(K key, V value) {
        int bi = hashFn(key);
        int found = findWithinBuckets(key, bi);
        if (found == -1) {
            HMnode node = new HMnode(key, value);
            node.key = key;
            node.value = value;
            buckets[bi].add(node);
            size++;

        } else //update
        {

            HMnode node = buckets[bi].get(found);
            node.value = value;

        }
        double lambda = size * 1.0 / buckets.length;
        if (lambda > 2.0) {
            reHash();

        }

    }

    public V get(K key) {
        int bi = hashFn(key);
        int found = findWithinBuckets(key, bi);

        if (found == -1) {

            return null;
        } else {

            HMnode node = buckets[bi].get(found);
            return node.value;
        }

    }

    public boolean containsKey(K key) {
        int bi = hashFn(key);
        int found = findWithinBuckets(key, bi);

        if (found == -1) {

            return false;
        } else {

            return true;
        }

    }

    public V remove(K key) {
        int bi = hashFn(key);
        int found = findWithinBuckets(key, bi);

        if (found == -1) {
            return null;
        } else {

            HMnode node = buckets[bi].get(found);
            buckets[bi].remove(found);
            size--;
            return node.value;
        }
    }

    public ArrayList<K> keySet() {
        ArrayList<K> list = new ArrayList<>();
        for (int i = 0; i < buckets.length; i++) {

            for (int j = 0; j < buckets[i].size(); j++) {
                list.add(buckets[i].get(j).key);

            }

        }
        return list;
    }

    public void display() {
        System.out.println("--------------------------");
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket[" + i + "]->");
            for (int j = 0; j < buckets[i].size(); j++) {
                //if(buckets[i].get(j))
                System.out.print("(" + buckets[i].get(j).key + " @ " + buckets[i].get(j).value + ")" + ", ");

            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    
    public static void main(String args[]) {
        MyGenericHashMap obj = new MyGenericHashMap();
        obj.put("A",1);
        obj.put("B",2);
        obj.put("C",3);
        obj.put("D",4);
        obj.put("E",5);
        obj.display();

        //obj.remove(3);
        //System.out.print(obj.get(5));
//        obj.put(6, "F");
//        obj.put(7, "G");
//        obj.put(8, "H");
//        obj.display();
//        obj.put(9, "I");
//        obj.put(10, "J");
//
//        obj.display();
//        obj.put(11, "I");
//        obj.put(12, "K");
//        obj.put(13, "L");
//        obj.put(14, "M");
//        obj.put(15, "N");
//        obj.put(16, "O");
//        obj.display();
//        obj.put(17, "P");
        //obj.display();
        //System.out.print(obj.keySet());

    }

}

