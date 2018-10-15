
import java.util.LinkedHashMap;

public class LruCache<K, V> extends LinkedHashMap<K, V> {

    private static final int MAX_CAPACITY = 3;

    LruCache() {
        // v3 设置 accessOrder 为 True，使得每次访问都将元素放到队尾，队头则为最近最少使用的元素
        super(MAX_CAPACITY, 0.75f, true);
}

    public static void main(String[] args) {
        LruCache<String, Integer> cache = new LruCache();
        cache.put("Hello", 1);
        cache.put("World", 2);
        cache.put("Test", 3);

        System.out.println(cache.keySet());
        cache.get("Hello");
        System.out.println(cache.keySet());
    }

}
