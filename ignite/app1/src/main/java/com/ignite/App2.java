package com.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCompute;
import org.apache.ignite.Ignition;

public class App2
{
	public static void main(String[] args) 
	{
		try(Ignite ignite=Ignition.start("examples\\config\\example-ignite.xml"))
		{
			IgniteCompute compute=ignite.compute();
			
			//compute.broadcast(()-> System.out.println("Hello world"));
		}
	}
}