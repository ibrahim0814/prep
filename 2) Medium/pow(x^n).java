public static int pow(int x, int n){

  if(n==0){return 1;}
  if(n%2==0){
    y = pow(x,n/2);
    return y*y;
  }
  else{
    return x*pow(x,n-1);
  }

}
