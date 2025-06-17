package arrays;

import java.util.*;

public class F22ArrayList {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> createArrayList(){
        System.out.print("Enter Length of ArrayList: ");
        int length = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>(length);

        for (int i = 0; i < length; i++) {
            System.out.print("Enter element of index "+i+" : ");
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

    public static void displayArrayList(ArrayList<Integer> arrayList){
        System.out.println(arrayList);
    }

    public static ArrayList<Integer> sortArrayList(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        return arrayList;
    }


    public static void main(String[] args) {
//        F22ArrayList.displayArrayList(F22ArrayList.createArrayList());
        F22ArrayList.displayArrayList(F22ArrayList.sortArrayList(F22ArrayList.createArrayList()));


        LinkedList<Integer> linkedList = new LinkedList<>();


        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Ali");
        hashMap.put(3, "Ali");
        System.out.println(hashMap);

        BStudent bStudent = new BStudent(3);
        bStudent.soo(2);
        FStudent fStudent = new BStudent();
    }
}

class FStudent{
    static int usman;
    int rafay;
    int age;
    void soo(int age){
        System.out.println(age);
    }

//    public FStudent(){
//
//    }
    public FStudent(int age){
        this.age = age;
    }
}

class BStudent extends FStudent{
    String name;
    void foo(String name){
        System.out.println(name);
    }

    public BStudent(int age){
        super(7);
    }
    public BStudent(){
        super(3);
    }
}
