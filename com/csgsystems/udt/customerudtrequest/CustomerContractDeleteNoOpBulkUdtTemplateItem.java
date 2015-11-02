/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerContractDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CustomerContractDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerContractDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerContractObjectBaseData noOpIn;

/**
 *
 * Constructor to create a   CustomerContractDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerContractDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerContractObjectBaseData noOpInIn) {
    super(id, context, "CustomerContractDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerContract", CustomerContractObjectBaseHelper.toMap(noOpIn, new HashMap(), "CustomerContract").get("CustomerContract"));
    }
  }
/**
 *
 * Sets the  CustomerContract
 * @param noOpInIn CustomerContractObjectBaseData to set
 *
 */
  public void setCustomerContract(CustomerContractObjectBaseData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerContract passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerContractObjectBaseData getCustomerContract() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerContractObjectBaseHelper.fromMap(inputMap, "CustomerContract");
  }
}
