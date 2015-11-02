/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceXferDiffCreateBulkUdtTemplateItem.java
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
 * Class used to create a BalanceXferDiffCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceXferDiffCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BXDObjectData BXDCreateIn;
/**
 *
 * Constructor to create a  BalanceXferDiffCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceXferDiffCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectData BXDCreateInIn) {
    super(id, context, "BalanceXferDiffCreate");
    BXDCreateIn = BXDCreateInIn;
  }

  public void translateToMap() {
    if (BXDCreateIn != null) {
      BXDCreateIn.resetFlags(true, true);
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDCreateIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }


/**
 *
 * Sets the BalanceXferDiff
 * @param BXDCreateInIn Value of the BXDCreateIn
 *
 */

  public void setBalanceXferDiff(BXDObjectData BXDCreateInIn) {
    BXDCreateIn = BXDCreateInIn;
  }

  public void translateFromMap() {
    BXDCreateIn = BXDObjectHelper.fromMap(inputMap, "BalanceXferDiff");
  }

/**
 *
 * Gets the BalanceXferDiff
 * @return Value of the BalanceXferDiff
 *
 */

  public BXDObjectData getBalanceXferDiff( ) {
    return BXDCreateIn;
  }

}
