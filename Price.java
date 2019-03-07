import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Price {
	// 재료 종류의 해쉬
	HashMap<String, Integer> meatfish = new HashMap<>(); 
	HashMap<String, Integer> vegetable = new HashMap<>();
	HashMap<String, Integer> source = new HashMap<>();
	HashMap<String, Integer> etc = new HashMap<>();
	// 재료들 배열
	String[] meatfishmaterial = new String[100];
	String[] vegetablematerial = new String[100];
	String[] sourcematerial = new String[100];
	String[] etcmaterial = new String[100];
	
	public Price(){ // 생성자
		String line = null;
		String[] Graph = null;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src//육류 및 해산물.txt"));
			while((line = reader.readLine()) != null) {
				Graph = line.split(" ");
				meatfish.put(Graph[0],  Integer.parseInt(Graph[1]));
				
			}
			int n =0;
			for(String c : meatfish.keySet()) {
				
				
				meatfishmaterial[n] = c;
				n++;
				
		}
			reader = new BufferedReader(new FileReader("src//채소 및 과일.txt"));
			while((line = reader.readLine()) != null) {

				Graph = line.split(" ");
				vegetable.put(Graph[0],  Integer.parseInt(Graph[1]));

			}
			n =0;
			for(String c : vegetable.keySet()) {
				
				
				vegetablematerial[n] = c;
				n++;
				
		}
			reader = new BufferedReader(new FileReader("src//양념 및 향신료.txt"));
			while((line = reader.readLine()) != null) {

				Graph = line.split(" ");
				source.put(Graph[0],  Integer.parseInt(Graph[1]));
				n++;
			}
			n =0;
			for(String c : source.keySet()) {
				
				
				sourcematerial[n] = c;
				n++;
		}
			reader = new BufferedReader(new FileReader("src//기타 재료.txt"));
			while((line = reader.readLine()) != null) {

				Graph = line.split(" ");
				etc.put(Graph[0],  Integer.parseInt(Graph[1]));
			}
			n =0;
			for(String c : etc.keySet()) {
				
				
				etcmaterial[n] = c;
				n++;
				
		}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public int getmeatfishPrice(String name) { //육류 및 해산물 재료의 가격을 불러온다.
		return meatfish.get(name);
	}
	public int getvegetablePrice(String name) {//입력한 재료의 가격을 불러온다.
		return vegetable.get(name);
	}
	public int getsourcePrice(String name) {//입력한 재료의 가격을 불러온다.
		return source.get(name);
	}
	public int getetcPrice(String name) {//입력한 재료의 가격을 불러온다.
		return etc.get(name);
	}
	// 재료종류들의포함여부
	public boolean iscontainmeatfish(String name) { 
		return meatfish.containsKey(name);
	}
	public boolean iscontainvegetable(String name) {
		return vegetable.containsKey(name);
	}
	public boolean iscontainsource(String name) {
		return source.containsKey(name);
	}
	public boolean iscontainetc(String name) {
		return etc.containsKey(name);
	}
	public boolean iscontainmaterial(String name) {
		if(!iscontainmeatfish(name) && !iscontainvegetable(name) && !iscontainsource(name) && !iscontainetc(name)) {
			return false;
		}
		return true;
	}
	// 재료모음에서 getter
	public String[] getmeatfisharr() {
			return meatfishmaterial;
	}
	public String[] getvegetablearr() {
		return vegetablematerial;
}
	public String[] getsourcearr() {
		return sourcematerial;
}
	public String[] getetcarr() {
		return etcmaterial;
}
	
}