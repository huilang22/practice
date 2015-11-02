/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountDeleteBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdDiscountDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdDiscountDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PIDObjectKeyData PIDDeleteIn;
/**
 *
 * Constructor to create a  PlanIdDiscountDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdDiscountDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectKeyData PIDDeleteInIn) {
    super(id, context, "PlanIdDiscountDelete");
    PIDDeleteIn = PIDDeleteInIn;
  }

  public void translateToMap() {
    if (PIDDeleteIn != null) {
      PIDDeleteIn.resetFlags(true, true);
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(PIDDeleteIn, new HashMap(), "PIDObjectKeyData").get("PIDObjectKeyData"));
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PIDDeleteInIn Value of the PIDDeleteIn
 *
 */

  public void setPlanIdDiscount(PIDObjectKeyData PIDDeleteInIn) {
    PIDDeleteIn = PIDDeleteInIn;
  }

  public void translateFromMap() {
    PIDDeleteIn = PIDObjectKeyHelper.fromMap(inputMap, "PlanIdDiscount");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public PIDObjectKeyData getPlanIdDiscount( ) {
    return PIDDeleteIn;
  }

}
