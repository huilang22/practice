/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffUpdateBulkUdtTemplateItem.java
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
 * Class used to create a BalanceXferDiffUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceXferDiffUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BXDObjectData BXDUpdateIn;
/**
 *
 * Constructor to create a  BalanceXferDiffUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceXferDiffUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectData BXDUpdateInIn) {
    super(id, context, "BalanceXferDiffUpdate");
    BXDUpdateIn = BXDUpdateInIn;
  }

  public void translateToMap() {
    if (BXDUpdateIn != null) {
      BXDUpdateIn.resetFlags(true, true);
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDUpdateIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }


/**
 *
 * Sets the BalanceXferDiff
 * @param BXDUpdateInIn Value of the BXDUpdateIn
 *
 */

  public void setBalanceXferDiff(BXDObjectData BXDUpdateInIn) {
    BXDUpdateIn = BXDUpdateInIn;
  }

  public void translateFromMap() {
    BXDUpdateIn = BXDObjectHelper.fromMap(inputMap, "BalanceXferDiff");
  }

/**
 *
 * Gets the BalanceXferDiff
 * @return Value of the BalanceXferDiff
 *
 */

  public BXDObjectData getBalanceXferDiff( ) {
    return BXDUpdateIn;
  }

}
