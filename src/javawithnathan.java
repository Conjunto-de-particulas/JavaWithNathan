
public class javawithnathan {

    public static void main(String[] args) {
        int[] pesos = {234, 678, 987, 456, 899, 1000, 23};
        String[] sexos = {"M", "H", "H", "H", "M", "H", "M"};

        //print(pesos);
        bubbleSort(pesos, sexos);

        System.out.println();
        print(pesos, sexos);

    }

    public static void bubbleSort(int[] vector, String[] vector2) { //ALT + shift + f
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    String temp = vector2[j];
                    vector2[j] = vector2[j + 1];
                    vector2[j + 1] = temp;

                    int temp2 = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp2;
                }
            }
        }
    }

    public static void print(int[] vector, String[] vector2) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector2[i]);
            System.out.println(vector[i]);
            System.out.println();
        }
    }

}
