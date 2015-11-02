/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a PlanIdDiscountGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdDiscountGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PIDObjectData noOpIn;

/**
 *
 * Constructor to create a   PlanIdDiscountGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdDiscountGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectData noOpInIn) {
    super(id, context, "PlanIdDiscountGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(noOpIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }
/**
 *
 * Sets the  PlanIdDiscount
 * @param noOpInIn PIDObjectData to set
 *
 */
  public void setPlanIdDiscount(PIDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PlanIdDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public PIDObjectData getPlanIdDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PIDObjectHelper.fromMap(inputMap, "PlanIdDiscount");
  }
}
