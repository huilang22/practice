/*
 * Generated code DO NOT EDIT
 * Generated file: RbrRateUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RbrRateUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RbrRateUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RbrRatesObjectData noOpIn;

/**
 *
 * Constructor to create a   RbrRateUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RbrRateUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RbrRatesObjectData noOpInIn) {
    super(id, context, "RbrRateUpdate");
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
