import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
 
public class p458 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream output = new DataOutputStream(System.out) ;
        int C;
        while ((C =in.read()) !=-1)
            output.write((Character.isWhitespace((char)C) ? C : (C-7)));
    }
}