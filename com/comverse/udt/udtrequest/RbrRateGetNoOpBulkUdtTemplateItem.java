/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrRateGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRatesObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrRateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectData noOpInIn) {
    super(id, context, "RbrRateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RbrRate", RbrRatesObjectHelper.toMap(noOpIn, new HashMap(), "RbrRate").get("RbrRate"));
    }
  }
/**
 *
 * Sets the  RbrRate
 * @param noOpInIn RbrRatesObjectData to set
 *
 */
  public void setRbrRate(RbrRatesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RbrRate passed into the constructor
 * @return Simulated response
 *
 */
  public RbrRatesObjectData getRbrRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RbrRatesObjectHelper.fromMap(inputMap, "RbrRate");
  }
}
