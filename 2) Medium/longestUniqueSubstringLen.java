//REVIEw
//basicaly you have two  pointers, one that moves fast and one that moves slow
//if a character is not in the set, add it, increment the fast pointer (j)
//if it is in the set, remove it, and increment the slow pointer (i)
//calculate max whenever you increment the fast pointer, it'll be the size of the set
 

public int lengthOfLongestSubstring(String s) {

        int i=0, j=0, max =0;

        HashSet<Character> set = new HashSet<>();


        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());

            }else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;



    }
