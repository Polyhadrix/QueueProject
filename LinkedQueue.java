// *******************************************************************
//   LinkedQueue.java
//
//   A linked-list implementation of the classic FIFO queue interface. 
// *******************************************************************

/**
 * 
 * @author Garron Blake
 *
 */
public class LinkedQueue implements QueueADT
{
    private Node front, back;
    private int numElements;

    // -------------------------------------------------------
    // Constructor -- initializes the front and back pointers
    // and the number of elements.
    // -------------------------------------------------------
    
    /**
     * Constructor -- initializes the front and back pointers and the number of elements.
     */
    public LinkedQueue()
    {
		front = null;
		back = null;
		numElements = 0;
    }


    // --------------------------------------------------
    //  Puts an item on the end of the queue
    // --------------------------------------------------
    
    /**
     * Puts an item on the end of the queue
     * @param item-- specifies the value of the new node.
     */
    public void enqueue(Object item)
    {
    	Node tempNode = new Node();
    	tempNode.setElement(item);
    	numElements++;
    	
    		if (back == null)
    		{
    			front = tempNode;
    		}
    		
    		else
    		{
    			back.setNext(tempNode);
    		}
    		
    	back = tempNode;
    }


    // -------------------------------------------------------
    // Removes and returns object from the front of the queue.
    // -------------------------------------------------------
    
    /**
     * Removes and returns object from the front of the queue.
     */
    public Object dequeue()
    {
    	Object item = null;
    	
    		if (!isEmpty())
    		{
    			item = front.getElement();
    			front = front.getNext();
    	    	
    				if (front == null)
    				{
    					back = null;
    				}
    				
	    	    numElements--;
    		}
  
     	return item;
    }


    // -----------------------------------------------------
    // Returns true if the queue is empty, false otherwise.
    // -----------------------------------------------------
    
    /**
     * Returns true if the queue is empty, and false otherwise.
     */
    public boolean isEmpty()
    {
    	if (front == null && back == null)
    	{
    		return true;
    	}
    	
    	else
    	{
    		return false;
    	}
    }


    // ----------------------------------------------------
    // Returns true if queue is full, but it never is.
    // ----------------------------------------------------
    
    /**
     * Returns true if queue is full, but it never is, because logic :P
     * always @return false.
     */
    public boolean isFull()
    {
    	return false;
    }

    //------------------------------------------------------
    // Returns the number of elements in the queue.
    //------------------------------------------------------
    
    /**
     * Returns the number of elements in the queue.
     * @return numElements.
     */
    public int size()
    {
    	return numElements;
    }

    //--------------------------------------------------------
    // Returns a string containing the elements of the queue
    // from first to last.
    //--------------------------------------------------------
    
    /**
     * Returns a string containing the elements of the queue from first to last.
     * @return the boolean result.
     */
    public String toString()
    {
		String result = "\n";
		Node temp = front;
		while (temp != null)
		{
			result += temp.getElement() + "\n";
			temp = temp.getNext();
		}

		return result;
    }

}



