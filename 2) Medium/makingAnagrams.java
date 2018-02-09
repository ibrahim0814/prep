public static int numberNeeded(String a, String b){

        //need to get count of how many times each char appears in each string

        int[] charCounts1 = new int[26];
        int[] charCounts2 = new int[26];

        for(int i=0; i<a.length();i++){

            charCounts1[a.charAt(i)-'a']=charCounts1[a.charAt(i)-'a']+1;
        }

        for(int i=0; i<b.length();i++){

            charCounts2[b.charAt(i)-'a']=charCounts2[b.charAt(i)-'a']+1;
        }

        int diff = 0;


        for(int i=0; i<26;i++){

            diff+=(Math.abs(charCounts1[i]-charCounts2[i]));
        }

        return diff;




    }
