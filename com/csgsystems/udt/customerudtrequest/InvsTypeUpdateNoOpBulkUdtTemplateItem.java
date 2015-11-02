/*
 * Generated code DO NOT EDIT
 * Generated file: InvsTypeUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsTypeUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsTypeUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectData noOpInIn) {
    super(id, context, "InvsTypeUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsType", InvsTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }
/**
 *
 * Sets the  InvsType
 * @param noOpInIn InvsTypeObjectData to set
 *
 */
  public void setInvsType(InvsTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectData getInvsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeObjectHelper.fromMap(inputMap, "InvsType");
  }
}
