/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractUpdateValidateBulkUdtTemplateItem.java
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
 * Class used to create a CustomerContractUpdateValidateBulkUdtTemplateItem Bulk Template
 *
 */

public class CustomerContractUpdateValidateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CustomerContractObjectBaseData ContractUpdateValidateIn;
  protected Date EffectiveDt;
/**
 *
 * Constructor to create a  CustomerContractUpdateValidateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CustomerContractUpdateValidateBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData ContractUpdateValidateInIn, Date EffectiveDtIn) {
    super(id, context, "CustomerContractUpdateValidate");
    ContractUpdateValidateIn = ContractUpdateValidateInIn;
    EffectiveDt = EffectiveDtIn;
  }

  public void translateToMap() {
    if (ContractUpdateValidateIn != null) {
      ContractUpdateValidateIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(ContractUpdateValidateIn, new HashMap(), "Void").get("Void"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
  }


/**
 *
 * Sets the CustomerContract
 * @param ContractUpdateValidateInIn Value of the ContractUpdateValidateIn
 *
 */

  public void setCustomerContract(CustomerContractObjectBaseData ContractUpdateValidateInIn) {
    ContractUpdateValidateIn = ContractUpdateValidateInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param EffectiveDtIn Value of the EffectiveDt
 *
 */

  public void setEffectiveDt(Date EffectiveDtIn) {
    EffectiveDt = EffectiveDtIn;
  }

  public void translateFromMap() {
    ContractUpdateValidateIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
  }

/**
 *
 * Gets the CustomerContract
 * @return Value of the CustomerContract
 *
 */

  public CustomerContractObjectBaseData getCustomerContract( ) {
    return ContractUpdateValidateIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return EffectiveDt;
  }

}
