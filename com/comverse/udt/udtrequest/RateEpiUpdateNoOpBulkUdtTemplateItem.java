/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateEpiUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateEpiUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateEpiUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateEpiObjectData noOpIn;

/**
 *
 * Constructor to create a   RateEpiUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateEpiUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectData noOpInIn) {
    super(id, context, "RateEpiUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateEpi", RateEpiObjectHelper.toMap(noOpIn, new HashMap(), "RateEpi").get("RateEpi"));
    }
  }
/**
 *
 * Sets the  RateEpi
 * @param noOpInIn RateEpiObjectData to set
 *
 */
  public void setRateEpi(RateEpiObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateEpi passed into the constructor
 * @return Simulated response
 *
 */
  public RateEpiObjectData getRateEpi() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateEpiObjectHelper.fromMap(inputMap, "RateEpi");
  }
}
