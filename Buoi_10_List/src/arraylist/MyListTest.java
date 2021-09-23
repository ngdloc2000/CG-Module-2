package arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 4);
        listInteger.add(3, 1000);
        listInteger.remove(1);

//        MyList<Integer> listNew = (MyList<Integer>) listInteger.clone1();
        System.out.println("Phần tử 3 có trong mảng không? " + listInteger.contains(3)); // true
        System.out.println("Vị trí của phần tử số 3: " + listInteger.indexOf(3)); // 1
        System.out.println("Phần tử có vị trí 1 là: " + listInteger.get(1)); // 3

        for (Object x : listInteger.elements) {
            System.out.println(x);
        }
    }
}
