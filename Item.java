public class Item
{
    protected int info;
    protected Item next;

    public Item()
    {
        info = 0;
        next = null;
    }

    public Item(int i)
    {
        info = i;
        next = null;
    }
}
