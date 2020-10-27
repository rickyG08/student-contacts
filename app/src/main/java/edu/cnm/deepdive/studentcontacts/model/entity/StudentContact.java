package edu.cnm.deepdive.studentcontacts.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    indices = {
        @Index(value = {"student_id", "contact_id"}, unique = true)
    },
    foreignKeys = {
        @ForeignKey(
            entity = Student.class,
            parentColumns = "student_id",
            childColumns = "student_id",
            onDelete = ForeignKey.CASCADE
        ),
        @ForeignKey(
            entity = Contact.class,
            parentColumns = "contact_id",
            childColumns = "contact_id",
            onDelete = ForeignKey.CASCADE
        )
    }
)
public class StudentContact {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "student_contact_id")
  private long studentContactId;

  @ColumnInfo(name = "student_id", index = true)
  private long studentId;

  @ColumnInfo(name = "contact_id", index = true)
  private long contactId;

  private boolean primary;

  @NonNull
  @ColumnInfo(name = "relationship_type", index = true)
  private Relationship relationshipType = Relationship.OTHER;

  public long getStudentContactId() {
    return studentContactId;
  }

  public void setStudentContactId(long studentContactId) {
    this.studentContactId = studentContactId;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setStudentId(long studentId) {
    this.studentId = studentId;
  }

  public long getContactId() {
    return contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  public boolean isPrimary() {
    return primary;
  }

  public void setPrimary(boolean primary) {
    this.primary = primary;
  }

  @NonNull
  public Relationship getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(
      @NonNull Relationship relationshipType) {
    this.relationshipType = relationshipType;
  }

  public enum Relationship {
    PARENT, GUARDIAN, SIBLING, OTHER
  }
}
