/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsRateCenterGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsRateCenterGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsRateCenterGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsRateCenterObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsRateCenterGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsRateCenterGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsRateCenterObjectData noOpInIn) {
    super(id, context, "InvsRateCenterGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsRateCenter", InvsRateCenterObjectHelper.toMap(noOpIn, new HashMap(), "InvsRateCenter").get("InvsRateCenter"));
    }
  }
/**
 *
 * Sets the  InvsRateCenter
 * @param noOpInIn InvsRateCenterObjectData to set
 *
 */
  public void setInvsRateCenter(InvsRateCenterObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsRateCenter passed into the constructor
 * @return Simulated response
 *
 */
  public InvsRateCenterObjectData getInvsRateCenter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsRateCenterObjectHelper.fromMap(inputMap, "InvsRateCenter");
  }
}
