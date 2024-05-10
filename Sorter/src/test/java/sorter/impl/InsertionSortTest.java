package sorter.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    @Test
    public void happyCase(){
        InsertionSort IS = new InsertionSort();
        int[] ar = {9,2,0,4,8,6,7,5,1};
        IS.sorter(ar);
        Assertions.assertThat(ar).isSorted();
    }
}
