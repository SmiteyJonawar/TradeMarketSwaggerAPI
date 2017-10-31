package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Description of a person to interact with
 */
@ApiModel(description = "Description of a person to interact with")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-31T08:44:06.937Z")
public class Member {
  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("age")
  private Integer age = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("id")
  private Integer id = null;

  public Member email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the member
   * @return email
  **/
  @ApiModelProperty(value = "The email of the member")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Member firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The name of the member
   * @return firstName
  **/
  @ApiModelProperty(value = "The name of the member")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Member lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The surname of the member
   * @return lastName
  **/
  @ApiModelProperty(value = "The surname of the member")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Member address(String address) {
    this.address = address;
    return this;
  }

   /**
   * The address of the member
   * @return address
  **/
  @ApiModelProperty(value = "The address of the member")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Member phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The phone number of the member
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "The phone number of the member")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Member age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * The age of the member
   * @return age
  **/
  @ApiModelProperty(value = "The age of the member")
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Member password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password of the member
   * @return password
  **/
  @ApiModelProperty(value = "The password of the member")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Member id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the member
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the member")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.email, member.email) &&
        Objects.equals(this.firstName, member.firstName) &&
        Objects.equals(this.lastName, member.lastName) &&
        Objects.equals(this.address, member.address) &&
        Objects.equals(this.phoneNumber, member.phoneNumber) &&
        Objects.equals(this.age, member.age) &&
        Objects.equals(this.password, member.password) &&
        Objects.equals(this.id, member.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, lastName, address, phoneNumber, age, password, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

