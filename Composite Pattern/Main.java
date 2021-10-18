package Composite;

public class Main {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("lee");
		trie.insert("ki");
		trie.insert("kim");
		
		System.out.println(trie.search("le"));
	}
}
