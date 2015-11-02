/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrTimePeriodGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrTimePeriodGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrTimePeriodGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrTimePeriodObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrTimePeriodGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrTimePeriodGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrTimePeriodObjectData noOpInIn) {
    super(id, context, "RbrTimePeriodGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrTimePeriod", RbrTimePeriodObjectHelper.toMap(noOpIn, new HashMap(), "RbrTimePeriod").get("RbrTimePeriod"));
    }
  }
/**
 *
 * Sets the  RbrTimePeriod
 * @param noOpInIn RbrTimePeriodObjectData to set
 *
 */
  public void setRbrTimePeriod(RbrTimePeriodObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrTimePeriod passed into the constructor
 * @return Simulated response
 *
 */
  public RbrTimePeriodObjectData getRbrTimePeriod() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrTimePeriodObjectHelper.fromMap(inputMap, "RbrTimePeriod");
  }
}
