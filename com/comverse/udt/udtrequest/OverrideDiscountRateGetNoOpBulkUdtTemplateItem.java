/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OverrideDiscountRateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OverrideDiscountRateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OverrideDiscountRateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RDOverrideObjectData noOpIn;

/**
 *
 * Constructor to create a   OverrideDiscountRateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OverrideDiscountRateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RDOverrideObjectData noOpInIn) {
    super(id, context, "OverrideDiscountRateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("OverrideDiscountRate", RDOverrideObjectHelper.toMap(noOpIn, new HashMap(), "OverrideDiscountRate").get("OverrideDiscountRate"));
    }
  }
/**
 *
 * Sets the  OverrideDiscountRate
 * @param noOpInIn RDOverrideObjectData to set
 *
 */
  public void setOverrideDiscountRate(RDOverrideObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OverrideDiscountRate passed into the constructor
 * @return Simulated response
 *
 */
  public RDOverrideObjectData getOverrideDiscountRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RDOverrideObjectHelper.fromMap(inputMap, "OverrideDiscountRate");
  }
}
