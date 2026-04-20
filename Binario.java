public class Binario {
    public static void main(String[] args) {
        int bitMask = 0x000f;
        int val = 0x2222;
        System.out.println(val & bitMask);
    }
}
// Operadores bitwise atuam de forma logica, auxiliando na economia de 
// do hardware. Atuam no nível mais lógico.
