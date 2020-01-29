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
        int longi; // Variable en la que guardaremos el tamaño del número más grande de la suma.
        int result; // Variable donde almacenaremos el resultado de las sumas.
        String str = ""; // Variable donde almacenaremos el resultado final de la suma en String.
        int add = 0; // Variable que utilizaremos para ir añadiendo los numeros sobrantes de las sumas.

        // Añadiremos un 0 extra en caso de que necesitemos añadir un 1 en el último bucle.
        this.num = "0" + this.num;
        other.num = "0" + other.num;

        //Pondremos una serie de condiciones en las cuales intentaremos igualar ambos números añadiendo 0 a la izquierda.
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
        // Realizaremos las sumas:
        for (int i = 0; i < this.num.length(); i++) {
            result = (this.num.charAt(this.num.length() - i - 1) - 48) + (other.num.charAt(other.num.length() - i - 1) - 48) + add;

            if (result >= 10) {
                    add = 1;
                    result = result - 10;
                }
             else {
                add = 0;
            }

            str = String.valueOf(result) + str; // necesitamos hacer un reverse del resultado al volver a pasarlo a string.

        }
        BigNumber resultFinal = new BigNumber(str);
        return resultFinal;
    }

    // Resta
    BigNumber sub(BigNumber other) {
        int longi; // Variable en la que guardaremos el tamaño del número más grande de la suma.
        int result; // Variable donde almacenaremos el resultado de las sumas.
        String str = ""; // Variable donde almacenaremos el resultado final de la suma en String.
        int add = 0; // Variable que utilizaremos para ir añadiendo los numeros sobrantes de las sumas.

        // Añadiremos un 0 extra en caso de que necesitemos añadir un 1 en el último bucle.
        this.num = "0" + this.num;
        other.num = "0" + other.num;

        //Pondremos una serie de condiciones en las cuales intentaremos igualar ambos números añadiendo 0 a la izquierda.
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
        // Realizaremos las restas:
        for (int i = 0; i < this.num.length(); i++) {
            result = (this.num.charAt(this.num.length() - i - 1) - 48) - (other.num.charAt(other.num.length() - i - 1) - 48) - add;

            if (result < 0) {
                add = 1;
                result = result + 10;
            }
            else {
                add = 0;
            }

            str = String.valueOf(result) + str; // necesitamos hacer un reverse del resultado al volver a pasarlo a string.

        }
        BigNumber resultFinal = new BigNumber(str);
        return resultFinal;
    }

    // Multiplica
    BigNumber mult(BigNumber other) {

        int result; // Variable que utilizaremos para ir almacenando los resultados de las multiplicaciones.
        int mult; // Variable que utilizaremos para escoger el número para realizar la multiplicación.
        int add = 0;  // Variable que utilizaremos para separar los números > 10.
        int sum = 0; // Variable que utilizaremos para realizar las sumas de las multipicaciones.
        String str = "";
        BigNumber[] GG = new BigNumber[other.num.length()];


        // En este bucle cogeremos el número que usaremos para multiplicar
        for (int i = 0; i < other.num.length(); i++) {

            mult = (other.num.charAt(other.num.length() - i - 1) - 48);

            // En este bucle realizaremos la multiplicación
            for (int j = 0; j < this.num.length() ; j++) {
                result = ((this.num.charAt(this.num.length() -i -1) -48) * mult)  + sum;

                if(result < 10){
                    add = 0;
                }else if(result > 10) {
                    while (result != add) {
                        add++;
                    }
                    if(add >= 10){
                        sum = 1 + sum;
                        add = add - 10;
                        result = result -10;

                    }
                }
                str = String.valueOf(result) + str; // Vamos almacenando el resultado final de cada multiplicación.

            }

            String conver = Conversion2(str,i);
            BigNumber converBig = new BigNumber(conver);
            GG[i] = converBig;
             str ="";
        }

        BigNumber resultFinal = GG[0];

        for (int i = 0; i < GG.length-1; i++) {
            resultFinal = GG[i].add(GG[i+1]);
        }
        return resultFinal;
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

        //Buscamos el número más pequeño y lo igualamos añadiendo ceros a la izquierda.
        if (other.num.length() < this.num.length()) {
            other.num = Conversion(other.num, this.num.length());
        } else {
            this.num = Conversion(this.num, other.num.length());
        }
        //Realizamos las comparaciones:
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
        BigNumber Other = (BigNumber) other;

        if (this == other) {
            return true;
        }
        if (!(other instanceof BigNumber)) { // SI other no es un BigNumber dará error
            return false;
        }

        if (Other.num.length() > this.num.length()){
            this.num = Conversion(this.num,Other.num.length());
        }else{
            Other.num = Conversion(Other.num,this.num.length());
        }
        return this.num.equals(Other.num);
    }

    // Añade ceros a la izquierda (para igualar los números)
    public String Conversion(String str, int longg) {

        while(str.length() != longg){
               str = "0" + str;
        }
        return str;
    }

    // Añade ceros a la derecha (para realizar la suma de la multiplicación.
    public String Conversion2(String str, int num0){
        for (int i = 0; i < num0; i++) {
            str = str + "0";
        }
        return str;
    }
}