package Composite;

import java.util.*;

public class Trie {

	//하위 노드
	Trie[] child = new Trie[26];
	//하위 노드의 갯수
	int count;
	
	void insert(String str){
        Trie cur = this;
        for(char ch : str.toCharArray()){
        	
            if(cur.child[ch-'a'] == null)
                cur.child[ch-'a'] = new Trie();
            
            cur.count++;
            cur = cur.child[ch-'a'];
        }
        cur.count++;
    }
	
	int search(String str){
        Trie cur = this;
        for(char ch : str.toCharArray()){
        	
            if(cur.child[ch-'a']==null)
                return 0;
            
            cur = cur.child[ch-'a'];
        }
        return cur.count;
    }
}
