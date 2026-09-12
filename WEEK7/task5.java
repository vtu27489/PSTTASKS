import java.util.LinkedList;
import java.util.List;

class MyHashSet {
    private final int BUCKET_SIZE = 769; // A prime number to reduce collisions
    private List<Integer>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashSet() {
        buckets = new LinkedList[BUCKET_SIZE];
        for (int i = 0; i < BUCKET_SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    
    // Hash function to map key to a bucket index
    private int hash(int key) {
        return key % BUCKET_SIZE;
    }

    public void add(int key) {
        int bucketIndex = hash(key);
        List<Integer> bucket = buckets[bucketIndex];
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int bucketIndex = hash(key);
        List<Integer> bucket = buckets[bucketIndex];
        // Must cast to Integer object, otherwise it removes by index instead of value
        bucket.remove((Integer) key);
    }

    public boolean contains(int key) {
        int bucketIndex = hash(key);
        List<Integer> bucket = buckets[bucketIndex];
        return bucket.contains(key);
    }
}



output
  Input
["MyHashSet","add","add","add","remove","contains","add","add","add","remove","contains","add","add","add","remove","contains","add","add","add","remove","contains"]
[[],[1],[10001],[1],[1],[1],[7],[10007],[7],[7],[7],[123],[10123],[123],[123],[123],[5000],[15000],[5000],[5000],[5000]]
Output
[null,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false]
Expected
[null,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false,null,null,null,null,false]
