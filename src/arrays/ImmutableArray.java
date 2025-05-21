package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class ImmutableArray {
    public static void main(String[] args) {
        String a = "Ali";
        String b = "Ali";
        System.out.println(a.equals(b));
        System.out.println(a == b);
        String c = new String("Ali");
        System.out.println(a.equals(c));
        System.out.println(a == c);


        System.out.println("----------------");
        String d = "Usman";
        String e = d;
        System.out.println(d.equals(e));
        System.out.println(e == d);
        System.out.println("----------------");


        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};
        System.out.println(array1);
        System.out.println(array2);
        System.out.println(array1.equals(array2));
        System.out.println(array1 == array2);
        int[] array3 = new int[]{1, 2, 3, 4};
        System.out.println(array3);
        System.out.println(array1.equals(array3));
        System.out.println(array1 == array3);
        int[] array4 = array1;
        System.out.println(array1);
        System.out.println(array4);
        System.out.println(array4.equals(array1));
        System.out.println(array4 == array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));
        array4[1] = 100;   // cause change in both arrays.
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array4));


        Student s1 = new Student();
        Student s2 = new Student(2);
        System.out.println(s1.equals(s2));

    }
}

class Student{
    int age;

    public Student() {
    }

    Student(int a){
        age = a;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(age);
    }
}
