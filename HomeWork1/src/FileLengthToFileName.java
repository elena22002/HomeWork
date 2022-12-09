import java.io.*;

 public class FileLengthToFileName {
        public static void main(String[] args) throws IOException {
            FileLengthToFileName fileNameToSize = new FileLengthToFileName();
            fileNameToSize.fileName();
        }

        void fileName() throws IOException {
            try {
                FileReader in = new FileReader("a.txt");
                File file = new File("a.txt");
                FileWriter out = new FileWriter(file.length() + ".txt");


                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
                in.close();
                out.close();
            } catch (FileNotFoundException e) {
                System.out.println("File open error: " + e.getMessage());
            }
            catch (IOException e) {
                System.out.println("File read/write error: " + e.getMessage());
            }
        }
    }

