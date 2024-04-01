class Foo {
    
     // private volatile AtomicInteger firstJobDone = new AtomicInteger(0);
     // private volatile AtomicInteger secondJobDone = new AtomicInteger(0);
    
    private volatile AtomicInteger state = new AtomicInteger(0);

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        while(state.get() != 0){
            
        }
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        
             printFirst.run();
            state.set(1);
        
           
       
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        while(state.get() != 1){
            
        }
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        
            printSecond.run();
            state.set(2);
        
    }

    public  void third(Runnable printThird) throws InterruptedException {
         while(state.get() !=2){
            
        }
        
         
             printThird.run();
            state.set(0);
        
        // printThird.run() outputs "third". Do not change or remove this line.
        
    }
}