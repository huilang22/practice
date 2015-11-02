/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemFindBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemObjectFilter BalanceLineItemFindIn;
/**
 *
 * Constructor to create a  BalanceLineItemFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindInIn) {
    super(id, context, "BalanceLineItemFind");
    BalanceLineItemFindIn = BalanceLineItemFindInIn;
  }

  public void translateToMap() {
    if (BalanceLineItemFindIn != null) {
      Integer index =  BalanceLineItemFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(BalanceLineItemFindIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemFindInIn Value of the BalanceLineItemFindIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectFilter BalanceLineItemFindInIn) {
    BalanceLineItemFindIn = BalanceLineItemFindInIn;
  }

  public void translateFromMap() {
    BalanceLineItemFindIn = BalanceLineItemObjectHelper.fromMapFilter(inputMap, "BalanceLineItem");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectFilter getBalanceLineItem( ) {
    return BalanceLineItemFindIn;
  }

}
