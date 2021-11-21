public class List
{
    private Item list;
    private List linkedList;
    
    public List()
    {
        list = null;
    }

    public void insertFirst(int i)
    {
        Item r = new Item(i);
        r.next = list;
        list = r;
    }

    public int removeFirst()
    {
        if (isEmpty()) {
            System.out.println("Error in removeFirst(): list is empty");
            System.err.println("Error in removeFirst(): list is empty");
            System.exit(1);
        }
        Item r = list;
        int x = r.info;
        list = r.next;
        return x;
    }

    public Boolean isEmpty()
    {
        return list == null;
    }

    public int count()
    {
        int count = 0;
        Item r = list;
        while (r != null) {
            ++count;
            r = r.next;
        }
        return count;
    }

    public void insertAfter(Item p, int i)
    {
        if (isEmpty() || p == null) {
            System.out.println("Error in insertAfter(): list is empty or p not set");
            System.err.println("Error in insertAfter(): list is empty or p not set");
            System.exit(2);
        }
        Item r = new Item(i);
        r.next = p.next;
        p.next = r;
    }

    public int deleteAfter(Item p)
    {
        if (p.next == null || p == null) {
            System.out.println("Error in deleteAfter(): p not set or is last item");
            System.err.println("Error in deleteAfter(): p not set or is last item");
            System.exit(3);
        }
        Item r = p.next;
        int x = r.info;
        p.next = r.next;
        return x;
    }

    //returns reference to first occurrence of i in list
    //returns null if not found
    public Item find(int i)
    {
        if (isEmpty()) {
            System.out.println("Error in find(): list is empty");
            System.err.println("Error in find(): list is empty");
            System.exit(4);
        }
        Item r = list;
        while (r != null && r.info != i)
            r = r.next;
        return r;
    }
    
    //WRITE ALL 8 OF YOUR NEW METHODS DOWN HERE
    //You are required to Javadoc comment only these new methods
    
    public List(int arr[])
    {
        list = null;
        //linkedList = null;
        
        for (int i = 0; i < arr.length; i++)
        {
            //Item r = new Item(arr[i]);
            Item r = new Item(arr[i]);
            r.next = list;
            list = r;
            System.out.print(r.info);
        }
        
        //System.out.print(linkedList);
    }
    
    public void toString(List list)
    {
        //System.out.print(list.toString());
    }
    
    public void findLast()
    {
        
    }
    
    public void insertLast(int a)
    {
    
    }
    
    public List copy()
    {
        return linkedList;
    }
    
    public void removeLast()
    {
    
    }
    
    public List join(List a)
    {
        return linkedList;
    }
    
    public List intersect(List a)
    {
        return linkedList;
    }
}