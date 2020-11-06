public class Main {

    public static void main(String[] args) {
        Functional<String, Integer, Integer, Integer> c = new Functional<>() {
            int value;

            @Override
            public Integer Calc(String arg, Integer fn, Integer sn) {
                switch (arg) {
                    case "add":
                        return value = fn + sn;
                    case "pow":
                        return value = (int) Math.pow(fn, sn);
                    case "subtract":
                        return value = fn - sn;
                    default:
                        System.out.println("yo");
                }
                return value;
            }
        };
        System.out.println(c.Calc("subtract", 8, 6));
    }
}
