import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> solution(int[][] data, String ext, int val_ext, String sort_by) {
 
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int simbol = 0;
        int sort   = 0;
        int count  = 0;
        switch(ext) {
            case "code"     : simbol = 0;
                break;
            case "date"     : simbol = 1;
                break;
            case "maximum"  : simbol = 2;
                break;    
            case "remain"   : simbol = 3;
                break;    
        }
            //System.out.println(simbol);
         switch(sort_by) {
            case "code"     : sort = 0;
                break;
            case "date"     : sort = 1;
                break;
            case "maximum"  : sort = 2;
                break;    
            case "remain"   : sort = 3;
                break;    
        }
           //System.out.println(sort);
        
        for(int i = 0; i < data.length; i++) {
              if(data[i][simbol] < val_ext) {                    
                  ArrayList<Integer> firstArr = new ArrayList<>();
                  for(int j = 0; j < data[0].length; j++) {
                       firstArr.add(data[i][j]);
                     // System.out.println("반복횟수" + data[i][j]);
                  }
                 list.add(firstArr);
               }
            }
        
        ArrayList<Integer> intArr = new ArrayList<>();
        
        for(int l = 0; l < list.size(); l++) {
            intArr.add(list.get(l).get(sort));    
        }
        
        //담은 remain값을 오름차순 정렬을 해주고 
        Collections.sort(intArr);
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        for(int s = 0; s < intArr.size(); s++) {
            //s = 0인채로
            //s = 1인채로
            for(int e = 0; e < list.size(); e++) {
                if(intArr.get(s) == list.get(e).get(sort)) {
                    System.out.println("s" + s);
                    System.out.println("e" + e);
                    answer.add(s , list.get(e));
                }
            }  
        }
            return answer;            
        }
                        
}