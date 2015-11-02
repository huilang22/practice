/*
 * Generated code DO NOT EDIT
 * Generated file: RateEpiDeleteNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a RateEpiDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateEpiDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateEpiObjectData noOpIn;

/**
 *
 * Constructor to create a   RateEpiDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateEpiDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateEpiObjectData noOpInIn) {
    super(id, context, "RateEpiDelete");
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
