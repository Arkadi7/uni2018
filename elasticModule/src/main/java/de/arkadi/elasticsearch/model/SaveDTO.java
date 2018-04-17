package de.arkadi.elasticsearch.model;

public class SaveDTO {

  private String id;
  private String text;

  public SaveDTO(String id, String message) {

    this.id = id;
    this.text = message;
  }

  public String getId() {

    return id;
  }

  public void setId(String id) {

    this.id = id;
  }

  public String getText() {

    return text;
  }

  public void setText(String text) {

    this.text = text;
  }

  @Override
  public String toString() {

    return id + "\n " + text + "\n";
  }
}
