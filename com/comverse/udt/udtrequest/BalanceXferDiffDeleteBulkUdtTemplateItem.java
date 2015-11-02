/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceXferDiffDeleteBulkUdtTemplateItem.java
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
 * Class used to create a BalanceXferDiffDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceXferDiffDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BXDObjectKeyData BXDDeleteIn;
/**
 *
 * Constructor to create a  BalanceXferDiffDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceXferDiffDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectKeyData BXDDeleteInIn) {
    super(id, context, "BalanceXferDiffDelete");
    BXDDeleteIn = BXDDeleteInIn;
  }

  public void translateToMap() {
    if (BXDDeleteIn != null) {
      BXDDeleteIn.resetFlags(true, true);
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(BXDDeleteIn, new HashMap(), "BXDObjectKeyData").get("BXDObjectKeyData"));
    }
  }


/**
 *
 * Sets the BalanceXferDiff
 * @param BXDDeleteInIn Value of the BXDDeleteIn
 *
 */

  public void setBalanceXferDiff(BXDObjectKeyData BXDDeleteInIn) {
    BXDDeleteIn = BXDDeleteInIn;
  }

  public void translateFromMap() {
    BXDDeleteIn = BXDObjectKeyHelper.fromMap(inputMap, "BalanceXferDiff");
  }

/**
 *
 * Gets the BalanceXferDiff
 * @return Value of the BalanceXferDiff
 *
 */

  public BXDObjectKeyData getBalanceXferDiff( ) {
    return BXDDeleteIn;
  }

}
