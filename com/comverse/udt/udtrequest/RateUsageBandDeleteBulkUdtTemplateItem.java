/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageBandDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageBandDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageBandObjectKeyData RUDeleteIn;
/**
 *
 * Constructor to create a  RateUsageBandDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageBandDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectKeyData RUDeleteInIn) {
    super(id, context, "RateUsageBandDelete");
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateToMap() {
    if (RUDeleteIn != null) {
      RUDeleteIn.resetFlags(true, true);
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(RUDeleteIn, new HashMap(), "RateUsageBandObjectKeyData").get("RateUsageBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsageBand
 * @param RUDeleteInIn Value of the RUDeleteIn
 *
 */

  public void setRateUsageBand(RateUsageBandObjectKeyData RUDeleteInIn) {
    RUDeleteIn = RUDeleteInIn;
  }

  public void translateFromMap() {
    RUDeleteIn = RateUsageBandObjectKeyHelper.fromMap(inputMap, "RateUsageBand");
  }

/**
 *
 * Gets the RateUsageBand
 * @return Value of the RateUsageBand
 *
 */

  public RateUsageBandObjectKeyData getRateUsageBand( ) {
    return RUDeleteIn;
  }

}
