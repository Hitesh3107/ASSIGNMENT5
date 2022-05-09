package vd;

//Q4


import java.util.ArrayList;
import java.util.List;


	class ASSIGNMENTSPROB4 {
	    List<Integer> list;
	    
	    public ASSIGNMENTSPROB4() {
	        list = new ArrayList<>();
	    }
	    
	   
	    public void push(int x) {
	        list.add(x);
	    }
	    
	   
	    public int pop() {
	        int res = list.get(0);
	        list.remove(0);
	        return res;
	    }
	    
	   
	    public int peek() {
	        return list.get(0);
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return list.size() == 0;
	    }
	    
	    public void print() {
	    	System.out.println(list);
	    }
	    
	    //using arraylist's remove method
	    public void delete(int n) {
	    	if(n<list.size())
	    	list.remove(n);
	    	
	    }
	    
	    
	    
	    
	    
	    
	  public static void main(String[] args) {
		  ASSIGNMENTSPROB4 m=new ASSIGNMENTSPROB4();
		  m.push(100);
		  m.push(0);
		  m.push(123);
		  System.out.println(m.peek());
		  
		  m.pop();

		  System.out.println(m.peek());
		  m.push(1238);
		  m.push(1273);
		  m.delete(2);
		  m.print();
		  
		
	}
	    
	    
	}
	
