package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BMIManager {

	ArrayList<BMIClass> arr = new ArrayList<BMIClass>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ObjectOutputStream oos = null;
	File file = new File("BMI.txt");

	public void add() throws IOException {
		System.out.print("이름을 입력하세요 : ");
		String name = br.readLine();

		System.out.print("성별을 입력하세요 [M/F] : ");
		String temp = br.readLine();
		Boolean gender;
		if (temp.equalsIgnoreCase("m")) {
			gender = true;
		} else {
			gender = false;
		}

		System.out.print("신장을 입력하세요 : ");
		double height = Double.parseDouble(br.readLine());

		System.out.print("체중을 입력하세요 : ");
		double weight = Double.parseDouble(br.readLine());

		String ret = getBMI(height, weight);

		arr.add(new BMIClass(name, gender, height, weight, ret));
		
		try {
			
			FileOutputStream fos = new FileOutputStream(file, true); // append mode-> 안하면 계속 덮어씀
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(name);
			oos.writeObject(gender);
			oos.writeObject(height);
			oos.writeObject(weight);
			oos.writeObject(ret);
			
			System.out.println("BMI.txt saved");

			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			oos.close();
		}
		
		
	}

	public String getBMI(double height, double weight) {
		double bmi = weight / ((height / 100) * (height / 100));

		if (bmi < 18.5)
			return "저체중";

		else if (bmi >= 18.5 && bmi < 23)
			return "정상";

		else if (bmi >= 23 && bmi < 25)
			return "과체중";
		else
			return "비만";

	}

	public void delete() throws IOException {
		// 이름을 찾아서 삭제
		System.out.print("삭제할 이름을 입력하세요 : ");
		String deleteName = br.readLine();
		display();

		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(deleteName)) {
				arr.remove(x);
			}
		}

	}

	public void display() {
		// 리스트 출력
		for (int x = 0; x < arr.size(); x++) {
			System.out.println(arr.get(x).toString());
		}

	}

	public void set() throws IOException {
		// 이름을 찾아서 수정
		display();
		System.out.print("수정할 이름을 입력하세요 : ");
		String setName = br.readLine();

		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x).getName().equals(setName)) {

				System.out.print("수정할 이름을 다시 입력하세요 : ");
				String name = br.readLine();
				arr.get(x).setName(name);

				System.out.print("수정할 성별을 다시 입력하세요 [M/F] : ");
				String temp = br.readLine();
				Boolean gender;
				if (temp.equalsIgnoreCase("m")) {
					gender = true;
				} else {
					gender = false;
				}
				arr.get(x).setGender(gender);

				System.out.print("신장을 입력하세요 : ");
				double height = Double.parseDouble(br.readLine());
				arr.get(x).setHeight(height);

				System.out.print("체중을 입력하세요 : ");
				double weight = Double.parseDouble(br.readLine());
				arr.get(x).setWeight(weight);

				String ret = getBMI(height, weight);
				arr.get(x).setRet(ret);

			}
		}

	}

}
