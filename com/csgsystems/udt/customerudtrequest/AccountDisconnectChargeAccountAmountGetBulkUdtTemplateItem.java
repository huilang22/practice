/*
 * Generated code DO NOT EDIT
 * Generated file: AccountDisconnectChargeAccountAmountGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountDisconnectChargeAccountAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountDisconnectChargeAccountAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer Account_internal_id;
  protected Date Effective_date;
/**
 *
 * Constructor to create a  AccountDisconnectChargeAccountAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountDisconnectChargeAccountAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer Account_internal_idIn, Date Effective_dateIn) {
    super(id, context, "AccountDisconnectChargeAccountAmountGet");
    Account_internal_id = Account_internal_idIn;
    Effective_date = Effective_dateIn;
  }

  public void translateToMap() {
    if (Account_internal_id != null) {
      addInput("AccountInternalId", Account_internal_id);
    }
    if (Effective_date != null) {
      addInput("EffectiveDate", Effective_date);
    }
  }


/**
 *
 * Sets the AccountInternalId
 * @param Account_internal_idIn Value of the Account_internal_id
 *
 */

  public void setAccountInternalId(Integer Account_internal_idIn) {
    Account_internal_id = Account_internal_idIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param Effective_dateIn Value of the Effective_date
 *
 */

  public void setEffectiveDate(Date Effective_dateIn) {
    Effective_date = Effective_dateIn;
  }

  public void translateFromMap() {
    Account_internal_id = (Integer)inputMap.get("AccountInternalId");
    Effective_date = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return Account_internal_id;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return Effective_date;
  }

}
