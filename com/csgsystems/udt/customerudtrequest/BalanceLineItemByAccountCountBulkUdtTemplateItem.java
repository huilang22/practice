/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemByAccountCountBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemByAccountCountBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemByAccountCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountIn;
  protected Boolean LatestInvoice1;
/**
 *
 * Constructor to create a  BalanceLineItemByAccountCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemByAccountCountBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountInIn, Boolean LatestInvoice1In) {
    super(id, context, "BalanceLineItemByAccountCount");
    BalanceLineItemAcctFindCountIn = BalanceLineItemAcctFindCountInIn;
    LatestInvoice1 = LatestInvoice1In;
  }

  public void translateToMap() {
    if (BalanceLineItemAcctFindCountIn != null) {
      Integer index =  BalanceLineItemAcctFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(BalanceLineItemAcctFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
    if (LatestInvoice1 != null) {
      addInput("LatestInvoice", LatestInvoice1);
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemAcctFindCountInIn Value of the BalanceLineItemAcctFindCountIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindCountInIn) {
    BalanceLineItemAcctFindCountIn = BalanceLineItemAcctFindCountInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoice1In Value of the LatestInvoice1
 *
 */

  public void setLatestInvoice(Boolean LatestInvoice1In) {
    LatestInvoice1 = LatestInvoice1In;
  }

  public void translateFromMap() {
    BalanceLineItemAcctFindCountIn = BalanceLineItemAccountObjectHelper.fromMapFilter(inputMap, "BalanceLineItem");
    LatestInvoice1 = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemAccountObjectFilter getBalanceLineItem( ) {
    return BalanceLineItemAcctFindCountIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice1;
  }

}
