/*
 * Generated code DO NOT EDIT
 * Generated file: AccountFindCountBulkUdtTemplateItem.java
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
 * Class used to create a AccountFindCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountFindCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDObjectFilter afcIn;
/**
 *
 * Constructor to create a  AccountFindCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountFindCountBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectFilter afcInIn) {
    super(id, context, "AccountFindCount");
    afcIn = afcInIn;
  }

  public void translateToMap() {
    if (afcIn != null) {
      Integer index =  afcIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afcIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }


/**
 *
 * Sets the Account
 * @param afcInIn Value of the afcIn
 *
 */

  public void setAccount(AccountXIDObjectFilter afcInIn) {
    afcIn = afcInIn;
  }

  public void translateFromMap() {
    afcIn = AccountXIDObjectHelper.fromMapFilter(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDObjectFilter getAccount( ) {
    return afcIn;
  }

}
