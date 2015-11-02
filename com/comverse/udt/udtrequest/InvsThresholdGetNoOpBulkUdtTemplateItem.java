/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsThresholdGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsThresholdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsThresholdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsThresholdObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsThresholdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsThresholdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsThresholdObjectData noOpInIn) {
    super(id, context, "InvsThresholdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsThreshold", InvsThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvsThreshold").get("InvsThreshold"));
    }
  }
/**
 *
 * Sets the  InvsThreshold
 * @param noOpInIn InvsThresholdObjectData to set
 *
 */
  public void setInvsThreshold(InvsThresholdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvsThresholdObjectData getInvsThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsThresholdObjectHelper.fromMap(inputMap, "InvsThreshold");
  }
}
