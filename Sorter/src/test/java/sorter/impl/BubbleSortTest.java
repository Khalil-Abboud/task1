package sorter.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    public void happyCase(){
        BubbleSort BS = new BubbleSort();
        int[] ar = {9,2,0,4,8,6,7,5,1};
        BS.sorter(ar);
        Assertions.assertThat(ar).isSorted();
    }
}
