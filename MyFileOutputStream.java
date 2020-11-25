import java.io.FileOutputStream;
import java.io.*;

public class MyFileOutputStream implements FileOutputStream {
        private FileOutputStream fileOutputStream;
        public MyFileOutputStream(FileOutputStream fileOutputStream) {
            this.fileOutputStream = fileOutputStream;
        }

        @Override
        public void close() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Вы действительно хотите закрыть поток? Д/Н");
            if (reader.readLine().equals("Д")) {
                fileOutputStream.close();
            }
            reader.close();
        }
    }


