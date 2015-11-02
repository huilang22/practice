/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceXferDiffGetBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a BalanceXferDiffGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceXferDiffGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BXDObjectKeyData BXDGetIn;
/**
 *
 * Constructor to create a  BalanceXferDiffGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceXferDiffGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectKeyData BXDGetInIn) {
    super(id, context, "BalanceXferDiffGet");
    BXDGetIn = BXDGetInIn;
  }

  public void translateToMap() {
    if (BXDGetIn != null) {
      BXDGetIn.resetFlags(true, true);
      addInput("BalanceXferDiff", BXDObjectKeyHelper.toMap(BXDGetIn, new HashMap(), "BXDObjectKeyData").get("BXDObjectKeyData"));
    }
  }


/**
 *
 * Sets the BalanceXferDiff
 * @param BXDGetInIn Value of the BXDGetIn
 *
 */

  public void setBalanceXferDiff(BXDObjectKeyData BXDGetInIn) {
    BXDGetIn = BXDGetInIn;
  }

  public void translateFromMap() {
    BXDGetIn = BXDObjectKeyHelper.fromMap(inputMap, "BalanceXferDiff");
  }

/**
 *
 * Gets the BalanceXferDiff
 * @return Value of the BalanceXferDiff
 *
 */

  public BXDObjectKeyData getBalanceXferDiff( ) {
    return BXDGetIn;
  }

}
