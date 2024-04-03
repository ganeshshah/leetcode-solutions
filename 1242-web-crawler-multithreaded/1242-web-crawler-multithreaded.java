/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */
class Solution {
    
    private volatile Set<String> visited = Collections.synchronizedSet(new HashSet<>());
    
    public List<String> crawl(String startUrl, HtmlParser htmlParser){
        
        ForkJoinPool pool = new ForkJoinPool(6);
        visited.add(startUrl);
        
           Future<Void> combinedResult = pool.submit(new WebCrawlingTask(startUrl,htmlParser));  
            while (!combinedResult.isDone());
        
        
    
        return(new ArrayList<>(visited));
        
    }
    
    
    class WebCrawlingTask extends RecursiveAction {
        
        private String startUrl;
        private HtmlParser htmlParser;
        private ArrayList<WebCrawlingTask> allTask = new ArrayList<>();
        
        WebCrawlingTask(String startUrl,HtmlParser htmlParser){
            this.startUrl = startUrl;
            this.htmlParser = htmlParser;
        }
        
    @Override
    protected void compute(){
        
        List<String> urls = htmlParser.getUrls(startUrl);
        if( urls == null || urls.size() == 0)
            return; 
        
        for(String url : urls){
            if(getHostName(url).equals(getHostName(startUrl)) && visited.add(url)){
             WebCrawlingTask subtask = new WebCrawlingTask(url,htmlParser);
             allTask.add(subtask);
            }
        }
        
        invokeAll(allTask);
        
      }
        
        private String getHostName(String url){
            return url.split("/")[2];
        }
         
    }
}