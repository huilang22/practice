/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodUpdateBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RPObjectData RPUpdateIn;
/**
 *
 * Constructor to create a  RatePeriodUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectData RPUpdateInIn) {
    super(id, context, "RatePeriodUpdate");
    RPUpdateIn = RPUpdateInIn;
  }

  public void translateToMap() {
    if (RPUpdateIn != null) {
      RPUpdateIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectHelper.toMap(RPUpdateIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }


/**
 *
 * Sets the RatePeriod
 * @param RPUpdateInIn Value of the RPUpdateIn
 *
 */

  public void setRatePeriod(RPObjectData RPUpdateInIn) {
    RPUpdateIn = RPUpdateInIn;
  }

  public void translateFromMap() {
    RPUpdateIn = RPObjectHelper.fromMap(inputMap, "RatePeriod");
  }

/**
 *
 * Gets the RatePeriod
 * @return Value of the RatePeriod
 *
 */

  public RPObjectData getRatePeriod( ) {
    return RPUpdateIn;
  }

}
