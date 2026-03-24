class Finally {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            show();  // this may throw exception

            int c = a / b;  // ArithmeticException

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bound " + e.getMessage());
        } finally {
            System.out.println("Exception handled successfully");
        }
    }

    static void show() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];

        // manually throwing exception
        if (5 > arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index 10 is invalid");
        }

        arr[10] = 20;
    }
}