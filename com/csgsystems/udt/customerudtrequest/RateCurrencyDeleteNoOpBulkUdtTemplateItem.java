/*
 * Generated code DO NOT EDIT
 * Generated file: RateCurrencyDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCurrencyDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCurrencyDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RCObjectData noOpIn;

/**
 *
 * Constructor to create a   RateCurrencyDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCurrencyDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectData noOpInIn) {
    super(id, context, "RateCurrencyDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateCurrency", RCObjectHelper.toMap(noOpIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }
/**
 *
 * Sets the  RateCurrency
 * @param noOpInIn RCObjectData to set
 *
 */
  public void setRateCurrency(RCObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCurrency passed into the constructor
 * @return Simulated response
 *
 */
  public RCObjectData getRateCurrency() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RCObjectHelper.fromMap(inputMap, "RateCurrency");
  }
}
