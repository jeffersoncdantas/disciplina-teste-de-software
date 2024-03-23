public class Triangulo {

    public boolean isTriangulo(int ladoA, int ladoB, int ladoC) {
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);

        
    }

    public boolean isEscaleno(int ladoA, int ladoB, int ladoC) {
        if (isTriangulo(ladoA, ladoB, ladoC))
            return (ladoA != ladoB) && (ladoA != ladoC) && (ladoB != ladoC);
        return false;
    }


    public boolean isIsoceles(int ladoA, int ladoB, int ladoC) {
        if (isTriangulo(ladoA, ladoB, ladoC) && !isEquilatero(ladoA, ladoB, ladoC))
            return (ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC);
        return false;
    }

    public boolean isEquilatero(int ladoA, int ladoB, int ladoC) {
        if (isTriangulo(ladoA, ladoB, ladoC) )
            return (ladoA == ladoB) && (ladoB == ladoC);
        return false;
    }

}