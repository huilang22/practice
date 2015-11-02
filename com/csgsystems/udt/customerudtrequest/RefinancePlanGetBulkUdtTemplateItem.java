/*
 * Generated code DO NOT EDIT
 * Generated file: RefinancePlanGetBulkUdtTemplateItem.java
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
 * Class used to create a RefinancePlanGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RefinancePlanGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefinancePlanObjectKeyData RefinancePlanGetIn;
/**
 *
 * Constructor to create a  RefinancePlanGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefinancePlanGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RefinancePlanObjectKeyData RefinancePlanGetInIn) {
    super(id, context, "RefinancePlanGet");
    RefinancePlanGetIn = RefinancePlanGetInIn;
  }

  public void translateToMap() {
    if (RefinancePlanGetIn != null) {
      RefinancePlanGetIn.resetFlags(true, true);
      addInput("RefinancePlan", RefinancePlanObjectKeyHelper.toMap(RefinancePlanGetIn, new HashMap(), "RefinancePlanObjectKeyData").get("RefinancePlanObjectKeyData"));
    }
  }


/**
 *
 * Sets the RefinancePlan
 * @param RefinancePlanGetInIn Value of the RefinancePlanGetIn
 *
 */

  public void setRefinancePlan(RefinancePlanObjectKeyData RefinancePlanGetInIn) {
    RefinancePlanGetIn = RefinancePlanGetInIn;
  }

  public void translateFromMap() {
    RefinancePlanGetIn = RefinancePlanObjectKeyHelper.fromMap(inputMap, "RefinancePlan");
  }

/**
 *
 * Gets the RefinancePlan
 * @return Value of the RefinancePlan
 *
 */

  public RefinancePlanObjectKeyData getRefinancePlan( ) {
    return RefinancePlanGetIn;
  }

}
