public class AudioPlayer extends Product implements MultimediaControl {

  //Fields for the AudioPlayer class
  public String audioSpecification;
  public ItemType mediaType;

  /**
   * Default constructor for the AudioPlayer class.
   */
  public AudioPlayer() {
    super();
    mediaType = ItemType.AUDIO;
    audioSpecification = "Generic";
  }

  /**
   * Constructor that takes in 2 parameters – name and audioSpecification.
   * @param name String name is passed into parent constructor.
   * @param audioSpecification String that user will input for audio specification.
   */
  public AudioPlayer(String name, String audioSpecification) {
    super(name);
    mediaType = ItemType.AUDIO;
    this.audioSpecification = audioSpecification;
  }


  /**
   * Method to print that its playing media.
   */
  public void play() {
    System.out.println("Playing");
  }

  /**
   * Method to print that its stopping the media.
   */
  public void stop() {
    System.out.println("Stopping");
  }

  /**
   * Method to print that its playing the previous media.
   */
  public void previous() {
    System.out.println("Previous");
  }

  /**
   * Method to print that its playing the next media.
   */
  public void next() {
    System.out.println("Next");
  }

  /**
   * Method to return a template provided by Oracle from the parent toString.
   * Adds non-sample data.
   * @return The audio spec and type of the product
   */
  public String toString() {
    System.out.println(super.toString());
    return "Audio Spec        : " + audioSpecification + "\n"
        +  "Type              : " + mediaType + "\n";
  }

}
