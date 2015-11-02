/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyCreateBulkUdtTemplateItem.java
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
 * Class used to create a RateCurrencyCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCurrencyCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCObjectData RCCreateIn;
/**
 *
 * Constructor to create a  RateCurrencyCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCurrencyCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectData RCCreateInIn) {
    super(id, context, "RateCurrencyCreate");
    RCCreateIn = RCCreateInIn;
  }

  public void translateToMap() {
    if (RCCreateIn != null) {
      RCCreateIn.resetFlags(true, true);
      addInput("RateCurrency", RCObjectHelper.toMap(RCCreateIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }


/**
 *
 * Sets the RateCurrency
 * @param RCCreateInIn Value of the RCCreateIn
 *
 */

  public void setRateCurrency(RCObjectData RCCreateInIn) {
    RCCreateIn = RCCreateInIn;
  }

  public void translateFromMap() {
    RCCreateIn = RCObjectHelper.fromMap(inputMap, "RateCurrency");
  }

/**
 *
 * Gets the RateCurrency
 * @return Value of the RateCurrency
 *
 */

  public RCObjectData getRateCurrency( ) {
    return RCCreateIn;
  }

}
