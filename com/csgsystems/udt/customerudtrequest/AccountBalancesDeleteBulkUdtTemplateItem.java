/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesDeleteBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectKeyData ABDeleteIn;
  protected Date ABDCeaseDate;
/**
 *
 * Constructor to create a  AccountBalancesDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectKeyData ABDeleteInIn, Date ABDCeaseDateIn) {
    super(id, context, "AccountBalancesDelete");
    ABDeleteIn = ABDeleteInIn;
    ABDCeaseDate = ABDCeaseDateIn;
  }

  public void translateToMap() {
    if (ABDeleteIn != null) {
      ABDeleteIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(ABDeleteIn, new HashMap(), "AccountBalancesObjectKeyData").get("AccountBalancesObjectKeyData"));
    }
    if (ABDCeaseDate != null) {
      addInput("InactiveDate", ABDCeaseDate);
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABDeleteInIn Value of the ABDeleteIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectKeyData ABDeleteInIn) {
    ABDeleteIn = ABDeleteInIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param ABDCeaseDateIn Value of the ABDCeaseDate
 *
 */

  public void setInactiveDate(Date ABDCeaseDateIn) {
    ABDCeaseDate = ABDCeaseDateIn;
  }

  public void translateFromMap() {
    ABDeleteIn = AccountBalancesObjectKeyHelper.fromMap(inputMap, "AccountBalances");
    ABDCeaseDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectKeyData getAccountBalances( ) {
    return ABDeleteIn;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return ABDCeaseDate;
  }

}
