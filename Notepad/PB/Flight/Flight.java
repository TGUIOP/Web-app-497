import java.io.*;
import java.util.*;

public class Flight{
	
	public static void main(String[]args){
		
		FileInputStream file;
		BufferedReader filereader;
	
		try{
			file = new FileInputStream("Flight.txt");
			Scanner file = new Scanner( new File( "Flight.txt" ) );
			while (file.hasNext( )) // test for the end of the file
			{
				String stringRead = file.nextLine( ); // read a line
				Scanner parse = new Scanner( stringRead ); //process the line read
				parse.useDelimiter( "," );
				String flightNumber = parse.next( );
				String origin = parse.next( );
				String destination = parse.next( );
				//code to process these tokens (origin, destination, etc)
			}
		}//use a catch black
	}
}