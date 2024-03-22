class BoundedBlockingQueue {
    
    private Queue<Integer> blockingQueue;
    private  final Integer queueSize;

    public BoundedBlockingQueue(int capacity) {
        this.blockingQueue = new LinkedList<>();
        this.queueSize = capacity;
    }
    
    public synchronized void enqueue(int element) throws InterruptedException {
        while(blockingQueue.size() == queueSize)
            wait();
        blockingQueue.add(element);
        notifyAll();
    }
    
    public synchronized int dequeue() throws InterruptedException {
        while(blockingQueue.size() == 0)
            wait();
     
        int element =  blockingQueue.remove();
        
        notifyAll();
        return element;
    }
    
    public int size() {
       return blockingQueue.size();
    }
}