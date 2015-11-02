/*
 * Generated code DO NOT EDIT
 * Generated file: UsageCreditRateGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a UsageCreditRateGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageCreditRateGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RUCreditObjectData noOpIn;

/**
 *
 * Constructor to create a   UsageCreditRateGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageCreditRateGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RUCreditObjectData noOpInIn) {
    super(id, context, "UsageCreditRateGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("UsageCreditRate", RUCreditObjectHelper.toMap(noOpIn, new HashMap(), "UsageCreditRate").get("UsageCreditRate"));
    }
  }
/**
 *
 * Sets the  UsageCreditRate
 * @param noOpInIn RUCreditObjectData to set
 *
 */
  public void setUsageCreditRate(RUCreditObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageCreditRate passed into the constructor
 * @return Simulated response
 *
 */
  public RUCreditObjectData getUsageCreditRate() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RUCreditObjectHelper.fromMap(inputMap, "UsageCreditRate");
  }
}
