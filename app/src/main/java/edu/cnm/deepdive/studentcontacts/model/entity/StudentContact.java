package edu.cnm.deepdive.studentcontacts.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(
    indices = {
        @Index(
            value = "relationship_type"
        )
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
  private Long studentContactId;

  @NonNull
  @ColumnInfo(name = "student_id")
  private Student studentId;

  @NonNull
  @ColumnInfo(name = "contact_id")
  private Contact contactId;

  private boolean primary;

  @NonNull
  @ColumnInfo(name = "relationship_type", index = true)
  private Relationship relationshipType;

  public enum Relationship {
    PARENT, GUARDIAN, SIBLING, OTHER
  }
}
