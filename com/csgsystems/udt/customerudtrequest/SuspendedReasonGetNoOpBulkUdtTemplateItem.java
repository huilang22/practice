/*
 * Generated code DO NOT EDIT
 * Generated file: SuspendedReasonGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.ar.data.*;

/**
 *
 * NoOp class used to simulate a SuspendedReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SuspendedReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SuspendedReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   SuspendedReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SuspendedReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SuspendedReasonObjectData noOpInIn) {
    super(id, context, "SuspendedReasonGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("SuspendedReason", SuspendedReasonObjectHelper.toMap(noOpIn, new HashMap(), "SuspendedReason").get("SuspendedReason"));
    }
  }
/**
 *
 * Sets the  SuspendedReason
 * @param noOpInIn SuspendedReasonObjectData to set
 *
 */
  public void setSuspendedReason(SuspendedReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SuspendedReason passed into the constructor
 * @return Simulated response
 *
 */
  public SuspendedReasonObjectData getSuspendedReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SuspendedReasonObjectHelper.fromMap(inputMap, "SuspendedReason");
  }
}
