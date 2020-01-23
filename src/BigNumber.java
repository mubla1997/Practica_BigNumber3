class BigNumber {
    double b;

    // Constructor 1
    public BigNumber(String s) {
    BigNumber n1 = new BigNumber("4");
    }
    // Constructor 2
    public BigNumber(BigNumber b) {
    BigNumber n2 = new BigNumber("3");
    }

    // Suma
    BigNumber add(BigNumber other) {

        return null;
    }
    // Resta
    BigNumber sub(BigNumber other) {
        return null;
    }
    // Multiplica
    BigNumber mult(BigNumber other) {
        return null;
    }
    // Divideix
    BigNumber div(BigNumber other) {
        return null;
    }
    // Arrel quadrada
    BigNumber sqrt() {
        return null;
    }
    // Potència
    BigNumber power(int n) {
        return null;
    }
    // Factorial
    BigNumber factorial() {
        return null;
    }
    // MCD. Torna el Màxim comú divisor
    BigNumber mcd(BigNumber other) {
        return null;
    }
    // Compara dos BigNumber. Torna 0 si són iguals, -1
// si el primer és menor i torna 1 si el segon és menor
    public int compareTo(BigNumber other) {
        if (this == other) {
            return 0;
        } else if (this.b < other.b) {
            return -1;
        } else if (this.b > other.b) {
            return 1;
        }
        return -5;
    }
    // Torna un String representant el número
    public String toString() {
        return null;
    }
    // Mira si dos objectes BigNumber són iguals
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }else if(!(other instanceof BigNumber)){ // SI other no es un BigNumber dará error
            return false;
        }
        return false;
    }
}
