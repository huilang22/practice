/*
 * Generated code DO NOT EDIT
 * Generated file: InvJobHistoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvJobHistoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvJobHistoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvJobHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvJobHistoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvJobHistoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvJobHistoryObjectData noOpInIn) {
    super(id, context, "InvJobHistoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }
/**
 *
 * Sets the  InvJobHistory
 * @param noOpInIn InvJobHistoryObjectData to set
 *
 */
  public void setInvJobHistory(InvJobHistoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvJobHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobHistoryObjectData getInvJobHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvJobHistoryObjectHelper.fromMap(inputMap, "InvJobHistory");
  }
}
