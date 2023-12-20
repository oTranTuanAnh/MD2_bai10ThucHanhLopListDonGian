public class Test {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(6);
        listInteger.add(3);
        listInteger.add(5);
        listInteger.add(4);
        listInteger.add(8);

        System.out.println("element 4: "+ listInteger.get(4));
        System.out.println("element 1: "+ listInteger.get(1));
        listInteger.get(-1);
        System.out.println("element -1: "+ listInteger.get(-1));
    }
}
