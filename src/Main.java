public class Main {

  public static void main(String[] args) {
    Album lonerism = new Album.Builder("Lonerism",
        "Tame Impala")
        .setCountry("Australie")
        .setYearReveal(2012)
        .setGenre("indie rock")
        .build();

    Album orange = new Album.Builder("channel ORANGE",
        "Frank Ocean")
        .setYearReveal(2012)
        .setGenre("R&B")
        .build();

    Album visions = new Album.Builder("Visions",
        "Grimes")
        .setYearOriginalReveal(2012)
        .setLabel("4AD")
        .setGenre("Electronic")
        .build();
    System.out.println("-----ALBUM-----");
    System.out.println(lonerism);
    System.out.println(orange);
    System.out.println(visions);
  }
}
