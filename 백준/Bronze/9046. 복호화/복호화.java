import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int a = 0; a < T; a++) {
         //1. replaceAll해서 공백 없애고 toCharArray로 문자열 받기 
        String str = br.readLine().replaceAll(" ", "");
        Map<Character, Integer> charMap = new HashMap<>();
        
        //2. 배열 개수만큼 반복 돌리면서, 키 값에 charArray의 값 하나씩 넣고 벨류값을 + 1 혹은 default 사용 
        int maxValue = 0;
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            charMap.put(c , charMap.getOrDefault(c , 0) + 1);
            
            if(charMap.get(c) > maxValue) {
                maxValue = charMap.get(c);
            }
        }
        
        //3. MaxValue를 0으로 두고 키 값 반복 돌리면서 빈도수 비교 
        int maxCount = 0;
        Character maxChar = '?';
        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if(charMap.get(entry.getKey()) == maxValue) {
                maxCount++;
                maxChar = entry.getKey();
            } 
        }
        
       
        //4. 비교해서 나온 Max 키값 저장하고 그 값이면
        if(maxCount > 1) {
            System.out.println('?');
        }else {
             System.out.println(maxChar);
        }
       }
        
        
    }
}