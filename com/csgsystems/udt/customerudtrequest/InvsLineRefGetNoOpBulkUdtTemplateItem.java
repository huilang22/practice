/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLineRefGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLineRefGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLineRefGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLineRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLineRefGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLineRefGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLineRefObjectData noOpInIn) {
    super(id, context, "InvsLineRefGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLineRef", InvsLineRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsLineRef").get("InvsLineRef"));
    }
  }
/**
 *
 * Sets the  InvsLineRef
 * @param noOpInIn InvsLineRefObjectData to set
 *
 */
  public void setInvsLineRef(InvsLineRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLineRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLineRefObjectData getInvsLineRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLineRefObjectHelper.fromMap(inputMap, "InvsLineRef");
  }
}
