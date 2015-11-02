/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvdMainHistoryGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvdMainHistoryGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvdMainHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvdMainHistoryGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvdMainHistoryGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvdMainHistoryObjectData noOpInIn) {
    super(id, context, "InvdMainHistoryGet");
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
