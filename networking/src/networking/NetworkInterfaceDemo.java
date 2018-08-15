package networking;
import java.net.*;
import java.io.*;
public class NetworkInterfaceDemo
{
	public static void main(String[]args)
	{
		/*try {
		xInetAddress address = InetAddress.getByName("127.0.0.1");
		NetworkInterface ni =NetworkInterface.getByInetAddress(address);
		System.out.println(ni);
		}
		catch(UnknownHostException | SocketException e)
		{
			
		}
		*/
		try {
			URL u = new URL("http","www.kprbusiness.esy.zzz","index.html");
			} 
		catch (MalformedURLException e) {
			
			System.out.println("malformed ");
		}
	}

}
