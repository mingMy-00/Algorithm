import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
         HashMap<String, Double> map = new HashMap<>();
         map.put("A+" , 4.5);
         map.put("A0" , 4.0);
         map.put("B+" , 3.5);
         map.put("B0" , 3.0);
         map.put("C+" , 2.5);
         map.put("C0" , 2.0);
         map.put("D+" , 1.5);
         map.put("D0" , 1.0);
         map.put("F"  , 0.0);
        
         Double sumScore = 0.0;
         Double sumScoreAndAverage = 0.0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         for(int i = 0; i < 20; i++) {
             String score[] = br.readLine().split(" ");
             if(!score[2].equals("P")) {
                 sumScore += Double.parseDouble(score[1]);
                 sumScoreAndAverage += (Double.parseDouble(score[1]) * map.get(score[2]));
             }
         }
        
         System.out.println(sumScoreAndAverage / sumScore);
    }
}