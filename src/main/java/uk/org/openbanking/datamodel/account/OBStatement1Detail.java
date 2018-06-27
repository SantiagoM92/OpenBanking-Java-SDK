/*
 * The contents of this file are subject to the terms of the Common Development and
 *  Distribution License (the License). You may not use this file except in compliance with the
 *  License.
 *
 *  You can obtain a copy of the License at https://forgerock.org/cddlv1-0/. See the License for the
 *  specific language governing permission and limitations under the License.
 *
 *  When distributing Covered Software, include this CDDL Header Notice in each file and include
 *  the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 *  Header, with the fields enclosed by brackets [] replaced by your own identifying
 *  information: "Portions copyright [year] [name of copyright owner]".
 *
 *  Copyright 2018 ForgeRock AS.
 *
 */

package uk.org.openbanking.datamodel.account;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import org.joda.time.DateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OBStatement1Detail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-06-25T23:06:46.214+01:00")

public class OBStatement1Detail   {
  @JsonProperty("AccountId")
  private String accountId = null;

  @JsonProperty("StatementId")
  private String statementId = null;

  @JsonProperty("StatementReference")
  private String statementReference = null;

  /**
   * Statement type, in a coded form.
   */
  public enum TypeEnum {
    ACCOUNTCLOSURE("AccountClosure"),
    
    ACCOUNTOPENING("AccountOpening"),
    
    ANNUAL("Annual"),
    
    INTERIM("Interim"),
    
    REGULARPERIODIC("RegularPeriodic");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("Type")
  private TypeEnum type = null;

  @JsonProperty("StartDateTime")
  private DateTime startDateTime = null;

  @JsonProperty("EndDateTime")
  private DateTime endDateTime = null;

  @JsonProperty("CreationDateTime")
  private DateTime creationDateTime = null;

  @JsonProperty("StatementDescription")
  @Valid
  private List<String> statementDescription = null;

  @JsonProperty("StatementBenefit")
  @Valid
  private List<OBStatement1StatementBenefit> statementBenefit = null;

  @JsonProperty("StatementFee")
  @Valid
  private List<OBStatement1StatementFee> statementFee = null;

  @JsonProperty("StatementInterest")
  @Valid
  private List<OBStatement1StatementInterest> statementInterest = null;

  @JsonProperty("StatementDateTime")
  @Valid
  private List<OBStatement1StatementDateTime> statementDateTime = null;

  @JsonProperty("StatementRate")
  @Valid
  private List<OBStatement1StatementRate> statementRate = null;

  @JsonProperty("StatementValue")
  @Valid
  private List<OBStatement1StatementValue> statementValue = null;

  @JsonProperty("StatementAmount")
  @Valid
  private List<OBStatement1StatementAmount> statementAmount = null;

  public OBStatement1Detail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @NotNull

@Size(min=1,max=40) 
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OBStatement1Detail statementId(String statementId) {
    this.statementId = statementId;
    return this;
  }

  /**
   * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
   * @return statementId
  **/
  @ApiModelProperty(value = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.")

@Size(min=1,max=40) 
  public String getStatementId() {
    return statementId;
  }

  public void setStatementId(String statementId) {
    this.statementId = statementId;
  }

  public OBStatement1Detail statementReference(String statementReference) {
    this.statementReference = statementReference;
    return this;
  }

  /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
  **/
  @ApiModelProperty(value = "Unique reference for the statement. This reference may be optionally populated if available.")

@Size(min=1,max=35) 
  public String getStatementReference() {
    return statementReference;
  }

  public void setStatementReference(String statementReference) {
    this.statementReference = statementReference;
  }

  public OBStatement1Detail type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Statement type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Statement type, in a coded form.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public OBStatement1Detail startDateTime(DateTime startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the statement period starts. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getStartDateTime() {
    return startDateTime;
  }

  public void setStartDateTime(DateTime startDateTime) {
    this.startDateTime = startDateTime;
  }

  public OBStatement1Detail endDateTime(DateTime endDateTime) {
    this.endDateTime = endDateTime;
    return this;
  }

  /**
   * Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the statement period ends. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getEndDateTime() {
    return endDateTime;
  }

  public void setEndDateTime(DateTime endDateTime) {
    this.endDateTime = endDateTime;
  }

  public OBStatement1Detail creationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
    return this;
  }

  /**
   * Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created. All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")
  @NotNull

  @Valid

  public DateTime getCreationDateTime() {
    return creationDateTime;
  }

  public void setCreationDateTime(DateTime creationDateTime) {
    this.creationDateTime = creationDateTime;
  }

  public OBStatement1Detail statementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement1Detail addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<String>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

  /**
   * Other descriptions that may be available for the statement resource.
   * @return statementDescription
  **/
  @ApiModelProperty(value = "Other descriptions that may be available for the statement resource.")


  public List<String> getStatementDescription() {
    return statementDescription;
  }

  public void setStatementDescription(List<String> statementDescription) {
    this.statementDescription = statementDescription;
  }

  public OBStatement1Detail statementBenefit(List<OBStatement1StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement1Detail addStatementBenefitItem(OBStatement1StatementBenefit statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<OBStatement1StatementBenefit>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a benefit or reward amount for the statement resource.
   * @return statementBenefit
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a benefit or reward amount for the statement resource.")

  @Valid

  public List<OBStatement1StatementBenefit> getStatementBenefit() {
    return statementBenefit;
  }

  public void setStatementBenefit(List<OBStatement1StatementBenefit> statementBenefit) {
    this.statementBenefit = statementBenefit;
  }

  public OBStatement1Detail statementFee(List<OBStatement1StatementFee> statementFee) {
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement1Detail addStatementFeeItem(OBStatement1StatementFee statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<OBStatement1StatementFee>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a fee for the statement resource.
   * @return statementFee
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a fee for the statement resource.")

  @Valid

  public List<OBStatement1StatementFee> getStatementFee() {
    return statementFee;
  }

  public void setStatementFee(List<OBStatement1StatementFee> statementFee) {
    this.statementFee = statementFee;
  }

  public OBStatement1Detail statementInterest(List<OBStatement1StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement1Detail addStatementInterestItem(OBStatement1StatementInterest statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<OBStatement1StatementInterest>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic interest amount related to the statement resource.
   * @return statementInterest
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic interest amount related to the statement resource.")

  @Valid

  public List<OBStatement1StatementInterest> getStatementInterest() {
    return statementInterest;
  }

  public void setStatementInterest(List<OBStatement1StatementInterest> statementInterest) {
    this.statementInterest = statementInterest;
  }

  public OBStatement1Detail statementDateTime(List<OBStatement1StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement1Detail addStatementDateTimeItem(OBStatement1StatementDateTime statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<OBStatement1StatementDateTime>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic date time for the statement resource.
   * @return statementDateTime
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic date time for the statement resource.")

  @Valid

  public List<OBStatement1StatementDateTime> getStatementDateTime() {
    return statementDateTime;
  }

  public void setStatementDateTime(List<OBStatement1StatementDateTime> statementDateTime) {
    this.statementDateTime = statementDateTime;
  }

  public OBStatement1Detail statementRate(List<OBStatement1StatementRate> statementRate) {
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement1Detail addStatementRateItem(OBStatement1StatementRate statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<OBStatement1StatementRate>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic rate related to the statement resource.
   * @return statementRate
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic rate related to the statement resource.")

  @Valid

  public List<OBStatement1StatementRate> getStatementRate() {
    return statementRate;
  }

  public void setStatementRate(List<OBStatement1StatementRate> statementRate) {
    this.statementRate = statementRate;
  }

  public OBStatement1Detail statementValue(List<OBStatement1StatementValue> statementValue) {
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement1Detail addStatementValueItem(OBStatement1StatementValue statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<OBStatement1StatementValue>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic number value related to the statement resource.
   * @return statementValue
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic number value related to the statement resource.")

  @Valid

  public List<OBStatement1StatementValue> getStatementValue() {
    return statementValue;
  }

  public void setStatementValue(List<OBStatement1StatementValue> statementValue) {
    this.statementValue = statementValue;
  }

  public OBStatement1Detail statementAmount(List<OBStatement1StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement1Detail addStatementAmountItem(OBStatement1StatementAmount statementAmountItem) {
    if (this.statementAmount == null) {
      this.statementAmount = new ArrayList<OBStatement1StatementAmount>();
    }
    this.statementAmount.add(statementAmountItem);
    return this;
  }

  /**
   * Set of elements used to provide details of a generic amount for the statement resource.
   * @return statementAmount
  **/
  @ApiModelProperty(value = "Set of elements used to provide details of a generic amount for the statement resource.")

  @Valid

  public List<OBStatement1StatementAmount> getStatementAmount() {
    return statementAmount;
  }

  public void setStatementAmount(List<OBStatement1StatementAmount> statementAmount) {
    this.statementAmount = statementAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement1Detail obStatement1Detail = (OBStatement1Detail) o;
    return Objects.equals(this.accountId, obStatement1Detail.accountId) &&
        Objects.equals(this.statementId, obStatement1Detail.statementId) &&
        Objects.equals(this.statementReference, obStatement1Detail.statementReference) &&
        Objects.equals(this.type, obStatement1Detail.type) &&
        Objects.equals(this.startDateTime, obStatement1Detail.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement1Detail.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement1Detail.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement1Detail.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement1Detail.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement1Detail.statementFee) &&
        Objects.equals(this.statementInterest, obStatement1Detail.statementInterest) &&
        Objects.equals(this.statementDateTime, obStatement1Detail.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement1Detail.statementRate) &&
        Objects.equals(this.statementValue, obStatement1Detail.statementValue) &&
        Objects.equals(this.statementAmount, obStatement1Detail.statementAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementDateTime, statementRate, statementValue, statementAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement1Detail {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

