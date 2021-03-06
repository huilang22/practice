/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateDiscountCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateDiscountCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateDiscountCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateDiscountObjectData noOpIn;

/**
 *
 * Constructor to create a   RateDiscountCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateDiscountCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateDiscountObjectData noOpInIn) {
    super(id, context, "RateDiscountCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateDiscount", RateDiscountObjectHelper.toMap(noOpIn, new HashMap(), "RateDiscount").get("RateDiscount"));
    }
  }
/**
 *
 * Sets the  RateDiscount
 * @param noOpInIn RateDiscountObjectData to set
 *
 */
  public void setRateDiscount(RateDiscountObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateDiscount passed into the constructor
 * @return Simulated response
 *
 */
  public RateDiscountObjectData getRateDiscount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateDiscountObjectHelper.fromMap(inputMap, "RateDiscount");
  }
}
