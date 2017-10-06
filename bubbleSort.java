public static void main(String[] args) {
        // scan in values, num is length, every int after is an elem of array
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];

        // populate array
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        //keep track of global swaps
        int globalSwaps = 0;

        //worst case, we have a totally backwards array. 0(n)
        for(int j=0; j<arr.length;j++){

            //keep track of local swaps
            int localSwaps = 0;

            // start swapping if adjacent elements
             for(int i = 0; i< arr.length-1; i++){

                if(arr[i] > arr[i+1]){

                    int copy = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = copy;
                    globalSwaps++;
                    localSwaps++;
                }
            }

            //if we haven't swapped anything, the array is sorted and we can break
            if(localSwaps == 0){

                break;
            }

        }

        // print out how many swaps in total, first and last elem
        System.out.println("Array is sorted in "+globalSwaps+ " swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);





    }
