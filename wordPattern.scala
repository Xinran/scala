import collection.mutable.{ HashMap, MultiMap, Set }
// Given a pattern and a string str, find if str follows the same pattern.

// Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:Input: pattern = "abba", str = "dog cat cat dog" Output: true
// Example 2:Input:pattern = "abba", str = "dog cat cat fish" Output: false
// https://leetcode.com/problems/word-pattern/
object wordPattern {
     def patternHelper(p: Array[String], s: Array[String]): Boolean = {
        var i = 0;
        val m = new HashMap[String, Set[String]] with MultiMap[String, String]
        for(i <- 0 to p.size-1) {
            if(m.contains(p(i)) && !m.get(p(i)).get.contains(s(i))) {return false;}
            m.addBinding(p(i), s(i));
        }
        return true;
    }
    def wordPattern(pattern: String, str: String): Boolean = {
        val p = pattern.toList.map(_.toString).toArray;
        val s = str.split(" ");
        if(p.size != s.size) return false;
        patternHelper(p, s) && patternHelper(s, p);
    }
}
