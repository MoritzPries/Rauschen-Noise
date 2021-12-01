import java.io.*;

class WriteFile
{
  public WriteFile(String text, String filename) throws IOException
  {
    FileWriter fw = new FileWriter("filename");
    BufferedWriter bw = new BufferedWriter(fw);

    bw.write(text);
    bw.newLine();
  

    bw.close();
  }
}
