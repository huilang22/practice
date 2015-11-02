/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DiscountPlanDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountPlanDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DPObjectKeyData DPDeleteIn;
/**
 *
 * Constructor to create a  DiscountPlanDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountPlanDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectKeyData DPDeleteInIn) {
    super(id, context, "DiscountPlanDelete");
    DPDeleteIn = DPDeleteInIn;
  }

  public void translateToMap() {
    if (DPDeleteIn != null) {
      DPDeleteIn.resetFlags(true, true);
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(DPDeleteIn, new HashMap(), "DPObjectKeyData").get("DPObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountPlan
 * @param DPDeleteInIn Value of the DPDeleteIn
 *
 */

  public void setDiscountPlan(DPObjectKeyData DPDeleteInIn) {
    DPDeleteIn = DPDeleteInIn;
  }

  public void translateFromMap() {
    DPDeleteIn = DPObjectKeyHelper.fromMap(inputMap, "DiscountPlan");
  }

/**
 *
 * Gets the DiscountPlan
 * @return Value of the DiscountPlan
 *
 */

  public DPObjectKeyData getDiscountPlan( ) {
    return DPDeleteIn;
  }

}
