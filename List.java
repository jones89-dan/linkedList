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
    
    /**
    * Overloaded List constructor converts array to linked list. 
    * 
    * @param arr - array to be converted into a linked list.
    */
    public List(int arr[])
    {
        // initialize list
        list = null;
        
        // loop through array and add Items
        for (int i = arr.length-1; i>=0; i--) {
            Item r = new Item(arr[i]);
            r.next = list;
            list = r;
        }
    }
    
    /**
    * Use stringBuilder method to format linked list output with commas.
    * 
    * @return s.toString - stringBuilder output
    */
    public String toString()
    {
        // initialze the string builder
        StringBuilder s = new StringBuilder("");
        
        // checks for empty list
        if (!isEmpty()) {
            Item r = list;
            
            // interate throught items in the List and append the comma
            while (r.next != null) { 
                s.append(r.info + ", ");
                r = r.next;
            }
            
            // append the last item without comma
            s.append(r.info);
        }
        
        return s.toString();
    }
    
    /**
    * Finds the last item in the List.
    * 
    * @return r.info - the int value of the last item.
    */
    public int findLast()
    {
        // intialize first item and loop throught the List to the end. 
        Item r = list;
        while (r.next != null)
            r = r.next;
            
        return r.info;
    }
    
    /**
    * Inserts new Item at the end of the list. 
    * 
    * @param x - int to inserted at the end of the linked list.
    */
    public void insertLast(int x)
    {
        // intialize first item and loop throught the List to the end.
        Item r = list;
        while (r.next != null) {
            r = r.next;
        }        
        
        // add the new item to end of list.
        r.next = new Item(x);
        
    }
    
    /**
    * Removes Item from the end of the list. 
    * 
    */
    public void removeLast()
    {
        Item r = list;
        
        // checks for empty list or only on item in list
        if (isEmpty() || r.next == null)
            System.out.println("Error in removeLast(): list is empty");
        
        // loop to the end of the list
        while (r.next.next != null) {
            r = r.next;
        } 
        
        // remove last item
        r.next = null;
    }
    
    /**
    * Create a copy of the list by looping through list and append to new list. 
    * 
    * @return copyList - coppied list.
    */
    public List copy()
    {
        // intialize the copy list and starting point of current list
        List copyList = new List();
        Item r = list;
        
        // loop through the current list append to copy list
        while (r != null) {
            copyList.append(r.info);
            r = r.next;
        }    
        
        // copy of the list
        return copyList; 
    }
    
    /**
    * Join two lists together. 
    * 
    * @param x - list to add.
    * @return x - joined lists.
    */
    public List join(List x)
    {
        // initialze the front of the current list
        Item r = list;
        
        // loop throught the list to be added
        while (r != null) {
            x.append(r.info);
            r = r.next;
        }
        
        // return the joined list
        return x;
    }
    
    /**
    * Intersects one list with another. 
    * 
    * @param x - list to intersect with.
    * @return x - the interesction results.
    */
    public List intersect(List x)
    {
        // initialze the front of the current list
        Item r = list;
        
        // loop through list and add if no duplicate value is found.
        while (r != null) {
            if(x.find(r.info) == null ) {
               x.append(r.info); 
            }
            
            r = r.next;
        }
        
        // return the intersection results
        return x;
    }
    
    /**
    * appends new items to a linked list. 
    * 
    * @param x - int to append to list.
    */
    public void append(int x)
    {
        Item r = new Item(x);
        
        // check to see if list has been initialzied and proceed if needed
        if (list == null) {
            list = r;
        }
        else {
            // adds the value to the next item in the list
            r.next = list.next;
            list.next = r;
            // this kind of works? list.next = r;
        }
    }
}