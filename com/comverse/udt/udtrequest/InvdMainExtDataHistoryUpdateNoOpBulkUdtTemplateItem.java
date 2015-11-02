/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryUpdateNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a InvdMainExtDataHistoryUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainExtDataHistoryUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainExtDataHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdMainExtDataHistoryUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainExtDataHistoryUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainExtDataHistoryObjectData noOpInIn) {
    super(id, context, "InvdMainExtDataHistoryUpdate");
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
