public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap<String, Integer> hMap = new HashMap<String, Integer>();


        for(int i =0; i<magazine.length; i++){

            if(hMap.containsKey(magazine[i])){

                hMap.put(magazine[i],hMap.get(magazine[i])+1);
            } else{

                hMap.put(magazine[i],1);
            }
        }

        boolean valid = true;

        for(int i =0; i<ransom.length;i++){

            if(hMap.containsKey(ransom[i])){

                if(hMap.get(ransom[i]) >0){
                    hMap.put(ransom[i], hMap.get(ransom[i])-1);

                } else{
                    valid = false;
                    break;
                }


            } else{


                valid = false;
                break;
            }
        }

        if(valid){

            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

      }
