/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationValuesGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsLocationValuesGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationValuesGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationValuesObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationValuesGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationValuesGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationValuesObjectData noOpInIn) {
    super(id, context, "InvsLocationValuesGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationValues", InvsLocationValuesObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationValues").get("InvsLocationValues"));
    }
  }
/**
 *
 * Sets the  InvsLocationValues
 * @param noOpInIn InvsLocationValuesObjectData to set
 *
 */
  public void setInvsLocationValues(InvsLocationValuesObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationValues passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationValuesObjectData getInvsLocationValues() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationValuesObjectHelper.fromMap(inputMap, "InvsLocationValues");
  }
}
