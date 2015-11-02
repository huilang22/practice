/*
 * Generated code DO NOT EDIT
 * Generated file: AccountDisconnectChargeServiceAmountGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a AccountDisconnectChargeServiceAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountDisconnectChargeServiceAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer account_internal_id;
  protected Date effective_date;
/**
 *
 * Constructor to create a  AccountDisconnectChargeServiceAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountDisconnectChargeServiceAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer account_internal_idIn, Date effective_dateIn) {
    super(id, context, "AccountDisconnectChargeServiceAmountGet");
    account_internal_id = account_internal_idIn;
    effective_date = effective_dateIn;
  }

  public void translateToMap() {
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
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
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

  public void translateFromMap() {
    account_internal_id = (Integer)inputMap.get("AccountInternalId");
    effective_date = (Date)inputMap.get("EffectiveDate");
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
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

}
