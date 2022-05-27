package FirstBlockChain;
import java.util.Arrays;

public class FirstBlock {

    private int previousHash;
    private String data;
    private int hash;

    public FirstBlock(String data, int previousHash){
        this.data= data;
        this.previousHash= previousHash;

//  from this we are creating the hash
        this.hash = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});
    }

}
