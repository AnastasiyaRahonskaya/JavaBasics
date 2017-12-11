package by.epam.catalog.bean;

import java.io.Serializable;

/**
 * Class contains constructor and getters
 * for Note' class fields
 */
public class Note implements Serializable {
  private String date;
  private String note;

  public Note() {
  }

  public Note(String date, String note) {
    this.date = date;
    this.note = note;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Note note = (Note) o;

    if (getDate() != null ? !getDate().equals(note.getDate()) : note.getDate() != null) return false;
    return getNote() != null ? getNote().equals(note.getNote()) : note.getNote() == null;
  }

  @Override
  public int hashCode() {
    int result = getDate() != null ? getDate().hashCode() : 0;
    result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Note{" +
        "date='" + date + '\'' +
        ", note='" + note + '\'' +
        '}';
  }
}
