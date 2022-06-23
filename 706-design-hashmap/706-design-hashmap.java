class MyHashMap {

    ArrayList<ArrayList<Integer>> mymap;
    
    private int findelement(int a){
        for(int i=0;i<mymap.size();i++)
        {
           if (mymap.get(i).get(0) == a)
               return i;
        }
         return -1;
    }
    public MyHashMap() {
        mymap = new ArrayList<ArrayList<Integer>>();
    }
    
    public void put(int key, int value) {
        ArrayList<Integer> li = new ArrayList<Integer>();
            li.add(key);
            li.add(value);
        int ind = findelement(key);
        if(ind == -1)
            mymap.add(li);
        else
            mymap.set(ind,li);   
        
    }
    
    public int get(int key) {
        int ind = findelement(key);
        if(ind != -1)
            return mymap.get(ind).get(1);
        return -1;
    }
    
    public void remove(int key) {
        int ind = findelement(key);
        if(ind != -1)
            mymap.remove(ind);
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */