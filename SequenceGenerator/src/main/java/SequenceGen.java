public class SequenceGen {
        public static void sequenceGen(int[] myArray, int min, int max) {
            test4();
            for (int i = 0; i< myArray.length; i++){
                int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
                myArray[i]=random_int;
            }
        }
        public static void test4(){
            System.out.println("hello word");
        }
    }
