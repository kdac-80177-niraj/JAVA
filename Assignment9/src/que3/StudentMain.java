package que3;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] arr = new Student[5];
		arr[0] = new Student(3,"Niraj","Karad",89.7);
		arr[1] = new Student(1,"Raj","Satara",90.7);
		arr[2] = new Student(2,"Rutik","Satara",70.7);
		arr[3] = new Student(5,"Pranav","Jaysingpur",60.4);
		arr[4] = new Student(4,"Pranav","Beed",80.3);
		
		System.out.println("Before Sort: ");
		for(Student s : arr) {
			System.out.println(s);
		}
		
		class StudentComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int diff = s1.getCity().compareTo(s2.getCity());
				if(diff == 0)
					diff = (int) -(s1.getRoll()-s2.getMarks());
				if(diff == 0)
					diff = s1.getName().compareTo(s2.getName());
				return diff;
			}
			
		}
		Arrays.sort(arr,new StudentComparator());
		System.out.println("After Sort: ");
		for(Student s : arr) {
			System.out.println(s);
		}
		
	}

}
