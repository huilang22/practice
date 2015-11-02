/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountTargetDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountTargetDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountTargetDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountTargetDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountTargetDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTObjectData noOpInIn) {
    super(id, context, "DiscountTargetDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountTarget", DTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountTarget").get("DiscountTarget"));
    }
  }
/**
 *
 * Sets the  DiscountTarget
 * @param noOpInIn DTObjectData to set
 *
 */
  public void setDiscountTarget(DTObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountTarget passed into the constructor
 * @return Simulated response
 *
 */
  public DTObjectData getDiscountTarget() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTObjectHelper.fromMap(inputMap, "DiscountTarget");
  }
}
