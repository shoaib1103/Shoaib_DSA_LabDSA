package greatlearning.q2.BinarySearchTree;




public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(40);
		root.insert(root, 20);
		root.insert(root, 60);
		root.insert(root, 10);
		root.insert(root, 30);
		root.insert(root, 50);
		root.insert(root, 70);
		
		BinaryTreeQ2 sumPair = new BinaryTreeQ2();
		sumPair.checkpairPresent(root, 130);
		
		
		

	}

}
