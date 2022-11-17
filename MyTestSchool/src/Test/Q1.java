package Test;

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      double arr[] = new double[n];
      double sum = 0;
      for(int i = 0; i < n; i++) {
         arr[i] = Double.parseDouble(br.readLine());
      }
      Arrays.sort(arr);
      double max = arr[n-1];
      for(int i = 0; i < arr.length; i++) {
         sum += arr[i]/max*100;
      }
      double avg = sum / n;
      System.out.printf("%.2f", avg);
      br.close();
   }                        
}