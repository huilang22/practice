/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodDeleteBulkUdtTemplateItem.java
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
 * Class used to create a RatePeriodDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class RatePeriodDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RPObjectKeyData RPDeleteIn;
/**
 *
 * Constructor to create a  RatePeriodDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RatePeriodDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectKeyData RPDeleteInIn) {
    super(id, context, "RatePeriodDelete");
    RPDeleteIn = RPDeleteInIn;
  }

  public void translateToMap() {
    if (RPDeleteIn != null) {
      RPDeleteIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectKeyHelper.toMap(RPDeleteIn, new HashMap(), "RPObjectKeyData").get("RPObjectKeyData"));
    }
  }


/**
 *
 * Sets the RatePeriod
 * @param RPDeleteInIn Value of the RPDeleteIn
 *
 */

  public void setRatePeriod(RPObjectKeyData RPDeleteInIn) {
    RPDeleteIn = RPDeleteInIn;
  }

  public void translateFromMap() {
    RPDeleteIn = RPObjectKeyHelper.fromMap(inputMap, "RatePeriod");
  }

/**
 *
 * Gets the RatePeriod
 * @return Value of the RatePeriod
 *
 */

  public RPObjectKeyData getRatePeriod( ) {
    return RPDeleteIn;
  }

}
