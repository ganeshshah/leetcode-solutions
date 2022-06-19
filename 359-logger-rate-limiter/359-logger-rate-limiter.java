class Logger {

    HashMap<String,Integer> map;
    public Logger() {
        map = new HashMap<String,Integer>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        
        if(!this.map.containsKey(message))
        {
            this.map.put(message,timestamp);
            return true;
        }
       if(this.map.containsKey(message) && (timestamp >= this.map.get(message) + 10))
        {
            this.map.put(message, timestamp);
            return true;
        }
        else
            return false;
            
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */