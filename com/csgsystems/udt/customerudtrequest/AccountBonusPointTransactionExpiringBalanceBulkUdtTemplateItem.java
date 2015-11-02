/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionExpiringBalanceBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionExpiringBalanceBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionExpiringBalanceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer AccountInternalId;
  protected Date from_date;
  protected Date to_date;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionExpiringBalanceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionExpiringBalanceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer AccountInternalIdIn, Date from_dateIn, Date to_dateIn) {
    super(id, context, "AccountBonusPointTransactionExpiringBalance");
    AccountInternalId = AccountInternalIdIn;
    from_date = from_dateIn;
    to_date = to_dateIn;
  }

  public void translateToMap() {
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (from_date != null) {
      addInput("FromDate", from_date);
    }
    if (to_date != null) {
      addInput("ToDate", to_date);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param AccountInternalIdIn Value of the AccountInternalId
 *
 */

  public void setAccountInternalId(Integer AccountInternalIdIn) {
    AccountInternalId = AccountInternalIdIn;
  }

/**
 *
 * Sets the FromDate
 * @param from_dateIn Value of the from_date
 *
 */

  public void setFromDate(Date from_dateIn) {
    from_date = from_dateIn;
  }

/**
 *
 * Sets the ToDate
 * @param to_dateIn Value of the to_date
 *
 */

  public void setToDate(Date to_dateIn) {
    to_date = to_dateIn;
  }

  public void translateFromMap() {
    AccountInternalId = (Integer)inputMap.get("AccountInternalId");
    from_date = (Date)inputMap.get("FromDate");
    to_date = (Date)inputMap.get("ToDate");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return AccountInternalId;
  }

/**
 *
 * Gets the FromDate
 * @return Value of the FromDate
 *
 */

  public Date getFromDate( ) {
    return from_date;
  }

/**
 *
 * Gets the ToDate
 * @return Value of the ToDate
 *
 */

  public Date getToDate( ) {
    return to_date;
  }

}
