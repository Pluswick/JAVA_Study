import java.io.*;
public class Tutoring_2 {
  public static void main(String[] args) throws NumberFormatException, IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int num = Integer.parseInt(br.readLine());

    if(num%2 == 0) {
        bw.write("CY");
    }
    else {
        bw.write("SK");
    }

    bw.flush();
    bw.close();
}
  
}
