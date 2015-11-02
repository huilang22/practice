/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryCreateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvHistoryCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvHistoryCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvHistoryObjectData noOpIn;

/**
 *
 * Constructor to create a   InvHistoryCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvHistoryCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvHistoryObjectData noOpInIn) {
    super(id, context, "InvHistoryCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvHistory", InvHistoryObjectHelper.toMap(noOpIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }
/**
 *
 * Sets the  InvHistory
 * @param noOpInIn InvHistoryObjectData to set
 *
 */
  public void setInvHistory(InvHistoryObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvHistory passed into the constructor
 * @return Simulated response
 *
 */
  public InvHistoryObjectData getInvHistory() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvHistoryObjectHelper.fromMap(inputMap, "InvHistory");
  }
}
