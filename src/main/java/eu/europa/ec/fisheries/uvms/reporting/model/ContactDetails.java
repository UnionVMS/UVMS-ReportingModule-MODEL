package eu.europa.ec.fisheries.uvms.reporting.model;

import java.io.Serializable;

/**
 * Contact details.
 */
public class ContactDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String mobileNumber;
	private String faxNumber;
	private String eMail;
  private String organisationName;

  /**
   * Creates a new instance.
   */
  public ContactDetails() {
  }

  
  /**
   * Get the value of firstName
   *
   * @return the value of firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Set the value of firstName
   *
   * @param firstName new value of firstName
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Get the value of lastName
   *
   * @return the value of lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Set the value of lastName
   *
   * @param lastName new value of lastName
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Get the value of phoneNumber
   *
   * @return the value of phoneNumber
   */
  public String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Set the value of phoneNumber
   *
   * @param phoneNumber new value of phoneNumber
   */
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  /**
   * Get the value of mobileNumber
   *
   * @return the value of mobileNumber
   */
  public String getMobileNumber() {
    return mobileNumber;
  }

  /**
   * Set the value of mobileNumber
   *
   * @param mobileNumber new value of mobileNumber
   */
  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  /**
   * Get the value of faxNumber
   *
   * @return the value of faxNumber
   */
  public String getFaxNumber() {
    return faxNumber;
  }

  /**
   * Set the value of faxNumber
   *
   * @param faxNumber new value of faxNumber
   */
  public void setFaxNumber(String faxNumber) {
    this.faxNumber = faxNumber;
  }


  /**
   * Get the value of eMail
   *
   * @return the value of eMail
   */
  public String geteMail() {
    return eMail;
  }

  /**
   * Set the value of eMail
   *
   * @param eMail new value of eMail
   */
  public void seteMail(String eMail) {
    this.eMail = eMail;
  }

  /**
   * Get the value of organisationName
   *
   * @return the value of organisationName
   */
  public String getOrganisationName() {
    return organisationName;
  }

  /**
   * Set the value of organisationName
   *
   * @param organisationName new value of organisationName
   */
  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }

  /**
   * Formats a human-readable view of this instance.
   * 
   * @return a human-readable view
   */
  @Override
  public String toString() 
  {
    return "ContactDetails{" + 
            "firstName=" + firstName + 
            ", lastName=" + lastName + 
            ", phoneNumber=" + phoneNumber + 
            ", mobileNumber=" + mobileNumber + 
            ", faxNumber=" + faxNumber + 
            ", eMail=" + eMail + 
            ", organisationName=" + organisationName + 
            '}';
  }
}
