/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateCorridorUsageCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateCorridorUsageCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateCorridorUsageCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RCUsageObjectData noOpIn;

/**
 *
 * Constructor to create a   RateCorridorUsageCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateCorridorUsageCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RCUsageObjectData noOpInIn) {
    super(id, context, "RateCorridorUsageCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateCorridorUsage", RCUsageObjectHelper.toMap(noOpIn, new HashMap(), "RateCorridorUsage").get("RateCorridorUsage"));
    }
  }
/**
 *
 * Sets the  RateCorridorUsage
 * @param noOpInIn RCUsageObjectData to set
 *
 */
  public void setRateCorridorUsage(RCUsageObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateCorridorUsage passed into the constructor
 * @return Simulated response
 *
 */
  public RCUsageObjectData getRateCorridorUsage() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RCUsageObjectHelper.fromMap(inputMap, "RateCorridorUsage");
  }
}
