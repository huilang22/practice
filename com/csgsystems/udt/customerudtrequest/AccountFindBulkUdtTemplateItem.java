/*
 * Generated code DO NOT EDIT
 * Generated file: AccountFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDObjectFilter afIn;
/**
 *
 * Constructor to create a  AccountFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectFilter afInIn) {
    super(id, context, "AccountFind");
    afIn = afInIn;
  }

  public void translateToMap() {
    if (afIn != null) {
      Integer index =  afIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afIn, new HashMap(), "Account").get("Account"));
    }
  }


/**
 *
 * Sets the Account
 * @param afInIn Value of the afIn
 *
 */

  public void setAccount(AccountXIDObjectFilter afInIn) {
    afIn = afInIn;
  }

  public void translateFromMap() {
    afIn = AccountXIDObjectHelper.fromMapFilter(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDObjectFilter getAccount( ) {
    return afIn;
  }

}
