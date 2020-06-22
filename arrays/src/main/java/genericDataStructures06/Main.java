package genericDataStructures06;

public class Main {

    public static void main(String[] args) {

        Array<Student> arr = new Array<>(20);
        for (int i = 0; i < 10; i++)
            arr.addLast(new Student("dkf", 556));
        System.out.println(arr);

        arr.add(1, new Student("dkfj",34));
        System.out.println(arr);

//        arr.addFirst(-);
        System.out.println(arr);
        // [-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        arr.remove(2);
        System.out.println(arr);

//        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
