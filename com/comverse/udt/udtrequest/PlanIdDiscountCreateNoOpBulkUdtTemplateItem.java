/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountCreateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a PlanIdDiscountCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PlanIdDiscountCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PIDObjectData noOpIn;

/**
 *
 * Constructor to create a   PlanIdDiscountCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PlanIdDiscountCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectData noOpInIn) {
    super(id, context, "PlanIdDiscountCreate");
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
