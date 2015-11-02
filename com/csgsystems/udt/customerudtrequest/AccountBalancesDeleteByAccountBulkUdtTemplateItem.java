/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesDeleteByAccountBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesDeleteByAccountBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesDeleteByAccountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectData ABInObject;
  protected Date ABAInactiveDate;
/**
 *
 * Constructor to create a  AccountBalancesDeleteByAccountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesDeleteByAccountBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData ABInObjectIn, Date ABAInactiveDateIn) {
    super(id, context, "AccountBalancesDeleteByAccount");
    ABInObject = ABInObjectIn;
    ABAInactiveDate = ABAInactiveDateIn;
  }

  public void translateToMap() {
    if (ABInObject != null) {
      ABInObject.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABInObject, new HashMap(), "Void").get("Void"));
    }
    if (ABAInactiveDate != null) {
      addInput("InactiveDate", ABAInactiveDate);
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABInObjectIn Value of the ABInObject
 *
 */

  public void setAccountBalances(AccountBalancesObjectData ABInObjectIn) {
    ABInObject = ABInObjectIn;
  }

/**
 *
 * Sets the InactiveDate
 * @param ABAInactiveDateIn Value of the ABAInactiveDate
 *
 */

  public void setInactiveDate(Date ABAInactiveDateIn) {
    ABAInactiveDate = ABAInactiveDateIn;
  }

  public void translateFromMap() {
    ABInObject = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
    ABAInactiveDate = (Date)inputMap.get("InactiveDate");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectData getAccountBalances( ) {
    return ABInObject;
  }

/**
 *
 * Gets the InactiveDate
 * @return Value of the InactiveDate
 *
 */

  public Date getInactiveDate( ) {
    return ABAInactiveDate;
  }

}
