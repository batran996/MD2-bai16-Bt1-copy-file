import java.io.*;

public class CopyFileExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(new File("C:\\Users\\WINDOWS\\IdeaProjects\\untitled24\\src\\tensv.txt"));
            outputStream = new FileOutputStream("C:\\Users\\WINDOWS\\IdeaProjects\\untitled24\\src\\copy1.txt");
            int lenght;
            byte[] bufer = new byte[1024];
            while ((lenght = inputStream.read(bufer)) >0){
                outputStream.write(bufer,0,lenght);
            }
            System.out.println("file is copied successful!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
