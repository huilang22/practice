/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideUsageCreditRateUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a OverrideUsageCreditRateUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideUsageCreditRateUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   OverrideUsageCreditRateUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideUsageCreditRateUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCOverrideObjectData noOpInIn) {
    super(id, context, "OverrideUsageCreditRateUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OverrideUsageCreditRate", RUCOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideUsageCreditRate").get("OverrideUsageCreditRate"));
    }
  }
/**
 *
 * Sets the  OverrideUsageCreditRate
 * @param noOpInIn RUCOverrideObjectData to set
 *
 */
  public void setOverrideUsageCreditRate(RUCOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideUsageCreditRate passed into the constructor
 * @return Simulated response
 *
 */
  public RUCOverrideObjectData getOverrideUsageCreditRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCOverrideObjectHelper.fromMap(inputMap, "OverrideUsageCreditRate");
  }
}
