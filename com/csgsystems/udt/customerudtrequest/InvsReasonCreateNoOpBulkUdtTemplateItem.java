/*
 * Generated code DO NOT EDIT
 * Generated file: InvsReasonCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsReasonCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsReasonCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsReasonCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsReasonCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsReasonObjectData noOpInIn) {
    super(id, context, "InvsReasonCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsReason", InvsReasonObjectHelper.toMap(noOpIn, new HashMap(), "InvsReason").get("InvsReason"));
    }
  }
/**
 *
 * Sets the  InvsReason
 * @param noOpInIn InvsReasonObjectData to set
 *
 */
  public void setInvsReason(InvsReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsReason passed into the constructor
 * @return Simulated response
 *
 */
  public InvsReasonObjectData getInvsReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsReasonObjectHelper.fromMap(inputMap, "InvsReason");
  }
}
