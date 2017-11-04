//Steps
//1) this is a recusive problem
//2) base cases are 1 and 0. in those cases just return 1 or 0
//3) recurse through with fibonacci(n-1) and fibonacci(n-2). this is because the next term is the sum of the two previous terms

public static int fib(int n)
{
    int a = 0, b = 1, c;
    if (n == 0)
        return a;
    for (int i = 2; i <= n; i++)
    {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}
