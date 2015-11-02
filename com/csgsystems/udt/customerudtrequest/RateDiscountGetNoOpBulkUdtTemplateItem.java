/*
 * Generated code DO NOT EDIT
 * Generated file: RateDiscountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateDiscountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateDiscountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateDiscountObjectData noOpIn;

/**
 *
 * Constructor to create a   RateDiscountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateDiscountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectData noOpInIn) {
    super(id, context, "RateDiscountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(noOpIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
/**
 *
 * Sets the  RateDiscount
 * @param noOpInIn RateDiscountObjectData to set
 *
 */
  public void setRateDiscount(RateDiscountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public RateDiscountObjectData getRateDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateDiscountObjectHelper.fromMap(inputMap, "RateDiscount");
  }
}
