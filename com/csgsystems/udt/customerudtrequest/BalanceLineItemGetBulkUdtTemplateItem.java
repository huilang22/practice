/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemGetBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemObjectKeyData BalanceLineItemGetIn;
/**
 *
 * Constructor to create a  BalanceLineItemGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemGetInIn) {
    super(id, context, "BalanceLineItemGet");
    BalanceLineItemGetIn = BalanceLineItemGetInIn;
  }

  public void translateToMap() {
    if (BalanceLineItemGetIn != null) {
      BalanceLineItemGetIn.resetFlags(true, true);
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(BalanceLineItemGetIn, new HashMap(), "BalanceLineItemObjectKeyData").get("BalanceLineItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemGetInIn Value of the BalanceLineItemGetIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectKeyData BalanceLineItemGetInIn) {
    BalanceLineItemGetIn = BalanceLineItemGetInIn;
  }

  public void translateFromMap() {
    BalanceLineItemGetIn = BalanceLineItemObjectKeyHelper.fromMap(inputMap, "BalanceLineItem");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectKeyData getBalanceLineItem( ) {
    return BalanceLineItemGetIn;
  }

}
