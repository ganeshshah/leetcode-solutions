class Solution {
    
    private ExecutorService executor = Executors.newFixedThreadPool(6);
   
    private AtomicInteger activeTasks = new AtomicInteger();
    
    private HtmlParser htmlParser;
    
    private final Set<String> visited = Collections.synchronizedSet(new HashSet<>());
    
    private String domain;
    
    private class Task implements Runnable {
        String url;
        public Task(String url) {
            this.url = url;
        }
        
        @Override
        public void run() {
            for(String link : htmlParser.getUrls(url)) {
                if(link.split("/")[2].equals(domain) && visited.add(link)) {
                    activeTasks.incrementAndGet();
                    executor.execute(new Task(link));
                }
            }
            activeTasks.decrementAndGet();
        } 
    }
    
    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
         
        this.htmlParser = htmlParser;
        this.domain = startUrl.split("/")[2];
        visited.add(startUrl);
        activeTasks.set(1);
        executor.execute(new Task(startUrl));
        while(activeTasks.get() > 0) {
           try {
             Thread.sleep(80);
           } catch (Exception e) {
    
           }    
        }    
        executor.shutdownNow();
        return new ArrayList<>(visited);
    }
    
}