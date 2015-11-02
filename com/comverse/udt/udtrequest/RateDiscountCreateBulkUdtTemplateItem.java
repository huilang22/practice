/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateDiscountCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateDiscountCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateDiscountObjectData rdCrIn;
/**
 *
 * Constructor to create a  RateDiscountCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateDiscountCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectData rdCrInIn) {
    super(id, context, "RateDiscountCreate");
    rdCrIn = rdCrInIn;
  }

  public void translateToMap() {
    if (rdCrIn != null) {
      rdCrIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(rdCrIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }


/**
 *
 * Sets the RateDiscount
 * @param rdCrInIn Value of the rdCrIn
 *
 */

  public void setRateDiscount(RateDiscountObjectData rdCrInIn) {
    rdCrIn = rdCrInIn;
  }

  public void translateFromMap() {
    rdCrIn = RateDiscountObjectHelper.fromMap(inputMap, "RateDiscount");
  }

/**
 *
 * Gets the RateDiscount
 * @return Value of the RateDiscount
 *
 */

  public RateDiscountObjectData getRateDiscount( ) {
    return rdCrIn;
  }

}
