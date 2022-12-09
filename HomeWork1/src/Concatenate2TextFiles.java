import java.io.*;

    public class Concatenate2TextFiles {
        public static void main(String[] args) throws IOException {
            Concatenate2TextFiles concatenate2TextFiles = new Concatenate2TextFiles();
            concatenate2TextFiles.concatenate2textfiles();
        }
        void concatenate2textfiles() throws IOException {
            PrintWriter file0 = new PrintWriter("file0.txt");

            BufferedReader file1 = new BufferedReader(new FileReader("file1.txt"));

            String line = file1.readLine();

            while (line != null)
            {
                file0.println(line);
                line = file1.readLine();
            }
            file1 = new BufferedReader(new FileReader("file2.txt"));

            line = file1.readLine();

            while (line != null)
            {
                file0.println(line);
                line = file1.readLine();
            }
            file0.flush();
            file1.close();
            file0.close();
        }
    }
