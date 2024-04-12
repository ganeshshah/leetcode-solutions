public class Node {
        int key;
        int val;
        Node next;
        Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

     class LRUCache{

        private int capacity;
        private Map<Integer,Node> cache;
        private Node head;
        private Node tail;


        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<>();
            this.head = new Node(1,1);
            this.tail = new Node(1,2);
            this.head.next = tail;
            this.tail.prev = head;
        }


        int get(int key){

            if(!cache.containsKey(key))
                return -1;

            Node node = cache.get(key);
            removeNode(node); // first remove the node from its existing position
            addNode(node); // then add the node back to end of the doubly-linked list
            return node.val;
        }


        void put(int key, int val){

            if (cache.containsKey(key)) {
                Node oldNode = cache.get(key);
                removeNode(oldNode);
            }

            Node node = new Node(key, val);
            cache.put(key, node);
            addNode(node);

            if (cache.size() > capacity) {
                Node nodeToDelete = head.next;
                removeNode(nodeToDelete);
                cache.remove(nodeToDelete.key);
            }
        }

        private void addNode(Node node) {
            Node previousEnd = tail.prev;
            previousEnd.next = node;
            node.prev = previousEnd;
            node.next = tail;
            tail.prev = node;
        }

        private void removeNode(Node node) {
            Node prevNode = node.prev;
            prevNode.next = node.next;
            node.next.prev = prevNode;
        }


    }