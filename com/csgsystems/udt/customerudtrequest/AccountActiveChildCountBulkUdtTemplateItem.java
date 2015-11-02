/*
 * Generated code DO NOT EDIT
 * Generated file: AccountActiveChildCountBulkUdtTemplateItem.java
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
 * Class used to create a AccountActiveChildCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountActiveChildCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData aaccKeyIn;
  protected Date effective_date;
/**
 *
 * Constructor to create a  AccountActiveChildCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountActiveChildCountBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData aaccKeyInIn, Date effective_dateIn) {
    super(id, context, "AccountActiveChildCount");
    aaccKeyIn = aaccKeyInIn;
    effective_date = effective_dateIn;
  }

  public void translateToMap() {
    if (aaccKeyIn != null) {
      aaccKeyIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(aaccKeyIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
  }


/**
 *
 * Sets the Account
 * @param aaccKeyInIn Value of the aaccKeyIn
 *
 */

  public void setAccount(AccountObjectKeyData aaccKeyInIn) {
    aaccKeyIn = aaccKeyInIn;
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
    aaccKeyIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
    effective_date = (Date)inputMap.get("EffectiveDate");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return aaccKeyIn;
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
