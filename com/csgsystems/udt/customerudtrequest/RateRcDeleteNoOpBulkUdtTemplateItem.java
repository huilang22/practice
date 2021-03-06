/*
 * Generated code DO NOT EDIT
 * Generated file: RateRcDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateRcDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateRcDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RACObjectData noOpIn;

/**
 *
 * Constructor to create a   RateRcDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateRcDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RACObjectData noOpInIn) {
    super(id, context, "RateRcDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateRc", RACObjectHelper.toMap(noOpIn, new HashMap(), "RateRc").get("RateRc"));
    }
  }
/**
 *
 * Sets the  RateRc
 * @param noOpInIn RACObjectData to set
 *
 */
  public void setRateRc(RACObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateRc passed into the constructor
 * @return Simulated response
 *
 */
  public RACObjectData getRateRc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RACObjectHelper.fromMap(inputMap, "RateRc");
  }
}
