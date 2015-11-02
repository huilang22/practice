/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationRefCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationRefCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationRefCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationRefObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationRefCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationRefCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationRefObjectData noOpInIn) {
    super(id, context, "InvsLocationRefCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }
/**
 *
 * Sets the  InvsLocationRef
 * @param noOpInIn InvsLocationRefObjectData to set
 *
 */
  public void setInvsLocationRef(InvsLocationRefObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationRef passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationRefObjectData getInvsLocationRef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationRefObjectHelper.fromMap(inputMap, "InvsLocationRef");
  }
}
