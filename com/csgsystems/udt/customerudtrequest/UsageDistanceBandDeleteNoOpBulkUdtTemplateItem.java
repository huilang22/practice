/*
 * Generated code DO NOT EDIT
 * Generated file: UsageDistanceBandDeleteNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a UsageDistanceBandDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageDistanceBandDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageDistBandObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageDistanceBandDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageDistanceBandDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageDistBandObjectData noOpInIn) {
    super(id, context, "UsageDistanceBandDelete");
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
