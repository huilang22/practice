/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateUnitCrCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateUnitCrCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateUnitCrCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateUnitCrObjectData noOpIn;

/**
 *
 * Constructor to create a   RateUnitCrCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateUnitCrCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateUnitCrObjectData noOpInIn) {
    super(id, context, "RateUnitCrCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateUnitCr", RateUnitCrObjectHelper.toMap(noOpIn, new HashMap(), "RateUnitCr").get("RateUnitCr"));
    }
  }
/**
 *
 * Sets the  RateUnitCr
 * @param noOpInIn RateUnitCrObjectData to set
 *
 */
  public void setRateUnitCr(RateUnitCrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateUnitCr passed into the constructor
 * @return Simulated response
 *
 */
  public RateUnitCrObjectData getRateUnitCr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateUnitCrObjectHelper.fromMap(inputMap, "RateUnitCr");
  }
}
