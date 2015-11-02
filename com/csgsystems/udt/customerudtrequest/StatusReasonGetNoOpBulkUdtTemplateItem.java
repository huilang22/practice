/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a StatusReasonGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected StatusReasonObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusReasonGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, StatusReasonObjectData noOpInIn) {
    super(id, context, "StatusReasonGet");
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
