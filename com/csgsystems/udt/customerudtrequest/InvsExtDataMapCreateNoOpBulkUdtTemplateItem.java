/*
 * Generated code DO NOT EDIT
 * Generated file: InvsExtDataMapCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsExtDataMapCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsExtDataMapCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsExtDataMapObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsExtDataMapCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsExtDataMapCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsExtDataMapObjectData noOpInIn) {
    super(id, context, "InvsExtDataMapCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsExtDataMap", InvsExtDataMapObjectHelper.toMap(noOpIn, new HashMap(), "InvsExtDataMap").get("InvsExtDataMap"));
    }
  }
/**
 *
 * Sets the  InvsExtDataMap
 * @param noOpInIn InvsExtDataMapObjectData to set
 *
 */
  public void setInvsExtDataMap(InvsExtDataMapObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsExtDataMap passed into the constructor
 * @return Simulated response
 *
 */
  public InvsExtDataMapObjectData getInvsExtDataMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsExtDataMapObjectHelper.fromMap(inputMap, "InvsExtDataMap");
  }
}
