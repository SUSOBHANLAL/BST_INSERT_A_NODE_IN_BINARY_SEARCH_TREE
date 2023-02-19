package insert_a_node_in_a_bst;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key= key;
	}
	
}
public class susobhan {
	
	public static void main(String args[]) {
		node root=new node(10);
    	root.left=new node(5);
    	root.right=new node(15);
    	root.right.left=new node(12);
    	root.right.right=new node(18);
    	int x = 20;
    	 root= insert(x,root);
    	 inorder(root);
	}
	static node insert(int x,node root) {
		if(root == null) {
			return new node(x);
		}
		if(root.key>x) {
			root.left=insert(x,root.left);
			
		}
		else if(root.key<x) {
			root.right=insert(x,root.right);
		}
		
		return root;
	}
	 public static void inorder(node root){
	        if(root!=null){
	            inorder(root.left);
	            System.out.print(root.key+" ");
	            inorder(root.right);
	        }    
	    }

}
