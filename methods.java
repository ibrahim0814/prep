//This file details all of the syntax in Java for declaring and using certain data structures 

List //List<Integer> list = new ArrayList<>(elem)
  add(E element);
  add(int index, E element);
  clear();
  contains(Object o);
  get(int index);
  isEmpty();
  remove(Object o);
  remove(int index);
  size();
  toArray();

HashMap //HashMap<Integer, Integer> map = new HashMap<>()
  containsKey(Object key);
  get(Object key);
  put(K key, V value);
  remove(Object key);
  isEmpty();
  size();

HashSet //HashSet<Integer> set = new HashSet<>()
  add(E e);

Queue //Queue<Integer> queue = new LinkedList<>()
  add(E e);
  poll();
  peek();
  size();

Stack //Stack<Integer> stk = new Stack<>()
  push(E e);
  pop();
  peek();
  size();

Character //Character.method(char)
  isLetter(char c);
  isDigit(char c);
  isLetterOrDigit(char c);
  isUpperCase(char c);
  isLowerCase(char c);
  toUpperCase(char c);
  toLowerCase(char c);
  toString(char c);

String //String str = "hello", str.method()
  charAt(int index);
  equals(Object o);
  isEmpty();
  length();
  replace(char o, char n);
  replaceAll(char o, char n);
  split(String regex);
  substring(int begin, int end);
  toCharArray();
  toLowerCase();
  toUpperCase();
  trim();
  valueOf(char [] or char c);

Array //Arrays.method()
  sort();
  binarysearch(Object o);
