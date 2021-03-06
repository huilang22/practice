/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountPlanGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountPlanGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DPObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountPlanGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountPlanGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectData noOpInIn) {
    super(id, context, "DiscountPlanGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountPlan", DPObjectHelper.toMap(noOpIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }
/**
 *
 * Sets the  DiscountPlan
 * @param noOpInIn DPObjectData to set
 *
 */
  public void setDiscountPlan(DPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountPlan passed into the constructor
 * @return Simulated response
 *
 */
  public DPObjectData getDiscountPlan() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DPObjectHelper.fromMap(inputMap, "DiscountPlan");
  }
}
