/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsBlacklistUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a InvsBlacklistUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsBlacklistUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsBlacklistObjectData noOpIn;

/**
 *
 * Constructor to create a   InvsBlacklistUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsBlacklistUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsBlacklistObjectData noOpInIn) {
    super(id, context, "InvsBlacklistUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("InvsBlacklist", InvsBlacklistObjectHelper.toMap(noOpIn, new HashMap(), "InvsBlacklist").get("InvsBlacklist"));
    }
  }
/**
 *
 * Sets the  InvsBlacklist
 * @param noOpInIn InvsBlacklistObjectData to set
 *
 */
  public void setInvsBlacklist(InvsBlacklistObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsBlacklist passed into the constructor
 * @return Simulated response
 *
 */
  public InvsBlacklistObjectData getInvsBlacklist() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsBlacklistObjectHelper.fromMap(inputMap, "InvsBlacklist");
  }
}
