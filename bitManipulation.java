//Problem: we need to find the number in the array that only exists once

//elegant solution (don't really understand it) 0(n) time but o(1) space

public static int lonelyInteger(int[] a) {
    int value = 0;

    for (int i : a) {
        value ^= i;
    }
    return value;
}


//my solution, used a hashmap. o(n) time and space

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();

        for (int i=0; i<a.length;i++){

            if(!hMap.containsKey(a[i])){
                hMap.put(a[i],1);
            } else{

                hMap.put(a[i], hMap.get(a[i])+1);
            }
        }

        for(int i =0; i<a.length;i++){

            if(hMap.get(a[i]) ==1){

                System.out.println(a[i]);
                break;
            }
        }
    }
