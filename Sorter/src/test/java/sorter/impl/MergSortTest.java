package sorter.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergSortTest {
    @Test
    public void happyCase(){
        MergeSort BS = new MergeSort();
        int[] ar = {9,2,0,4,8,6,7,5,1};
        BS.sorter(ar);
        Assertions.assertThat(ar).isSorted();
    }
}
