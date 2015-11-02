/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceXferDiffFindBulkUdtTemplateItem.java
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
 * Class used to create a BalanceXferDiffFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceXferDiffFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BXDObjectFilter BXDFindIn;
/**
 *
 * Constructor to create a  BalanceXferDiffFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceXferDiffFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BXDObjectFilter BXDFindInIn) {
    super(id, context, "BalanceXferDiffFind");
    BXDFindIn = BXDFindInIn;
  }

  public void translateToMap() {
    if (BXDFindIn != null) {
      Integer index =  BXDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceXferDiff", BXDObjectHelper.toMap(BXDFindIn, new HashMap(), "BalanceXferDiff").get("BalanceXferDiff"));
    }
  }


/**
 *
 * Sets the BalanceXferDiff
 * @param BXDFindInIn Value of the BXDFindIn
 *
 */

  public void setBalanceXferDiff(BXDObjectFilter BXDFindInIn) {
    BXDFindIn = BXDFindInIn;
  }

  public void translateFromMap() {
    BXDFindIn = BXDObjectHelper.fromMapFilter(inputMap, "BalanceXferDiff");
  }

/**
 *
 * Gets the BalanceXferDiff
 * @return Value of the BalanceXferDiff
 *
 */

  public BXDObjectFilter getBalanceXferDiff( ) {
    return BXDFindIn;
  }

}
