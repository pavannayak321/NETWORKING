package networking;
import java.net.*;
import java.io.*;


abstract class Static
{
	public static  void statclass()
	{
		System.out.println("hello");
	}
}
public class UrlEncodingDemo
{

	public static void main(String[] args) throws UnsupportedEncodingException 
	{
		String urlencode=URLEncoder.encode("hekkif   kfmhureh","UTF-16");
		System.out.println(urlencode);
		Static.statclass();

	}

}
