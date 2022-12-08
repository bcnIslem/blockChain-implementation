import java.util.Arrays;

public class Block {
	
	private String[] data;
	private int blockHash;
	private int previousBlockHash;
	
	// constructor
	public Block(String[] data, int previousBlockHash) {
		super();
		this.data = data;
		this.previousBlockHash = previousBlockHash;
		// generate new block hash based from the previous block hash
		this.blockHash = Arrays.hashCode(new int[] { Arrays.hashCode(data) , this.previousBlockHash });
	}

	//data
	public String[] getData() {
		return data;
	}
	
	public void setData(String[] data) {
		this.data = data;
	}
	

	// block Hash
	public int getBlockHash() {
		return blockHash;
	}
	
	public void setBlockHash(int blockHash) {
		this.blockHash = blockHash;
	}
	
	// previous Block Hash
	public int getPreviousBlockHash() {
		return previousBlockHash;
	}
	
	public void setPreviousBlockHash(int previousBlockHash) {
		this.previousBlockHash = previousBlockHash;
	}

	@Override
	public String toString() {
		return "Block [data = " + Arrays.toString(data) + ", blockHash = " + blockHash
				+ ", previousBlockHash = " + previousBlockHash + "]";
	}
	

}
