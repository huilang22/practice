/*
 * Generated code DO NOT EDIT
 * Generated file: RateUnitCrGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUnitCrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUnitCrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUnitCrObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUnitCrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUnitCrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectData noOpInIn) {
    super(id, context, "RateUnitCrGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(noOpIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
/**
 *
 * Sets the  RateUnitCr
 * @param noOpInIn RateUnitCrObjectData to set
 *
 */
  public void setRateUnitCr(RateUnitCrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUnitCr passed into the constructor
 * @return Simulated response
 *
 */
  public RateUnitCrObjectData getRateUnitCr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUnitCrObjectHelper.fromMap(inputMap, "RateUnitCr");
  }
}
