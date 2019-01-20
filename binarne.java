package last2017;



import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import java.util.Scanner;



public class binarne {



	public static void main(String[] args) throws FileNotFoundException {

		// TODO Auto-generated method stub



		File plik = new File("binarne.txt");

		Scanner czytaj = new Scanner(plik);

		int dlugosc = 0;

		int licznik_dwuc = 0;

		String read,read1,read2,thelongest = null;

		while (czytaj.hasNextLine()) {

			read = czytaj.next();

			read1 = read.substring(0,read.length()/2);

			read2 = read.substring(read.length()/2,read.length());

			//System.out.println("read:"+read+"  read1: "+read1+"  read2: "+read2);

			if (read1.equals(read2)) 

				{

				if (read.length()>dlugosc) 

					{

					dlugosc=read.length();

					thelongest=read;

					}

				licznik_dwuc++;

				}

		}

			System.out.println("Ile:"+licznik_dwuc);

			System.out.println("Najdluzsze i dlugosc:"+thelongest+" ("+dlugosc+")");

		

		czytaj.close();

		

	}



}


