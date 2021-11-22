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
        
        for (int i = arr.length-1; i>=0; i--)
        {
            Item r = new Item(arr[i]);
            r.next = list;
            list = r;
            //System.out.print(r.info);
        }
        
    }
    
    public String toString()
    {
   
        StringBuilder s = new StringBuilder("");
        
        if (!isEmpty()) {
            Item r = list;
            
            while (r.next != null) { 
                s.append(r.info + ", ");
                r = r.next;
            }
            
            s.append(r.info);
        }
        
        return s.toString();
        //System.out.print(list.toString());
    }
    
    public int findLast()
    {
        Item r = list;
        while (r.next != null)
            r = r.next;
        return r.info;
    }
    
    public void insertLast(int x)
    {
        Item r = list;
        Item last = null;

        while (r.next != null) {
            r = r.next;
        }        
        
        r.next = new Item(x);
        
    }
    
    public void removeLast()
    {
        Item r = list;
        Item q = null;
        
        if (isEmpty() || r.next == null)
            System.out.println("Error in removeLast(): list is empty");
        
        while (r.next.next != null) {
            r = r.next;
        } 
        
        r.next = null;
    }
    
    public List copy()
    {
        return linkedList;
    }
    
    public List join(List a)
    {
        return linkedList;
    }
    
    public List intersect(List a)
    {
        return linkedList;
    }
    
    public void append(int x)
    {
        Item r = new Item(x);
        if (isEmpty()) {
            r.next = r;
        }
        else {
            r.next = list.next;
            list.next = r;
        }
        list = r;
    }
}