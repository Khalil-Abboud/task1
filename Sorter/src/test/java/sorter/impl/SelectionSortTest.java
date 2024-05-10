package sorter.impl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    @Test
    public void happyCase(){
        SelectionSort SS = new SelectionSort();
        int[] ar = {9,2,0,4,8,6,7,5,1};
        SS.sorter(ar);
        Assertions.assertThat(ar).isSorted();
    }
}
