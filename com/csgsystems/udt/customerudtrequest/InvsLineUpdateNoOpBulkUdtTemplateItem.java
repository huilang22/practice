/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLineUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLineUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLineObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLineUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLineUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineObjectData noOpInIn) {
    super(id, context, "InvsLineUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLine", InvsLineObjectHelper.toMap(noOpIn, new HashMap(), "InvsLine").get("InvsLine"));
    }
  }
/**
 *
 * Sets the  InvsLine
 * @param noOpInIn InvsLineObjectData to set
 *
 */
  public void setInvsLine(InvsLineObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLine passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineObjectData getInvsLine() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLineObjectHelper.fromMap(inputMap, "InvsLine");
  }
}
