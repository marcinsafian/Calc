class Calculator {

    public void adding(){
        System.out.println("Wlasnie dodaje");
    }

    public void sub (){
        System.out.println("Wlasnie odejmuje");
    }

    public static void main(String[] args){
        Calculator calc = new Calculator();
        calc.adding();
        calc.sub();
    }
}
