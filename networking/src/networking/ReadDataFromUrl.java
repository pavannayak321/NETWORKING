package networking;

import java.net.*;
import java.io.*;
/*
 * reading the contents of the page 
 */
public class ReadDataFromUrl {

	public static void main(String[] args) throws IOException
	{
		//Authenticator.setDefault(new DialogAuthenticator());
		FileOutputStream fos = new FileOutputStream(new File("Downloaded.html"),true);
		try
		{
			URL  u = new URL("http://facebook.com");
			InputStream in =u.openStream();
			int c;
			while((c=in.read())!=-1)
			{
				fos.write(c);
				
			}
			System.out.println("protocal used is: "+u.getProtocol());
			System.out.println("host name is :"+u.getHost());
			System.out.println("port number use:"+u.getPort());
			System.out.println("referenc is:"+u.getRef()+'\n'+"query is:"+u.getQuery()+'\n'+"path is"+u.getPath()+"user iinfo"+u.getUserInfo());
			System.out.println("to externalization::");
			in.close();
		}
		catch( IOException e)
		{
			System.out.println("exception occured");
		}

	}

}
