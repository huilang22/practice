/*
 * Generated code DO NOT EDIT
 * Generated file: BalanceLineItemByAccountFindBulkUdtTemplateItem.java
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
 * Class used to create a BalanceLineItemByAccountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BalanceLineItemByAccountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindIn;
  protected Boolean LatestInvoice;
/**
 *
 * Constructor to create a  BalanceLineItemByAccountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BalanceLineItemByAccountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindInIn, Boolean LatestInvoiceIn) {
    super(id, context, "BalanceLineItemByAccountFind");
    BalanceLineItemAcctFindIn = BalanceLineItemAcctFindInIn;
    LatestInvoice = LatestInvoiceIn;
  }

  public void translateToMap() {
    if (BalanceLineItemAcctFindIn != null) {
      Integer index =  BalanceLineItemAcctFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BalanceLineItem", BalanceLineItemAccountObjectHelper.toMap(BalanceLineItemAcctFindIn, new HashMap(), "BalanceLineItem").get("BalanceLineItem"));
    }
    if (LatestInvoice != null) {
      addInput("LatestInvoice", LatestInvoice);
    }
  }


/**
 *
 * Sets the BalanceLineItem
 * @param BalanceLineItemAcctFindInIn Value of the BalanceLineItemAcctFindIn
 *
 */

  public void setBalanceLineItem(BalanceLineItemAccountObjectFilter BalanceLineItemAcctFindInIn) {
    BalanceLineItemAcctFindIn = BalanceLineItemAcctFindInIn;
  }

/**
 *
 * Sets the LatestInvoice
 * @param LatestInvoiceIn Value of the LatestInvoice
 *
 */

  public void setLatestInvoice(Boolean LatestInvoiceIn) {
    LatestInvoice = LatestInvoiceIn;
  }

  public void translateFromMap() {
    BalanceLineItemAcctFindIn = BalanceLineItemAccountObjectHelper.fromMapFilter(inputMap, "BalanceLineItem");
    LatestInvoice = (Boolean)inputMap.get("LatestInvoice");
  }

/**
 *
 * Gets the BalanceLineItem
 * @return Value of the BalanceLineItem
 *
 */

  public BalanceLineItemAccountObjectFilter getBalanceLineItem( ) {
    return BalanceLineItemAcctFindIn;
  }

/**
 *
 * Gets the LatestInvoice
 * @return Value of the LatestInvoice
 *
 */

  public Boolean getLatestInvoice( ) {
    return LatestInvoice;
  }

}
