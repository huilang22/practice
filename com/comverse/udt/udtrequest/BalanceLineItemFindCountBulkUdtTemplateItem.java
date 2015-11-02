/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BalanceLineItemFindCountBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemObjectFilter BalanceLineItemFindCountIn;
/**
 *
 * Constructor to create a  BalanceLineItemFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemObjectFilter BalanceLineItemFindCountInIn) {
    super(id, context, "BalanceLineItemFindCount");
    BalanceLineItemFindCountIn = BalanceLineItemFindCountInIn;
  }

  public void translateToMap() {
    if (BalanceLineItemFindCountIn != null) {
      Integer index =  BalanceLineItemFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemObjectHelper.toMap(BalanceLineItemFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemFindCountInIn Value of the BalanceLineItemFindCountIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemObjectFilter BalanceLineItemFindCountInIn) {
    BalanceLineItemFindCountIn = BalanceLineItemFindCountInIn;
  }

  public void translateFromMap() {
    BalanceLineItemFindCountIn = BalanceLineItemObjectHelper.fromMapFilter(inputMap, "BalanceLineItem");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemObjectFilter getBalanceLineItem( ) {
    return BalanceLineItemFindCountIn;
  }

}
