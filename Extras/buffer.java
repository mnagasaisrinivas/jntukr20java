package Extras;
import java.lang.*;
import java.util.*;
import java.io.*;

class buffer{
	public static void main(String[] args) throws Exception{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		System.out.println("Enter name,age,gender");
		String name=br.readLine();
		int age=Integer.parseInt(br.readLine());
		String gender=br.readLine();
		System.out.println("Name : "+name+"\n age : "+age+"\n Gender : "+gender);
	}
}