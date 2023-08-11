package SystemDesign.CacheDesign;

import java.util.HashMap;
import java.util.Map;
// single responsibility principal and open closed principal
// single class has its own functionalities that related to itself.
public class Cache {
    private final EvictionPolicy evictionPolicy; //classes are immutable here. we make it as final
    private final Storage storage;
    public Cache(EvictionPolicy evictionPolicy, Storage storage)
    {
        this.evictionPolicy=evictionPolicy;
        this.storage=storage;
    }
    public void put(String key, String value)
    {
        this.storage.add(key,value);
        this.evictionPolicy.keyAccessed(key);

    }
    public String get(String key)
    {
        String value=this.storage.get(key);
        this.evictionPolicy.keyAccessed(key);
        return value;
//        return value;
    }


}
class Storage{
    Map<String,String> storage;
    private final Integer capacity;
    public Storage(Integer capacity)
    {
        this.capacity=capacity;
    }
    public  void add(String key, String value)
    {
        if(storage.size()==capacity)
        {
            System.out.println("capacity is full");
        }
        storage.put(key,value);

    }
    public void remove(String key)
    {
        if(!storage.containsKey(key))
        {
            return;
        }
        storage.remove(key);

    }
    public String get(String key)
    {
        return storage.get(key);


    }
}
class EvictionPolicy
{
    private DLL dll;
    private Map<String,DLLN> mapper;
    public EvictionPolicy()
    {
        this.dll=new DLL();
        mapper= new HashMap<>();

    }
    public void keyAccessed(String key)
    {
        dll.detachNode(mapper.get(key));
        dll.addNodeAtEnd(mapper.get(key));
        return;

    }
    public void evictKey()
    {
        dll.movehead(); // least recent used.
        return;


    }



}
class DLL
{

    DLLN head;
    public void movehead()
    {

    }
    public void detachNode(DLLN hnode)
    {

    }
    public void addNodeAtEnd(DLLN hnode)
    {

    }


}
class DLLN
{
   int data;
    DLLN next;
    DLLN prev;
    public DLLN(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;

    }

}