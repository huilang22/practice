/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemObjectKeyData BalanceLineItemAmountGetIn;
/**
 *
 * Constructor to create a  BalanceLineItemAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectKeyData BalanceLineItemAmountGetInIn) {
    super(id, context, "BalanceLineItemAmountGet");
    BalanceLineItemAmountGetIn = BalanceLineItemAmountGetInIn;
  }

  public void translateToMap() {
    if (BalanceLineItemAmountGetIn != null) {
      BalanceLineItemAmountGetIn.resetFlags(true, true);
      addInput("BalanceLineItem", BalanceLineItemObjectKeyHelper.toMap(BalanceLineItemAmountGetIn, new HashMap(), "BalanceLineItemObjectKeyData").get("BalanceLineItemObjectKeyData"));
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemAmountGetInIn Value of the BalanceLineItemAmountGetIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectKeyData BalanceLineItemAmountGetInIn) {
    BalanceLineItemAmountGetIn = BalanceLineItemAmountGetInIn;
  }

  public void translateFromMap() {
    BalanceLineItemAmountGetIn = BalanceLineItemObjectKeyHelper.fromMap(inputMap, "BalanceLineItem");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectKeyData getBalanceLineItem( ) {
    return BalanceLineItemAmountGetIn;
  }

}
