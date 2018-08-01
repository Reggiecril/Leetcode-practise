package mapSumParis;

import java.util.TreeMap;

public class MapSum {
	private class Node {
		public int val = 0;
		public TreeMap<Character, Node> next;

		Node() {
			this(0);
		}

		Node(int val) {
			this.val = val;
			next = new TreeMap<>();
		}
	}

	private Node root;

	/** Initialize your data structure here. */
	public MapSum() {
		root = new Node();
	}

	public void insert(String key, int val) {
		Node cur = root;
		for (int i = 0; i < key.length(); i++) {
			char ch = key.charAt(i);
			if (cur.next.get(ch) == null)
				cur.next.put(ch, new Node());
			cur = cur.next.get(ch);
		}
		cur.val = val;
	}

	public int sum(String prefix) {
		Node cur=root;
		for (int i = 0; i < prefix.length(); i++) {
			char ch = prefix.charAt(i);
			cur = cur.next.get(ch);
		}
		return sum(cur);
	}

	private int sum(Node root) {
		if(root==null)return 0;
    	int count=root.val;
    	for(char c:root.next.keySet())
    		count+=sum(root.next.get(c));
    	return count;
    }

	public static void main(String[] args) {
		MapSum ms = new MapSum();
		ms.insert("a", 3);
		System.out.println(ms.sum("ap"));
		ms.insert("b", 2);
		System.out.println(ms.sum("a"));
	}
}

/**
 * Your MapSum object will be instantiated and called as such: MapSum obj = new
 * MapSum(); obj.insert(key,val); int param_2 = obj.sum(prefix);
 */
