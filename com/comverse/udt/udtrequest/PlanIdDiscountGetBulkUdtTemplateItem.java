/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountGetBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdDiscountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdDiscountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PIDObjectKeyData PIDGetIn;
/**
 *
 * Constructor to create a  PlanIdDiscountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdDiscountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectKeyData PIDGetInIn) {
    super(id, context, "PlanIdDiscountGet");
    PIDGetIn = PIDGetInIn;
  }

  public void translateToMap() {
    if (PIDGetIn != null) {
      PIDGetIn.resetFlags(true, true);
      addInput("PlanIdDiscount", PIDObjectKeyHelper.toMap(PIDGetIn, new HashMap(), "PIDObjectKeyData").get("PIDObjectKeyData"));
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PIDGetInIn Value of the PIDGetIn
 *
 */

  public void setPlanIdDiscount(PIDObjectKeyData PIDGetInIn) {
    PIDGetIn = PIDGetInIn;
  }

  public void translateFromMap() {
    PIDGetIn = PIDObjectKeyHelper.fromMap(inputMap, "PlanIdDiscount");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public PIDObjectKeyData getPlanIdDiscount( ) {
    return PIDGetIn;
  }

}
