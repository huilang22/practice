/*
 * Generated code DO NOT EDIT
 * Generated file: PlanIdDiscountCreateBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdDiscountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdDiscountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PIDObjectData PIDCreateIn;
/**
 *
 * Constructor to create a  PlanIdDiscountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdDiscountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectData PIDCreateInIn) {
    super(id, context, "PlanIdDiscountCreate");
    PIDCreateIn = PIDCreateInIn;
  }

  public void translateToMap() {
    if (PIDCreateIn != null) {
      PIDCreateIn.resetFlags(true, true);
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDCreateIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PIDCreateInIn Value of the PIDCreateIn
 *
 */

  public void setPlanIdDiscount(PIDObjectData PIDCreateInIn) {
    PIDCreateIn = PIDCreateInIn;
  }

  public void translateFromMap() {
    PIDCreateIn = PIDObjectHelper.fromMap(inputMap, "PlanIdDiscount");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public PIDObjectData getPlanIdDiscount( ) {
    return PIDCreateIn;
  }

}
