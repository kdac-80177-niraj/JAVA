package Que1;

public class sameString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1[] = {"Niraj","raj","Suraj","Niraj"};
		String str2[] = {"Niraj","rohit","raj","Sameer"};
		for(int i = 0 ; i < str1.length ; i++) {
			for(int j = 0 ; j < str2.length ; j++) {
				if(str1[i].equals(str2[j]))
					System.out.println("Duplicates: "+str1[i]);
			}
		}
			
		}

	}


