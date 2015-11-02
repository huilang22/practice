/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RPObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectData noOpInIn) {
    super(id, context, "RatePeriodGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RatePeriod", RPObjectHelper.toMap(noOpIn, new HashMap(), "RatePeriod").get("RatePeriod"));
    }
  }
/**
 *
 * Sets the  RatePeriod
 * @param noOpInIn RPObjectData to set
 *
 */
  public void setRatePeriod(RPObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RatePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RPObjectData getRatePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RPObjectHelper.fromMap(inputMap, "RatePeriod");
  }
}
