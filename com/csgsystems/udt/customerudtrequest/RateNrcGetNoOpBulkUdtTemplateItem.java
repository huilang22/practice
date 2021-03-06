/*
 * Generated code DO NOT EDIT
 * Generated file: RateNrcGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateNrcGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateNrcGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateNrcObjectData noOpIn;

/**
 *
 * Constructor to create a   RateNrcGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateNrcGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateNrcObjectData noOpInIn) {
    super(id, context, "RateNrcGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateNrc", RateNrcObjectHelper.toMap(noOpIn, new HashMap(), "RateNrc").get("RateNrc"));
    }
  }
/**
 *
 * Sets the  RateNrc
 * @param noOpInIn RateNrcObjectData to set
 *
 */
  public void setRateNrc(RateNrcObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateNrc passed into the constructor
 * @return Simulated response
 *
 */
  public RateNrcObjectData getRateNrc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateNrcObjectHelper.fromMap(inputMap, "RateNrc");
  }
}
