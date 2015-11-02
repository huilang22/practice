/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerServiceCenterGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CustomerServiceCenterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerServiceCenterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerServiceCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerServiceCenterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerServiceCenterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerServiceCenterObjectData noOpInIn) {
    super(id, context, "CustomerServiceCenterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerServiceCenter", CustomerServiceCenterObjectHelper.toMap(noOpIn, new HashMap(), "CustomerServiceCenter").get("CustomerServiceCenter"));
    }
  }
/**
 *
 * Sets the  CustomerServiceCenter
 * @param noOpInIn CustomerServiceCenterObjectData to set
 *
 */
  public void setCustomerServiceCenter(CustomerServiceCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerServiceCenter passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerServiceCenterObjectData getCustomerServiceCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerServiceCenterObjectHelper.fromMap(inputMap, "CustomerServiceCenter");
  }
}
