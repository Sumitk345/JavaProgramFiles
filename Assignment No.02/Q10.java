public class Q10 {
    public static void main(String[] args) {
        Object[] Obj = { "done", "none", 100, 105.64f, "Hello", 90.60f, 30.45f, 20, 99 };
        int l = Obj.length;

        int[] arr = getIntegerValues(Obj, l);
        System.out.println("\nIntegers :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        float[] arr2 = getFloatValues(Obj, l);
        System.out.println("\n\nFloat :");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        String[] arr3 = getString(Obj, l);
        System.out.println("\n\nStrings :");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static String[] getString(Object[] obj, int l) {

        String arr[] = new String[3];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (obj[i] instanceof String) {
                arr[j] = (String) obj[i];
                j++;
            }

        }
        return arr;
    }

    private static float[] getFloatValues(Object[] obj, int l) {
        float arr[] = new float[3];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (obj[i] instanceof Float) {
                arr[j] = (float) obj[i];
                j++;
            }

        }
        return arr;
    }

    private static int[] getIntegerValues(Object[] obj, int l) {
        int arr[] = new int[3];
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (obj[i] instanceof Integer) {
                arr[j] = (int) obj[i];
                j++;
            }

        }
        return arr;
    }
}
