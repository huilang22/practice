/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageImpliedDecimalGetBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageImpliedDecimalGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageImpliedDecimalGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageImpliedDecimalObjectKeyData RUIDGetIn;
/**
 *
 * Constructor to create a  RateUsageImpliedDecimalGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageImpliedDecimalGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageImpliedDecimalObjectKeyData RUIDGetInIn) {
    super(id, context, "RateUsageImpliedDecimalGet");
    RUIDGetIn = RUIDGetInIn;
  }

  public void translateToMap() {
    if (RUIDGetIn != null) {
      RUIDGetIn.resetFlags(true, true);
      addInput("RateUsageImpliedDecimal", RateUsageImpliedDecimalObjectKeyHelper.toMap(RUIDGetIn, new HashMap(), "RateUsageImpliedDecimalObjectKeyData").get("RateUsageImpliedDecimalObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsageImpliedDecimal
 * @param RUIDGetInIn Value of the RUIDGetIn
 *
 */

  public void setRateUsageImpliedDecimal(RateUsageImpliedDecimalObjectKeyData RUIDGetInIn) {
    RUIDGetIn = RUIDGetInIn;
  }

  public void translateFromMap() {
    RUIDGetIn = RateUsageImpliedDecimalObjectKeyHelper.fromMap(inputMap, "RateUsageImpliedDecimal");
  }

/**
 *
 * Gets the RateUsageImpliedDecimal
 * @return Value of the RateUsageImpliedDecimal
 *
 */

  public RateUsageImpliedDecimalObjectKeyData getRateUsageImpliedDecimal( ) {
    return RUIDGetIn;
  }

}
