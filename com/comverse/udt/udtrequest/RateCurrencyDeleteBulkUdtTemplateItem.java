/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCurrencyDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateCurrencyDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCurrencyDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RCObjectKeyData RCDeleteIn;
/**
 *
 * Constructor to create a  RateCurrencyDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCurrencyDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RCObjectKeyData RCDeleteInIn) {
    super(id, context, "RateCurrencyDelete");
    RCDeleteIn = RCDeleteInIn;
  }

  public void translateToMap() {
    if (RCDeleteIn != null) {
      RCDeleteIn.resetFlags(true, true);
      addInput("RateCurrency", RCObjectKeyHelper.toMap(RCDeleteIn, new HashMap(), "RCObjectKeyData").get("RCObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCurrency
 * @param RCDeleteInIn Value of the RCDeleteIn
 *
 */

  public void setRateCurrency(RCObjectKeyData RCDeleteInIn) {
    RCDeleteIn = RCDeleteInIn;
  }

  public void translateFromMap() {
    RCDeleteIn = RCObjectKeyHelper.fromMap(inputMap, "RateCurrency");
  }

/**
 *
 * Gets the RateCurrency
 * @return Value of the RateCurrency
 *
 */

  public RCObjectKeyData getRateCurrency( ) {
    return RCDeleteIn;
  }

}
