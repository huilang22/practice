/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerContractDeleteBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a CustomerContractDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseKeyData CustomerContractDeleteIn;
  protected Integer waive_termination_charge;
  protected Integer waive_commitment_charge;
  protected Date CCDCeaseDate;
/**
 *
 * Constructor to create a  CustomerContractDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseKeyData CustomerContractDeleteInIn, Integer waive_termination_chargeIn, Integer waive_commitment_chargeIn, Date CCDCeaseDateIn) {
    super(id, context, "CustomerContractDelete");
    CustomerContractDeleteIn = CustomerContractDeleteInIn;
    waive_termination_charge = waive_termination_chargeIn;
    waive_commitment_charge = waive_commitment_chargeIn;
    CCDCeaseDate = CCDCeaseDateIn;
  }

  public void translateToMap() {
    if (CustomerContractDeleteIn != null) {
      CustomerContractDeleteIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseKeyHelper.toMap(CustomerContractDeleteIn, new HashMap(), "CustomerContractObjectBaseKeyData").get("CustomerContractObjectBaseKeyData"));
    }
    if (waive_termination_charge != null) {
      addInput("WaiveTerminationCharge", waive_termination_charge);
    }
    if (waive_commitment_charge != null) {
      addInput("WaiveCommitmentCharge", waive_commitment_charge);
    }
    if (CCDCeaseDate != null) {
      addInput("CCDCeaseDate", CCDCeaseDate);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param CustomerContractDeleteInIn Value of the CustomerContractDeleteIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseKeyData CustomerContractDeleteInIn) {
    CustomerContractDeleteIn = CustomerContractDeleteInIn;
  }

/**
 *
 * Sets the WaiveTerminationCharge
 * @param waive_termination_chargeIn Value of the waive_termination_charge
 *
 */

  public void setWaiveTerminationCharge(Integer waive_termination_chargeIn) {
    waive_termination_charge = waive_termination_chargeIn;
  }

/**
 *
 * Sets the WaiveCommitmentCharge
 * @param waive_commitment_chargeIn Value of the waive_commitment_charge
 *
 */

  public void setWaiveCommitmentCharge(Integer waive_commitment_chargeIn) {
    waive_commitment_charge = waive_commitment_chargeIn;
  }

/**
 *
 * Sets the CCDCeaseDate
 * @param CCDCeaseDateIn Value of the CCDCeaseDate
 *
 */

  public void setCCDCeaseDate(Date CCDCeaseDateIn) {
    CCDCeaseDate = CCDCeaseDateIn;
  }

  public void translateFromMap() {
    CustomerContractDeleteIn = CustomerContractObjectBaseKeyHelper.fromMap(inputMap, "CustomerContract");
    waive_termination_charge = (Integer)inputMap.get("WaiveTerminationCharge");
    waive_commitment_charge = (Integer)inputMap.get("WaiveCommitmentCharge");
    CCDCeaseDate = (Date)inputMap.get("CCDCeaseDate");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseKeyData getCustomerContract( ) {
    return CustomerContractDeleteIn;
  }

/**
 *
 * Gets the WaiveTerminationCharge
 * @return Value of the WaiveTerminationCharge
 *
 */

  public Integer getWaiveTerminationCharge( ) {
    return waive_termination_charge;
  }

/**
 *
 * Gets the WaiveCommitmentCharge
 * @return Value of the WaiveCommitmentCharge
 *
 */

  public Integer getWaiveCommitmentCharge( ) {
    return waive_commitment_charge;
  }

/**
 *
 * Gets the CCDCeaseDate
 * @return Value of the CCDCeaseDate
 *
 */

  public Date getCCDCeaseDate( ) {
    return CCDCeaseDate;
  }

}
