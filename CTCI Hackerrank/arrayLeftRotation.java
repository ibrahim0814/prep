public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        k=k%n;
        for(int i =k; i<n; i++){

            System.out.print(a[i]+" ");
        }

        for(int i=0; i<k;i++){

            System.out.print(a[i]+" ");
        }


    }
