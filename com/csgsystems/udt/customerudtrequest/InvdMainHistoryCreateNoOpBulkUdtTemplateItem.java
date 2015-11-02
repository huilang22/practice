/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainHistoryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainHistoryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainHistoryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdMainHistoryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainHistoryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectData noOpInIn) {
    super(id, context, "InvdMainHistoryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }
/**
 *
 * Sets the  InvdMainHistory
 * @param noOpInIn InvdMainHistoryObjectData to set
 *
 */
  public void setInvdMainHistory(InvdMainHistoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMainHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainHistoryObjectData getInvdMainHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainHistoryObjectHelper.fromMap(inputMap, "InvdMainHistory");
  }
}
