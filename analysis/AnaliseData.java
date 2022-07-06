// https://morioh.com/p/8628150eefde
//
import java.io.BufferedReader;
import java.io.FileReader;

public class AnaliseData {
    public static void main(String[] args) {
       int first;
       double second, sumSecond = 0.0;
       String s = "";
       int n = 0;
       String file = "data.txt";
       String line;

       try {
           s = args[0];
       } catch (Exception e) {
           System.out.println("The first argument must be present!");
           System.exit(1);
       }

       try {
           n = Integer.parseInt(args[0]);
       } catch (NumberFormatException e) {
           System.out.println("The second argument must be an integer.");
           System.exit(1);
       }


        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while((line = br.readLine()) != null){
//              For diagnostics only
//                System.out.println(line);
                String[] arrOfStr = line.split(",");
                  first = Integer.parseInt(arrOfStr[0]);
                  if (first == n) {
                    second = Double.parseDouble(arrOfStr[1]);
                    sumSecond += second;
//              For diagnostics only
//                    System.out.println(" " + first + " == " + second);
//                    System.out.println(args[0] + " , " + sumSecond);
                  }
            }
            System.out.println(args[0] + " , " + sumSecond);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
