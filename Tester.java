public class Tester
{
    public static void main()
    {
        int a[] = {1, 2, 3, 4};
        List list1 = new List(a);

        int b[] = {6, 5, 4, 3};
        List list2 = new List(b);

        list1.insertLast(5);
        System.out.println("insertLast() gives: " + list1.toString());

        list2.removeLast();
        System.out.println("removeLast() gives: " + list2.toString());

        List result = list2.copy();
        System.out.println("copy() gives: " + result.toString());

        result = result.join(list2);
        System.out.println("join() gives: " + result.toString());

        result = list1.intersect(list2);
        System.out.println("intersect() gives: " + result.toString());
    }
}
