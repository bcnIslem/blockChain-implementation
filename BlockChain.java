import java.util.ArrayList;

public class BlockChain {

	public static void main(String[] args) {
		
		// initiate an array list for the blockChain
		ArrayList<Block> blockChain = new ArrayList<Block>();
		
		// ######################################################### 1
		
		// data for first block
		String[] initialValues = {"coding islem", "software engineer", "full stack web developer"};
		
		// first block
		Block firstBlock = new Block(initialValues, 0);
		
		// adding the first block to the blockChain
		blockChain.add(firstBlock);
		
		// ######################################################### 2
		
		// data for second block
		String[] secondValues = {"seif dev", "architecte engineer", "design"};
		
		// second block
		Block secondBlock = new Block(secondValues, firstBlock.getBlockHash());
		
		// adding the second block to the blockChain
		blockChain.add(secondBlock);
		
		// ######################################################### 3
		
		// data for third block
		String[] thirdValues = {"zak bcn", "doctor", "geniralist"};
		
		// third block
		Block thirdBlock = new Block(thirdValues, secondBlock.getBlockHash());
		
		// adding the third block to the blockChain
		blockChain.add(thirdBlock);
		
		// ######################################################### 
		
		// blocks
		System.out.println("first block: " + firstBlock.toString());
		System.out.println("second block: " + secondBlock.toString());
		System.out.println("third block: " + thirdBlock.toString());
		
		// block chain
		System.out.println("blockChain: " + blockChain.toString());
		
	}

}
