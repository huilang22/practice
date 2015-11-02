/*
 * Generated code DO NOT EDIT
 * Generated file: OverrideDiscountRateCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OverrideDiscountRateCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideDiscountRateCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RDOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   OverrideDiscountRateCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideDiscountRateCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectData noOpInIn) {
    super(id, context, "OverrideDiscountRateCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
/**
 *
 * Sets the  OverrideDiscountRate
 * @param noOpInIn RDOverrideObjectData to set
 *
 */
  public void setOverrideDiscountRate(RDOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideDiscountRate passed into the constructor
 * @return Simulated response
 *
 */
  public RDOverrideObjectData getOverrideDiscountRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RDOverrideObjectHelper.fromMap(inputMap, "OverrideDiscountRate");
  }
}
