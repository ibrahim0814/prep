
//Steps
//1) make hashmap
//2) calculate compliment for each, put it in hashmap with index as value
//3) go through the array again, see if any of the vals match keys in the hashmap (containsKey method)
//4) if the two indexes are not the same, print out the index with break statement



public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }

            // basically the hashmap acts as all of our potential solution set
            HashMap<Integer, Integer> compVal = new HashMap<Integer, Integer>();


           // for each element compute the compliment and put it in the hashmap as a key, the value is the index
            for(int i =0; i<a.length;i++){


                int compliment = m - a[i];

                //notice that the value is the index, KEY IS COMPLIMENT
                compVal.put(compliment, i);

            }


            for(int i=0; i<a.length;i++){


                //checks to see if  the value we're looking at is a solution
                if(compVal.containsKey(a[i])){

                    //don't want same index twice
                    if(i != compVal.get(a[i])){

                        //+1 was required for Hackerrank
                        System.out.println((i+1) + " " + (compVal.get(a[i])+1));
                        break;

                    }


                }





            }

        }
    }
