/*
 * Generated code DO NOT EDIT
 * Generated file: CtcUrlTypeUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcUrlTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CtcUrlTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CtcUrlTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   CtcUrlTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CtcUrlTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcUrlTypeObjectData noOpInIn) {
    super(id, context, "CtcUrlTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("CtcUrlType", CtcUrlTypeObjectHelper.toMap(noOpIn, new HashMap(), "CtcUrlType").get("CtcUrlType"));
    }
  }
/**
 *
 * Sets the  CtcUrlType
 * @param noOpInIn CtcUrlTypeObjectData to set
 *
 */
  public void setCtcUrlType(CtcUrlTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CtcUrlType passed into the constructor
 * @return Simulated response
 *
 */
  public CtcUrlTypeObjectData getCtcUrlType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CtcUrlTypeObjectHelper.fromMap(inputMap, "CtcUrlType");
  }
}
