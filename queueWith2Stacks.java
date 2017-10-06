public void enqueue(T value) { // Push onto newest stack
            stackNewestOnTop.push(value);

        }

        public T peek() {

             if(stackOldestOnTop.empty()){
                 while(!stackNewestOnTop.empty()){


                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            }


            T toRet = stackOldestOnTop.peek();


            return toRet;

        }

        public T dequeue() {

            if(stackOldestOnTop.empty()){
                 while(!stackNewestOnTop.empty()){


                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
            }

            T toRet = stackOldestOnTop.pop();




            return toRet;



        }
