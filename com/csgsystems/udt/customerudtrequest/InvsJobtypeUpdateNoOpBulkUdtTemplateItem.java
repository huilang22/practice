/*
 * Generated code DO NOT EDIT
 * Generated file: InvsJobtypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsJobtypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsJobtypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsJobtypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsJobtypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsJobtypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsJobtypeObjectData noOpInIn) {
    super(id, context, "InvsJobtypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsJobtype", InvsJobtypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsJobtype").get("InvsJobtype"));
    }
  }
/**
 *
 * Sets the  InvsJobtype
 * @param noOpInIn InvsJobtypeObjectData to set
 *
 */
  public void setInvsJobtype(InvsJobtypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsJobtype passed into the constructor
 * @return Simulated response
 *
 */
  public InvsJobtypeObjectData getInvsJobtype() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsJobtypeObjectHelper.fromMap(inputMap, "InvsJobtype");
  }
}
