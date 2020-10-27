package edu.cnm.deepdive.studentcontacts.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Contact {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "contact_id")
  private long contactId;

  @NonNull
  @ColumnInfo(name = "last_name")
  private String lastName;

  @NonNull
  @ColumnInfo(name = "first_name")
  private String firstName;

  @ColumnInfo(name = "middle_name")
  private String middleName;

  @NonNull
  @ColumnInfo(name = "phone_number")
  private String phoneNumber;

  @ColumnInfo(name = "sms_number")
  private String smsNumber;

  private String email;

  public long getContactId() {
    return contactId;
  }

  public void setContactId(long contactId) {
    this.contactId = contactId;
  }

  @NonNull
  public String getLastName() {
    return lastName;
  }

  public void setLastName(@NonNull String lastName) {
    this.lastName = lastName;
  }

  @NonNull
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(@NonNull String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @NonNull
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(@NonNull String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getSmsNumber() {
    return smsNumber;
  }

  public void setSmsNumber(String smsNumber) {
    this.smsNumber = smsNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
