public class Album {

  private final String title;
  private final String artist;
  private final String label;
  private final String producer;
  private final String country;
  private final String version;
  private final String genre;
  private final int yearRelease;
  private final boolean isRemaster;
  private final int yearOriginalRelease;
  private final int debitStandard;
  private final int debitAbonne;

  private Album(Builder builder) {
    this.title = builder.title;
    this.artist = builder.artiste;
    this.label = builder.label;
    this.producer = builder.producer;
    this.country = builder.country;
    this.version = builder.version;
    this.genre = builder.genre;
    this.yearRelease = builder.year_reveal;
    this.isRemaster = builder.isRemaster;
    this.yearOriginalRelease = builder.year_original_reveal;
    this.debitStandard = builder.debit_standard;
    this.debitAbonne = builder.debit_abonne;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Album:");

    if (title != null) builder.append(" ").append(title);
    if (artist != null) builder.append(", ").append(artist);
    if (label != null) builder.append(", ").append(label);
    if (producer != null) builder.append(", ").append(producer);
    if (country != null) builder.append(", ").append(country);
    if (version != null) builder.append(", ").append(version);
    if (genre != null) builder.append(", ").append(genre);
    if (yearRelease > 0) builder.append(", ").append(yearRelease);
    builder.append(", ").append(isRemaster ? "oui" : "non");
    if (yearOriginalRelease > 0) builder.append(", ").append(yearOriginalRelease);
    if (debitStandard > 0) builder.append(", ").append(debitStandard);
    if (debitAbonne > 0) builder.append(", ").append(debitAbonne);

    return builder.toString();
  }


  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public String getLabel() {
    return label;
  }

  public String getProducer() {
    return producer;
  }

  public String getCountry() {
    return country;
  }

  public String getVersion() {
    return version;
  }

  public String getGenre() {
    return genre;
  }

  public int getYearRelease() {
    return yearRelease;
  }

  public boolean isRemaster() {
    return isRemaster;
  }

  public int getYearOriginalRelease() {
    return yearOriginalRelease;
  }

  public int getDebitStandard() {
    return debitStandard;
  }

  public int getDebitAbonne() {
    return debitAbonne;
  }

  public static class Builder {

    private String title;
    private String artiste;
    private String label;
    private String producer;
    private String country;
    private String version;
    private String genre;
    private int year_reveal;
    private boolean isRemaster;
    private int year_original_reveal;
    private int debit_standard;
    private int debit_abonne;

    public Builder(String title, String artiste) {
      this.title = title;
      this.artiste = artiste;
    }

    public Album build() {
      return new Album(this);
    }

    public Builder setLabel(String label) {
      this.label = label;
      return this;
    }

    public Builder setProducer(String producer) {
      this.producer = producer;
      return this;
    }

    public Builder setCountry(String country) {
      this.country = country;
      return this;
    }

    public Builder setVersion(String version) {
      this.version = version;
      return this;
    }

    public Builder setGenre(String genre) {
      this.genre = genre;
      return this;
    }

    public Builder setYearReveal(int year_reveal) {
      this.year_reveal = year_reveal;
      return this;
    }

    public Builder setIsRemaster(boolean isRemaster) {
      this.isRemaster = isRemaster;
      return this;
    }

    public Builder setYearOriginalReveal(int year_original_reveal) {
      this.year_original_reveal = year_original_reveal;
      return this;
    }

    public Builder setDebitStandard(int debit_standard) {
      this.debit_standard = debit_standard;
      return this;
    }

    public Builder setDebitAbonne(int debit_abonne) {
      this.debit_abonne = debit_abonne;
      return this;
    }
  }
}
