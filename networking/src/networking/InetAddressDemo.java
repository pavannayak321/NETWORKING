package networking;

import java.net.*;
import java.io.*;

public class InetAddressDemo 
{

	public static void main(String[] args) 
	{
		try
		{
			InetAddress address=InetAddress.getByName("kprbusiness.esy.es");
			System.out.println(address);
		}
		
		catch(UnknownHostException e)
		{
			System.err.println(e);
		}

	}

}
