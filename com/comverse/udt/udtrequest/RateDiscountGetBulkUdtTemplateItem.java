/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountGetBulkUdtTemplateItem.java
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
 * Class used to create a RateDiscountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateDiscountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateDiscountObjectKeyData rdGetIn;
/**
 *
 * Constructor to create a  RateDiscountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateDiscountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectKeyData rdGetInIn) {
    super(id, context, "RateDiscountGet");
    rdGetIn = rdGetInIn;
  }

  public void translateToMap() {
    if (rdGetIn != null) {
      rdGetIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(rdGetIn, new HashMap(), "RateDiscountObjectKeyData").get("RateDiscountObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateDiscount
 * @param rdGetInIn Value of the rdGetIn
 *
 */

  public void setRateDiscount(RateDiscountObjectKeyData rdGetInIn) {
    rdGetIn = rdGetInIn;
  }

  public void translateFromMap() {
    rdGetIn = RateDiscountObjectKeyHelper.fromMap(inputMap, "RateDiscount");
  }

/**
 *
 * Gets the RateDiscount
 * @return Value of the RateDiscount
 *
 */

  public RateDiscountObjectKeyData getRateDiscount( ) {
    return rdGetIn;
  }

}
