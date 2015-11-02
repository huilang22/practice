/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageBandDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RateCorridorUsageBandDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RateCorridorUsageBandDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RUBOverrideObjectKeyData RUBODeleteIn;
/**
 *
 * Constructor to create a  RateCorridorUsageBandDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RateCorridorUsageBandDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RUBOverrideObjectKeyData RUBODeleteInIn) {
    super(id, context, "RateCorridorUsageBandDelete");
    RUBODeleteIn = RUBODeleteInIn;
  }

  public void translateToMap() {
    if (RUBODeleteIn != null) {
      RUBODeleteIn.resetFlags(true, true);
      addInput("RateCorridorUsageBand", RUBOverrideObjectKeyHelper.toMap(RUBODeleteIn, new HashMap(), "RUBOverrideObjectKeyData").get("RUBOverrideObjectKeyData"));
    }
  }


/**
 *
 * Sets the RateCorridorUsageBand
 * @param RUBODeleteInIn Value of the RUBODeleteIn
 *
 */

  public void setRateCorridorUsageBand(RUBOverrideObjectKeyData RUBODeleteInIn) {
    RUBODeleteIn = RUBODeleteInIn;
  }

  public void translateFromMap() {
    RUBODeleteIn = RUBOverrideObjectKeyHelper.fromMap(inputMap, "RateCorridorUsageBand");
  }

/**
 *
 * Gets the RateCorridorUsageBand
 * @return Value of the RateCorridorUsageBand
 *
 */

  public RUBOverrideObjectKeyData getRateCorridorUsageBand( ) {
    return RUBODeleteIn;
  }

}
