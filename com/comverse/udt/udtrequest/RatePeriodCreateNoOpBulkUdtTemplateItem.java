/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RatePeriodCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RatePeriodCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RatePeriodCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RPObjectData noOpIn;

/**
 *
 * Constructor to create a   RatePeriodCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RatePeriodCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RPObjectData noOpInIn) {
    super(id, context, "RatePeriodCreate");
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
