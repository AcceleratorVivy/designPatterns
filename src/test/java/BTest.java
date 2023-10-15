import org.junit.jupiter.api.Test;

import java.util.BitSet;

public class BTest {
    @Test
    void f1(){
        BitSet bitSet = new BitSet();
        BitSet[] s = new BitSet[9];

        bitSet.set(64);
        System.out.println(bitSet);
        bitSet.flip(1);
        bitSet.flip(1);
        System.out.println(bitSet.size());
        System.out.println(bitSet.nextSetBit(2));
        System.out.println(bitSet.nextClearBit(1));
        bitSet.set(Integer.MAX_VALUE-65);
        System.out.println((long)bitSet.size());

        System.out.println(        bitSet.cardinality()
        );
        System.out.println(bitSet.length());
        System.out.println(bitSet.get(1));;
        System.out.println(bitSet);

    }
}
