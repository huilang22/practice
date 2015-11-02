/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PlanIdDiscountUpdateBulkUdtTemplateItem.java
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
 * Class used to create a PlanIdDiscountUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class PlanIdDiscountUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PIDObjectData PIDUpdateIn;
/**
 *
 * Constructor to create a  PlanIdDiscountUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PlanIdDiscountUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, PIDObjectData PIDUpdateInIn) {
    super(id, context, "PlanIdDiscountUpdate");
    PIDUpdateIn = PIDUpdateInIn;
  }

  public void translateToMap() {
    if (PIDUpdateIn != null) {
      PIDUpdateIn.resetFlags(true, true);
      addInput("PlanIdDiscount", PIDObjectHelper.toMap(PIDUpdateIn, new HashMap(), "PlanIdDiscount").get("PlanIdDiscount"));
    }
  }


/**
 *
 * Sets the PlanIdDiscount
 * @param PIDUpdateInIn Value of the PIDUpdateIn
 *
 */

  public void setPlanIdDiscount(PIDObjectData PIDUpdateInIn) {
    PIDUpdateIn = PIDUpdateInIn;
  }

  public void translateFromMap() {
    PIDUpdateIn = PIDObjectHelper.fromMap(inputMap, "PlanIdDiscount");
  }

/**
 *
 * Gets the PlanIdDiscount
 * @return Value of the PlanIdDiscount
 *
 */

  public PIDObjectData getPlanIdDiscount( ) {
    return PIDUpdateIn;
  }

}
