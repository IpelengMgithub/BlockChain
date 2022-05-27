package FirstBlockChain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
    // This is where we would write the code to generate the hash function

        List<FirstBlock> blockChainList=new ArrayList<>();

        FirstBlock first =new FirstBlock("first Blockchain!", 0);

        blockChainList.add(first);


        FirstBlock blockX = new FirstBlock("Hello",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockX);



        FirstBlock blockY = new FirstBlock("to",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockY);



        FirstBlock blockZ = new FirstBlock("my first blockchain program!",blockChainList.get(blockChainList.size()-1).hashCode());
        blockChainList.add(blockZ);

        System.out.println(" #################################################################  ");
        System.out.println( " A simple blockchain in Java has been created");
        System.out.println(" #################################################################  ");

        blockChainList.forEach(System.out::println);

        System.out.println(" #################################################################  ");

    }
}
