//Nathalie Crespo
//Enum, data type with set constants and values
//ItemType AUDIO = new ItemType("AU");
//September 28, 2018

public enum ItemType {

  AUDIO("AU"),
  VISUAL("VI"),
  AUDIO_MOBILE("AM"),
  VIDEO_MOBILE("VM");

  //Required for enum to have a value
  private final String code;

  ItemType(String code) {
    this.code = code;
  }

}