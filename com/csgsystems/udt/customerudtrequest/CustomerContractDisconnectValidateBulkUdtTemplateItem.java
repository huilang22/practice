/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractDisconnectValidateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a CustomerContractDisconnectValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractDisconnectValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData ContractDisconnectValidateIn;
/**
 *
 * Constructor to create a  CustomerContractDisconnectValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractDisconnectValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData ContractDisconnectValidateInIn) {
    super(id, context, "CustomerContractDisconnectValidate");
    ContractDisconnectValidateIn = ContractDisconnectValidateInIn;
  }

  public void translateToMap() {
    if (ContractDisconnectValidateIn != null) {
      ContractDisconnectValidateIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(ContractDisconnectValidateIn, new HashMap(), "Void").get("Void"));
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ContractDisconnectValidateInIn Value of the ContractDisconnectValidateIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData ContractDisconnectValidateInIn) {
    ContractDisconnectValidateIn = ContractDisconnectValidateInIn;
  }

  public void translateFromMap() {
    ContractDisconnectValidateIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return ContractDisconnectValidateIn;
  }

}
