/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateDiscountDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateDiscountDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateDiscountObjectKeyData rdDeleteIn;
/**
 *
 * Constructor to create a  RateDiscountDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateDiscountDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectKeyData rdDeleteInIn) {
    super(id, context, "RateDiscountDelete");
    rdDeleteIn = rdDeleteInIn;
  }

  public void translateToMap() {
    if (rdDeleteIn != null) {
      rdDeleteIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectKeyHelper.toMap(rdDeleteIn, new HashMap(), "RateDiscountObjectKeyData").get("RateDiscountObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateDiscount
 * @param rdDeleteInIn Value of the rdDeleteIn
 *
 */

  public void setRateDiscount(RateDiscountObjectKeyData rdDeleteInIn) {
    rdDeleteIn = rdDeleteInIn;
  }

  public void translateFromMap() {
    rdDeleteIn = RateDiscountObjectKeyHelper.fromMap(inputMap, "RateDiscount");
  }

/**
 *
 * Gets the RateDiscount
 * @return Value of the RateDiscount
 *
 */

  public RateDiscountObjectKeyData getRateDiscount( ) {
    return rdDeleteIn;
  }

}
