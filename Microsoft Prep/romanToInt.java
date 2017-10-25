//Steps
//1) Put values in hashmap for roman char
//2) iterate through the string
//3) if the value before is smaller, subtract it from sum, then add the //difference between the current val and prev val
//4) else, just add the val to sum
//5) return sum

//better way to to this would be to use switch cases and an array to store all the individual values
//then iterate through the array
//this solution works though

public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('M', 1000);
        map.put('D', 500);

        int sum =0;

        for(int i=0; i<s.length(); i++){
            int val = map.get(s.charAt(i));

            if(i>0){
                if(val > map.get(s.charAt(i-1))){

                  //IV

                sum = sum -map.get(s.charAt(i-1));
                sum = sum + (val-map.get(s.charAt(i-1)));
                }else{
                    sum+=val;
                }

            }else{
                sum+=val;
            }


        }

        return sum;

    }
