/*
 * Generated code DO NOT EDIT
 * Generated file: CtmParamCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CtmParamCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtmParamCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtmParamObjectData noOpIn;

/**
 *
 * Constructor to create a   CtmParamCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtmParamCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtmParamObjectData noOpInIn) {
    super(id, context, "CtmParamCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtmParam", CtmParamObjectHelper.toMap(noOpIn, new HashMap(), "CtmParam").get("CtmParam"));
    }
  }
/**
 *
 * Sets the  CtmParam
 * @param noOpInIn CtmParamObjectData to set
 *
 */
  public void setCtmParam(CtmParamObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtmParam passed into the constructor
 * @return Simulated response
 *
 */
  public CtmParamObjectData getCtmParam() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtmParamObjectHelper.fromMap(inputMap, "CtmParam");
  }
}
