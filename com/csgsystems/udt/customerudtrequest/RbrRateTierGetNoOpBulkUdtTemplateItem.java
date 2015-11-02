/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateTierGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateTierGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateTierGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRteTierObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrRateTierGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateTierGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRteTierObjectData noOpInIn) {
    super(id, context, "RbrRateTierGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrRateTier", RbrRteTierObjectHelper.toMap(noOpIn, new HashMap(), "RbrRateTier").get("RbrRateTier"));
    }
  }
/**
 *
 * Sets the  RbrRateTier
 * @param noOpInIn RbrRteTierObjectData to set
 *
 */
  public void setRbrRateTier(RbrRteTierObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRateTier passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRteTierObjectData getRbrRateTier() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRteTierObjectHelper.fromMap(inputMap, "RbrRateTier");
  }
}
