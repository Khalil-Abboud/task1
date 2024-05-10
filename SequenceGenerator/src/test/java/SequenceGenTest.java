import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceGenTest {
    @Test
    public void happyCase (){
        int a=10;
        int b=1000;
        int[] ar = new int[10];
        SequenceGen.sequenceGen(ar,a,b);
        for(int i=0;i<ar.length;i++){
            Assertions.assertThat(ar[i]).isBetween(a,b);
        }
    }

}
