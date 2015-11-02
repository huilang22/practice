/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdThresholdCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdThresholdCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdThresholdCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdThresholdObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdThresholdCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdThresholdCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdThresholdObjectData noOpInIn) {
    super(id, context, "InvdThresholdCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdThreshold", InvdThresholdObjectHelper.toMap(noOpIn, new HashMap(), "InvdThreshold").get("InvdThreshold"));
    }
  }
/**
 *
 * Sets the  InvdThreshold
 * @param noOpInIn InvdThresholdObjectData to set
 *
 */
  public void setInvdThreshold(InvdThresholdObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdThreshold passed into the constructor
 * @return Simulated response
 *
 */
  public InvdThresholdObjectData getInvdThreshold() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdThresholdObjectHelper.fromMap(inputMap, "InvdThreshold");
  }
}
