public class AnArray {
    public static void main(String[] args) {
        int[] anArray; //Declaración
        anArray = new int[20]; //Instanciación
        //Inicialización
        System.out.println(anArray.length); //Length = numero del Array, en este caso 20
        for(int i = 0; i < anArray.length; i++) {
            anArray[i] = (i + 1) * 100;
        }

        //Inicialización (Se puede hacer así pero es muy feo y tosco)
        //anArray[0] = 100;
        //anArray[1] = 200;
        //anArray[2] = 300;
        //anArray[3] = 400;
        //anArray[4] = 500;
        //anArray[5] = 600;
        //anArray[6] = 700;
        //anArray[7] = 800;
        //anArray[8] = 900;
        //anArray[9] = 1000;

        System.out.println("Element at index = " + anArray[0]);
        System.out.println("Element at index = " + anArray[1]);
        System.out.println("Element at index = " + anArray[2]);
        System.out.println("Element at index = " + anArray[3]);
        System.out.println("Element at index = " + anArray[4]);
        System.out.println("Element at index = " + anArray[5]);
        System.out.println("Element at index = " + anArray[6]);
        System.out.println("Element at index = " + anArray[7]);
        System.out.println("Element at index = " + anArray[8]);
        System.out.println("Element at index = " + anArray[9]);

    }
}
