/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUsageBandGetBulkUdtTemplateItem.java
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
 * Class used to create a RateUsageBandGetBulkUdtTemplateItem Bulk Template
 *
 */

public class RateUsageBandGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RateUsageBandObjectKeyData RUGetIn;
/**
 *
 * Constructor to create a  RateUsageBandGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateUsageBandGetBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUsageBandObjectKeyData RUGetInIn) {
    super(id, context, "RateUsageBandGet");
    RUGetIn = RUGetInIn;
  }

  public void translateToMap() {
    if (RUGetIn != null) {
      RUGetIn.resetFlags(true, true);
      addInput("RateUsageBand", RateUsageBandObjectKeyHelper.toMap(RUGetIn, new HashMap(), "RateUsageBandObjectKeyData").get("RateUsageBandObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateUsageBand
 * @param RUGetInIn Value of the RUGetIn
 *
 */

  public void setRateUsageBand(RateUsageBandObjectKeyData RUGetInIn) {
    RUGetIn = RUGetInIn;
  }

  public void translateFromMap() {
    RUGetIn = RateUsageBandObjectKeyHelper.fromMap(inputMap, "RateUsageBand");
  }

/**
 *
 * Gets the RateUsageBand
 * @return Value of the RateUsageBand
 *
 */

  public RateUsageBandObjectKeyData getRateUsageBand( ) {
    return RUGetIn;
  }

}
