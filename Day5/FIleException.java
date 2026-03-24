import java.io.FileReader;
import java.io.IOException;
class FIleException {
	
	static void readFile() throws IOException {
		FileReader  file = new FileReader("Text.txt");
	}
	public static void main(String [] args){
		try{
			readFile();
		} catch(IOException e){
			System.out.println("File not found");
		}
	}
}