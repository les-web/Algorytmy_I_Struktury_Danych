package Algorytmy.rekurencja.Tablice.stack;

public class StackTab {

    int[] stack;
    //    int size;
    int index;

    public StackTab(int size) {
        //       this.size = size;
        stack = new int[size];
    }

    public int pop() throws Exception {
        if (index == 0) {
            throw new Exception("Stos jest pusty");
        }
        index = index - 1;
        return stack[index];
    }

    public int peek() throws Exception {
        if (index == 0) {
            throw new Exception("Stos jest pusty");
        }
        return stack[index-1];
    }

    public int search(int value) {
        int out = -1;
        for (int j = index-1; j >= 0; j--) {
            if (stack[j] == value) {
                out = j+1;
                break;

            }
        }
        return out;
    }

    public int getSize() {
        return index;
    }

    public int push(int value) throws Exception {
        if (index >= stack.length - 1) {
            throw new Exception("Nie można dodać więcej");
        } else {
            stack[index] = value;
            index = index + 1;
            return value;
        }
    }

    public void print() {
        System.out.println("[ ");
        for (int i = 0; (i>0 && i < index-2); i++) {
            System.out.print(stack[i] + " , ");

        }
        System.out.print(stack[index-1]+ "  ]");
        System.out.println();
    }
}