/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionBalanceBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionBalanceBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionBalanceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
  protected Date current_date;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionBalanceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionBalanceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn, Date current_dateIn) {
    super(id, context, "AccountBonusPointTransactionBalance");
    account_internal_id = account_internal_idIn;
    current_date = current_dateIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (current_date != null) {
      addInput("CurrentDate", current_date);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param account_internal_idIn Value of the account_internal_id
 *
 */

  public void setAccountInternalId(Integer account_internal_idIn) {
    account_internal_id = account_internal_idIn;
  }

/**
 *
 * Sets the CurrentDate
 * @param current_dateIn Value of the current_date
 *
 */

  public void setCurrentDate(Date current_dateIn) {
    current_date = current_dateIn;
  }

  public void translateFromMap() {
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    current_date = (Date)inputMap.get("CurrentDate");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return account_internal_id;
  }

/**
 *
 * Gets the CurrentDate
 * @return Value of the CurrentDate
 *
 */

  public Date getCurrentDate( ) {
    return current_date;
  }

}
