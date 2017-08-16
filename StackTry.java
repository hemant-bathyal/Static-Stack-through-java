class Stack {
	private int arr[];
	private int top;
	
	Stack(int size){
		top = -1;													//top of stack set to -1
		arr = new int[size];										//dynamic allocation of memory to stack
	}
	
	void push (int item, int i){									//push() for inserting elements
		if(top == arr.length -1){									//"length" retrieves the size/length of any array/collection    //Overflow condition 
			System.out.println(" Overflow in Stack " + i + " !");
		}
		else{
			arr[++top] = item;
		}
	}
	
	int pop(int i) {												//pop() for deleting elements from the stack
		if (top < 0){												//Underflow condition
			System.out.println(" Underflow in Stack " + i + " !");
			return 0;
		}
		else {
			return arr[top--];
		}
	}
}


class StackTry{														//main  class
	public static void main(String arr[]){							//main() function
		
		Stack obj1 = new Stack(10);
		Stack obj2 = new Stack (15);								//creation of objects & invoking of default  constructors
		
		System.out.println("Inserting elements !!! \n");
		
		for(int i = 1; i <= 10; i++){
			obj1.push(i,1);											//pushing elements in 1st Stack
		}
		
		for(int i = 1;i <= 15; i++){								//pushing elements in 2nd Stack
				obj2.push(i,2);
		}
		
		System.out.println("Elements inserted !!! \n");
		
		System.out.println("Popping elements !!! \n");
		
		System.out.print("STACK 1 :: ");
		
		for(int i = 1;i <= 10; i++){
				System.out.print(obj1.pop(1) + "\t");				//popping elements from Stack 1
			}
		
		System.out.println("\n");
		
		System.out.print("STACK 2 :: ");		
		
		for(int i = 1;i <= 15; i++){
				System.out.print(obj2.pop(2) + "\t");				//popping elements from Stack 2
			}
		
		System.out.println("\n");	
	}
}
			