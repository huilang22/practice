/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageDistanceBandUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageDistanceBandUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageDistanceBandUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageDistBandObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageDistanceBandUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageDistanceBandUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectData noOpInIn) {
    super(id, context, "UsageDistanceBandUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageDistanceBand", UsageDistBandObjectHelper.toMap(noOpIn, new HashMap(), "UsageDistanceBand").get("UsageDistanceBand"));
    }
  }
/**
 *
 * Sets the  UsageDistanceBand
 * @param noOpInIn UsageDistBandObjectData to set
 *
 */
  public void setUsageDistanceBand(UsageDistBandObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageDistanceBand passed into the constructor
 * @return Simulated response
 *
 */
  public UsageDistBandObjectData getUsageDistanceBand() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageDistBandObjectHelper.fromMap(inputMap, "UsageDistanceBand");
  }
}
