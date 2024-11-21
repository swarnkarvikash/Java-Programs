import java.io.*;
import java.net.*;

public class Inet {
    public static void main(String[] args) {
        try{
        InetAddress ip = InetAddress.getByName("www.kiet.edu");
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }

        
    }
}
