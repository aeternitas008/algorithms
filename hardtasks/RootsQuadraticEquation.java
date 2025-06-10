package hardtasks;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RootsQuadraticEquation {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String parts[] = reader.readLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = b * b - 4 * a * c;
        if (d < 0) {
            writer.write("0");
        } else if (d == 0) {
            writer.write("1\n");
            double x = -b / (2.0 * a);
            writer.write(String.format("%.6f", x));
        } else {
            writer.write("2\n");
            double x1 = (float) (-b - Math.sqrt(d)) / (2.0 * a);
            double x2 = (float) (-b + Math.sqrt(d)) / (2.0 * a);
            writer.write(String.format("%.6f %.6f", x1, x2));
        }

        reader.close();
        writer.flush();
        writer.close();
    }

}
