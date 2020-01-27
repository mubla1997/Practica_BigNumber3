class BigNumber {
    String num;

    // Constructor 1
    public BigNumber(String s) {
        this.num = s;  // Almacenaremos todos los números
    }

    // Constructor 2
    public BigNumber(BigNumber b) {

    }

    // Suma
    BigNumber add(BigNumber other) {
        /*int longi; // Variable en la que guardaremos el tamaño del número más grande de la suma.
        int result;
        String str = "";
        int add = 0;
        //  BigNumber result = new BigNumber("4"); // Con el resultado final

        if (other.num.length() > this.num.length()) {
            longi = other.num.length();
            while (longi != this.num.length()) {
                this.num = "0" + this.num;
            }
        } else {
            longi = this.num.length();
            while (longi != other.num.length()) {
                other.num = "0" + other.num;
            }
        }

        for (int i = 0; i < this.num.length(); i++) {
            result = (this.num.charAt(this.num.length() - i - 1) - 48) + (other.num.charAt(other.num.length() - i - 1) - 48) + add;

            if (result >= 10) {
                if (i == 0) {
                    this.num += "1" + this.num;
                    other.num += "0" + this.num;
                    result = result - 10;
                } else {
                    add = 1;
                    result = result - 10;
                }
            } else {
                add = 0;
            }
            str += String.valueOf(result);
        }
        BigNumber resultFinal = new BigNumber(str);
        return resultFinal;*/
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

    // Compara dos BigNumber. Torna 0 si són iguals, -1.
// si el primer és menor i torna 1 si el segon és menor
    public int compareTo(BigNumber other) {

        if (this.num.length() < other.num.length()) {
            other.num = Conversion(other.num, this.num.length());
        } else {
            this.num = Conversion(this.num, other.num.length());
        }
        if (this.num.length() == other.num.length()) {
            if (this.num.equals(other.num)) {
                return 0;
            } else {
                for (int i = 0; i < this.num.length(); i++) {
                    if (this.num.charAt(i) > other.num.charAt(i)) {
                        return 1;
                    } else if (this.num.charAt(i) < other.num.charAt(i)) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
    // Torna un String representant el número
    public String toString() {
        return null;
    }

    // Mira si dos objectes BigNumber són iguals
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (!(other instanceof BigNumber)) { // SI other no es un BigNumber dará error
            return false;
        }
        BigNumber Other = (BigNumber) other;

        if (Other.num.length() > this.num.length()){
            this.num = Conversion(this.num,Other.num.length());
        }else{
            Other.num = Conversion(Other.num,this.num.length());
        }
        return this.num.equals(Other.num);
    }

    public String Conversion(String str, int longi) {

        while(str.length() != longi){
               str = "0" + str;
        }
        return str;
    }
}