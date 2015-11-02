/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanCreateBulkUdtTemplateItem.java
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
 * Class used to create a DiscountPlanCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountPlanCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DPObjectData DPCreateIn;
/**
 *
 * Constructor to create a  DiscountPlanCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountPlanCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectData DPCreateInIn) {
    super(id, context, "DiscountPlanCreate");
    DPCreateIn = DPCreateInIn;
  }

  public void translateToMap() {
    if (DPCreateIn != null) {
      DPCreateIn.resetFlags(true, true);
      addInput("DiscountPlan", DPObjectHelper.toMap(DPCreateIn, new HashMap(), "DiscountPlan").get("DiscountPlan"));
    }
  }


/**
 *
 * Sets the DiscountPlan
 * @param DPCreateInIn Value of the DPCreateIn
 *
 */

  public void setDiscountPlan(DPObjectData DPCreateInIn) {
    DPCreateIn = DPCreateInIn;
  }

  public void translateFromMap() {
    DPCreateIn = DPObjectHelper.fromMap(inputMap, "DiscountPlan");
  }

/**
 *
 * Gets the DiscountPlan
 * @return Value of the DiscountPlan
 *
 */

  public DPObjectData getDiscountPlan( ) {
    return DPCreateIn;
  }

}
