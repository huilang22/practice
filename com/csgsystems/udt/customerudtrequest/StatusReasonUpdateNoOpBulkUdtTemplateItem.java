/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusReasonUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusReasonUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectData noOpInIn) {
    super(id, context, "StatusReasonUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatusReason", StatusReasonObjectHelper.toMap(noOpIn, new HashMap(), "StatusReason").get("StatusReason"));
    }
  }
/**
 *
 * Sets the  StatusReason
 * @param noOpInIn StatusReasonObjectData to set
 *
 */
  public void setStatusReason(StatusReasonObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusReason passed into the constructor
 * @return Simulated response
 *
 */
  public StatusReasonObjectData getStatusReason() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = StatusReasonObjectHelper.fromMap(inputMap, "StatusReason");
  }
}
