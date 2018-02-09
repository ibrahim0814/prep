
/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note: All inputs will be in lower-case.
*/

//This is the best solution
//We wanna loop through every string in the array
//Split it into a character array
//Sort that array
//Convert the array back into a string and store it in a hashmap
//If that string doesn't exist, add the orginal (nonsorted) version of the string into the hashmap with a new List
public List<List<String>> groupAnagrams(String[] strs) {
    if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
    HashMap<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        char[] ca = s.toCharArray();
        Arrays.sort(ca);
        String keyStr = String.valueOf(ca);
        if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
        map.get(keyStr).add(s);
    }
    return new ArrayList<List<String>>(map.values());
}
