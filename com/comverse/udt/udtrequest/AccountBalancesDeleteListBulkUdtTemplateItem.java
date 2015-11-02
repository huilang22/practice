/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesDeleteListBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesDeleteListBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesDeleteListBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectFilter AccountBalancesFilter;
  protected Date ABInactiveDate;
/**
 *
 * Constructor to create a  AccountBalancesDeleteListBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesDeleteListBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectFilter AccountBalancesFilterIn, Date ABInactiveDateIn) {
    super(id, context, "AccountBalancesDeleteList");
    AccountBalancesFilter = AccountBalancesFilterIn;
    ABInactiveDate = ABInactiveDateIn;
  }

  public void translateToMap() {
    if (AccountBalancesFilter != null) {
      Integer index =  AccountBalancesFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBalancesFilter", AccountBalancesObjectHelper.toMap(AccountBalancesFilter, new HashMap(), "Void").get("Void"));
    }
    if (ABInactiveDate != null) {
      addInput("InactiveDate", ABInactiveDate);
    }
  }


/**
 *
 * Sets the AccountBalancesFilter
 * @param AccountBalancesFilterIn Value of the AccountBalancesFilter
 *
 */

  public void setAccountBalancesFilter(AccountBalancesObjectFilter AccountBalancesFilterIn) {
    AccountBalancesFilter = AccountBalancesFilterIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param ABInactiveDateIn Value of the ABInactiveDate
 *
 */

  public void setInactiveDate(Date ABInactiveDateIn) {
    ABInactiveDate = ABInactiveDateIn;
  }

  public void translateFromMap() {
    AccountBalancesFilter = AccountBalancesObjectHelper.fromMapFilter(inputMap, "AccountBalancesFilter");
    ABInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountBalancesFilter
 * @return Value of the AccountBalancesFilter
 *
 */

  public AccountBalancesObjectFilter getAccountBalancesFilter( ) {
    return AccountBalancesFilter;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return ABInactiveDate;
  }

}
