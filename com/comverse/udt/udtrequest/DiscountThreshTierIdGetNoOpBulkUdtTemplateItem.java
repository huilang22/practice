/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountThreshTierIdGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DiscountThreshTierIdGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DiscountThreshTierIdGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DTTObjectData noOpIn;

/**
 *
 * Constructor to create a   DiscountThreshTierIdGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DiscountThreshTierIdGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DTTObjectData noOpInIn) {
    super(id, context, "DiscountThreshTierIdGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("DiscountThreshTierId", DTTObjectHelper.toMap(noOpIn, new HashMap(), "DiscountThreshTierId").get("DiscountThreshTierId"));
    }
  }
/**
 *
 * Sets the  DiscountThreshTierId
 * @param noOpInIn DTTObjectData to set
 *
 */
  public void setDiscountThreshTierId(DTTObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the DiscountThreshTierId passed into the constructor
 * @return Simulated response
 *
 */
  public DTTObjectData getDiscountThreshTierId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DTTObjectHelper.fromMap(inputMap, "DiscountThreshTierId");
  }
}
