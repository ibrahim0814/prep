
//Steps
// n = the number you wanna find out whether or not its prime
//1) check to see if the number is 1, is it is then its not prime
//2) the key here is to realize YOU ONLY GO UP TO SQRT(N)
//3) iternate through up to sqrt(n) and check to see if its prime via modulus

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();

            //boolean flag to indicate we've found a divisor
            boolean valid = false;


            //check if 1
            if(n==1) {

                System.out.println("Not prime");
                valid = true;


            } else{

                // calculate sqrt
                int sqrt = (int)Math.sqrt(n);

                // iterate through and find solution
                for(int i =2; i<= sqrt;i++){

                    if(n%i == 0  ){

                        System.out.println("Not prime");
                        valid = true;
                        break;
                    }
                }



            }

            //check boolean flag
            if(!valid){
                System.out.println("Prime");

            }

        }
    }
