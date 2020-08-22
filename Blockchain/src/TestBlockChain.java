import java.util.ArrayList;
import com.google.gson.*;


public class TestBlockChain {
	

	public static void main(String[] args) {
		
		Blockchain tcpcoin = new Blockchain();
		
		Block a = new Block("0x22", new java.util.Date(), "To-test, from-demo, amount-1000");
		Block b = new Block("0x22", new java.util.Date(), "To-demo, from-abc, amount-500");
		Block c = new Block("0x22", new java.util.Date(), "To-abc, from-test, amount-100");
		
		tcpcoin.addBlock(a);
		tcpcoin.addBlock(b);
		tcpcoin.addBlock(c);
		
		String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(tcpcoin);       
        System.out.println(blockchainJson);
        
		//tcpcoin.getLatestBlock().setPrevioushash("ABCDEFG");
		
        //tcpcoin.displayChain();
		
        //tcpcoin.isValid();
	}	
	
}
