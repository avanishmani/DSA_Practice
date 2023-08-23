package Tree;
//Given an array arr containing N words consisting of lowercase characters. Your task is to find the most frequent word in the array. If multiple words have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency.
//
//Input:
//N = 5
//arr[] = {geeks,for,geeks,hello,world}
//Output: geeks

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Alphavima {
    public static void main(String[] args) {
        String arr[] = {"geeks","for","geeks","hello","world"};
        LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
        for(String st: arr){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        System.out.println(map);
        int max=-1;
        String ans=null;
       for(String k:map.keySet()){
          int z=map.get(k);
          if(z>max){
              max=z;
              ans=k;
          }

       }
        System.out.println(ans);
        }

    }

