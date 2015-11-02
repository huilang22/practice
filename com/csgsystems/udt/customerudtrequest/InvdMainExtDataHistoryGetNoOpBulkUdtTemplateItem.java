/*
 * Generated code DO NOT EDIT
 * Generated file: InvdMainExtDataHistoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainExtDataHistoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainExtDataHistoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainExtDataHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdMainExtDataHistoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainExtDataHistoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectData noOpInIn) {
    super(id, context, "InvdMainExtDataHistoryGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }
/**
 *
 * Sets the  InvdMainExtDataHistory
 * @param noOpInIn InvdMainExtDataHistoryObjectData to set
 *
 */
  public void setInvdMainExtDataHistory(InvdMainExtDataHistoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvdMainExtDataHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvdMainExtDataHistoryObjectData getInvdMainExtDataHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvdMainExtDataHistoryObjectHelper.fromMap(inputMap, "InvdMainExtDataHistory");
  }
}
