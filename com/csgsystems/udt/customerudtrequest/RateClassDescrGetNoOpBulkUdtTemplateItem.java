/*
 * Generated code DO NOT EDIT
 * Generated file: RateClassDescrGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a RateClassDescrGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class RateClassDescrGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected RateClassDescrObjectData noOpIn;

/**
 *
 * Constructor to create a   RateClassDescrGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public RateClassDescrGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, RateClassDescrObjectData noOpInIn) {
    super(id, context, "RateClassDescrGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("RateClassDescr", RateClassDescrObjectHelper.toMap(noOpIn, new HashMap(), "RateClassDescr").get("RateClassDescr"));
    }
  }
/**
 *
 * Sets the  RateClassDescr
 * @param noOpInIn RateClassDescrObjectData to set
 *
 */
  public void setRateClassDescr(RateClassDescrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the RateClassDescr passed into the constructor
 * @return Simulated response
 *
 */
  public RateClassDescrObjectData getRateClassDescr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = RateClassDescrObjectHelper.fromMap(inputMap, "RateClassDescr");
  }
}
