import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Price {
	// ��� ������ �ؽ�
	HashMap<String, Integer> meatfish = new HashMap<>(); 
	HashMap<String, Integer> vegetable = new HashMap<>();
	HashMap<String, Integer> source = new HashMap<>();
	HashMap<String, Integer> etc = new HashMap<>();
	// ���� �迭
	String[] meatfishmaterial = new String[100];
	String[] vegetablematerial = new String[100];
	String[] sourcematerial = new String[100];
	String[] etcmaterial = new String[100];
	
	public Price(){ // ������
		String line = null;
		String[] Graph = null;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("src//���� �� �ػ깰.txt"));
			while((line = reader.readLine()) != null) {
				Graph = line.split(" ");
				meatfish.put(Graph[0],  Integer.parseInt(Graph[1]));
				
			}
			int n =0;
			for(String c : meatfish.keySet()) {
				
				
				meatfishmaterial[n] = c;
				n++;
				
		}
			reader = new BufferedReader(new FileReader("src//ä�� �� ����.txt"));
			while((line = reader.readLine()) != null) {

				Graph = line.split(" ");
				vegetable.put(Graph[0],  Integer.parseInt(Graph[1]));

			}
			n =0;
			for(String c : vegetable.keySet()) {
				
				
				vegetablematerial[n] = c;
				n++;
				
		}
			reader = new BufferedReader(new FileReader("src//��� �� ��ŷ�.txt"));
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
			reader = new BufferedReader(new FileReader("src//��Ÿ ���.txt"));
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
	public int getmeatfishPrice(String name) { //���� �� �ػ깰 ����� ������ �ҷ��´�.
		return meatfish.get(name);
	}
	public int getvegetablePrice(String name) {//�Է��� ����� ������ �ҷ��´�.
		return vegetable.get(name);
	}
	public int getsourcePrice(String name) {//�Է��� ����� ������ �ҷ��´�.
		return source.get(name);
	}
	public int getetcPrice(String name) {//�Է��� ����� ������ �ҷ��´�.
		return etc.get(name);
	}
	// ��������������Կ���
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
	// ���������� getter
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