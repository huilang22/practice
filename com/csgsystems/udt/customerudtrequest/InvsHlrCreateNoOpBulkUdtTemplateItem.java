/*
 * Generated code DO NOT EDIT
 * Generated file: InvsHlrCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsHlrCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsHlrCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsHlrObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsHlrCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsHlrCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsHlrObjectData noOpInIn) {
    super(id, context, "InvsHlrCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsHlr", InvsHlrObjectHelper.toMap(noOpIn, new HashMap(), "InvsHlr").get("InvsHlr"));
    }
  }
/**
 *
 * Sets the  InvsHlr
 * @param noOpInIn InvsHlrObjectData to set
 *
 */
  public void setInvsHlr(InvsHlrObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsHlr passed into the constructor
 * @return Simulated response
 *
 */
  public InvsHlrObjectData getInvsHlr() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsHlrObjectHelper.fromMap(inputMap, "InvsHlr");
  }
}
