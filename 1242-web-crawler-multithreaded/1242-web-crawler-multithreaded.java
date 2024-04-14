/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    private ExecutorService executor;
    private HtmlParser htmlParser;
    private HashSet<String> visited = new HashSet<>();
    private String hostname;
    private AtomicInteger activeTask = new AtomicInteger(0);
    
    public List<String> crawl(String startUrl, HtmlParser htmlParser){
        
        this.htmlParser = htmlParser;
        this.executor = Executors.newFixedThreadPool(6);
        visited.add(startUrl);
        activeTask.incrementAndGet();
        hostname = getHostName(startUrl);
        executor.submit(new CrawlTask(startUrl));
       
        try{
             while(activeTask.get() > 0){
            Thread.sleep(80);
        }
        }catch(Exception e){
            
        }
        
        executor.shutdownNow();
        return new ArrayList<>(visited);
        
    }
    
    public String getHostName(String url){
        return url.split("/")[2];
    }
    
    
    
    class CrawlTask implements Runnable {
        
        private String startUrl;
    
        CrawlTask(String startUrl){
            this.startUrl = startUrl;
        }
        
        @Override
        public void run(){
            
            for(String url : htmlParser.getUrls(startUrl)){
                
                if(getHostName(url).equals(hostname) && visited.add(url)){
                    activeTask.incrementAndGet();
                    executor.submit(new CrawlTask(url));
                }
                
            }
            activeTask.decrementAndGet();
        }
        
    }
    
}