/*
 * Generated code DO NOT EDIT
 * Generated file: DiscountPlanGetBulkUdtTemplateItem.java
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
 * Class used to create a DiscountPlanGetBulkUdtTemplateItem Bulk Template
 *
 */

public class DiscountPlanGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DPObjectKeyData DPGetIn;
/**
 *
 * Constructor to create a  DiscountPlanGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DiscountPlanGetBulkUdtTemplateItem(String id, BSDMSessionContext context, DPObjectKeyData DPGetInIn) {
    super(id, context, "DiscountPlanGet");
    DPGetIn = DPGetInIn;
  }

  public void translateToMap() {
    if (DPGetIn != null) {
      DPGetIn.resetFlags(true, true);
      addInput("DiscountPlan", DPObjectKeyHelper.toMap(DPGetIn, new HashMap(), "DPObjectKeyData").get("DPObjectKeyData"));
    }
  }


/**
 *
 * Sets the DiscountPlan
 * @param DPGetInIn Value of the DPGetIn
 *
 */

  public void setDiscountPlan(DPObjectKeyData DPGetInIn) {
    DPGetIn = DPGetInIn;
  }

  public void translateFromMap() {
    DPGetIn = DPObjectKeyHelper.fromMap(inputMap, "DiscountPlan");
  }

/**
 *
 * Gets the DiscountPlan
 * @return Value of the DiscountPlan
 *
 */

  public DPObjectKeyData getDiscountPlan( ) {
    return DPGetIn;
  }

}
