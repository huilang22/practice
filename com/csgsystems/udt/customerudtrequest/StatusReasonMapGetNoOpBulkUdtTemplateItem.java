/*
 * Generated code DO NOT EDIT
 * Generated file: StatusReasonMapGetNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a StatusReasonMapGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class StatusReasonMapGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SRMObjectData noOpIn;

/**
 *
 * Constructor to create a   StatusReasonMapGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public StatusReasonMapGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SRMObjectData noOpInIn) {
    super(id, context, "StatusReasonMapGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("StatusReasonMap", SRMObjectHelper.toMap(noOpIn, new HashMap(), "StatusReasonMap").get("StatusReasonMap"));
    }
  }
/**
 *
 * Sets the  StatusReasonMap
 * @param noOpInIn SRMObjectData to set
 *
 */
  public void setStatusReasonMap(SRMObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the StatusReasonMap passed into the constructor
 * @return Simulated response
 *
 */
  public SRMObjectData getStatusReasonMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SRMObjectHelper.fromMap(inputMap, "StatusReasonMap");
  }
}
