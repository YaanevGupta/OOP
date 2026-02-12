class SandNS {
    static int a = 10;
    int b = 20;

    public static void main(String[] args) {
        System.out.println("Static value: " + a);

        SandNS obj = new SandNS();
        System.out.println("Non-static value: " + obj.b);
    }
}
