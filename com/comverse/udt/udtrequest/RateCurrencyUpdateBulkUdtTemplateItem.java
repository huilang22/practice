/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RateCurrencyUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCurrencyUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCObjectData RCUpdateIn;
/**
 *
 * Constructor to create a  RateCurrencyUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCurrencyUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectData RCUpdateInIn) {
    super(id, context, "RateCurrencyUpdate");
    RCUpdateIn = RCUpdateInIn;
  }

  public void translateToMap() {
    if (RCUpdateIn != null) {
      RCUpdateIn.resetFlags(true, true);
      addInput("RateCurrency", RCObjectHelper.toMap(RCUpdateIn, new HashMap(), "RateCurrency").get("RateCurrency"));
    }
  }


/**
 *
 * Sets the RateCurrency
 * @param RCUpdateInIn Value of the RCUpdateIn
 *
 */

  public void setRateCurrency(RCObjectData RCUpdateInIn) {
    RCUpdateIn = RCUpdateInIn;
  }

  public void translateFromMap() {
    RCUpdateIn = RCObjectHelper.fromMap(inputMap, "RateCurrency");
  }

/**
 *
 * Gets the RateCurrency
 * @return Value of the RateCurrency
 *
 */

  public RCObjectData getRateCurrency( ) {
    return RCUpdateIn;
  }

}
