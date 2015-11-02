/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffUpdateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a BalanceXferDiffUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BalanceXferDiffUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BXDObjectData noOpIn;

/**
 *
 * Constructor to create a   BalanceXferDiffUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BalanceXferDiffUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectData noOpInIn) {
    super(id, context, "BalanceXferDiffUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(noOpIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }
/**
 *
 * Sets the  BalanceXferDiff
 * @param noOpInIn BXDObjectData to set
 *
 */
  public void setBalanceXferDiff(BXDObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BalanceXferDiff passed into the constructor
 * @return Simulated response
 *
 */
  public BXDObjectData getBalanceXferDiff() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BXDObjectHelper.fromMap(inputMap, "BalanceXferDiff");
  }
}
