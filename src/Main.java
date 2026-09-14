public enum Main {
    ;

    public static void main(String[] args) {
        TrainElement loco1 = new DieselLocomotive();
        TrainElement loco2 = new ElectricLocomotive();

        System.out.println(loco1.getPrettyTop() + "\n" +loco1.getPrettyBody() + "\n" + loco1.getPrettyBottom() + "\n");
        System.out.println(loco2.getPrettyTop() + "\n" +loco2.getPrettyBody() + "\n" + loco2.getPrettyBottom() + "\n");

    }
}