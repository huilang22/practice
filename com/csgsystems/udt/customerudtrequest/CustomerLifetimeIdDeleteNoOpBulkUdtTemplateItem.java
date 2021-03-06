/*
 * Generated code DO NOT EDIT
 * Generated file: CustomerLifetimeIdDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CustomerLifetimeIdDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CustomerLifetimeIdDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CustomerLifetimeIdObjectData noOpIn;

/**
 *
 * Constructor to create a   CustomerLifetimeIdDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CustomerLifetimeIdDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CustomerLifetimeIdObjectData noOpInIn) {
    super(id, context, "CustomerLifetimeIdDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CustomerLifetimeId", CustomerLifetimeIdObjectHelper.toMap(noOpIn, new HashMap(), "CustomerLifetimeId").get("CustomerLifetimeId"));
    }
  }
/**
 *
 * Sets the  CustomerLifetimeId
 * @param noOpInIn CustomerLifetimeIdObjectData to set
 *
 */
  public void setCustomerLifetimeId(CustomerLifetimeIdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CustomerLifetimeId passed into the constructor
 * @return Simulated response
 *
 */
  public CustomerLifetimeIdObjectData getCustomerLifetimeId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CustomerLifetimeIdObjectHelper.fromMap(inputMap, "CustomerLifetimeId");
  }
}
