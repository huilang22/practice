/*
 * Generated code DO NOT EDIT
 * Generated file: InvsLocationDetailDeleteNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsLocationDetailDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsLocationDetailDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsLocationDetailObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsLocationDetailDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsLocationDetailDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsLocationDetailObjectData noOpInIn) {
    super(id, context, "InvsLocationDetailDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsLocationDetail", InvsLocationDetailObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetail").get("InvsLocationDetail"));
    }
  }
/**
 *
 * Sets the  InvsLocationDetail
 * @param noOpInIn InvsLocationDetailObjectData to set
 *
 */
  public void setInvsLocationDetail(InvsLocationDetailObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsLocationDetail passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailObjectData getInvsLocationDetail() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsLocationDetailObjectHelper.fromMap(inputMap, "InvsLocationDetail");
  }
}
