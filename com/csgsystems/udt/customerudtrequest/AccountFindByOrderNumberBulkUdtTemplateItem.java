/*
 * Generated code DO NOT EDIT
 * Generated file: AccountFindByOrderNumberBulkUdtTemplateItem.java
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
 * Class used to create a AccountFindByOrderNumberBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountFindByOrderNumberBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDOrderObjectFilter aofIn;
/**
 *
 * Constructor to create a  AccountFindByOrderNumberBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountFindByOrderNumberBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDOrderObjectFilter aofInIn) {
    super(id, context, "AccountFindByOrderNumber");
    aofIn = aofInIn;
  }

  public void translateToMap() {
    if (aofIn != null) {
      Integer index =  aofIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDOrderObjectHelper.toMap(aofIn, new HashMap(), "Account").get("Account"));
    }
  }


/**
 *
 * Sets the Account
 * @param aofInIn Value of the aofIn
 *
 */

  public void setAccount(AccountXIDOrderObjectFilter aofInIn) {
    aofIn = aofInIn;
  }

  public void translateFromMap() {
    aofIn = AccountXIDOrderObjectHelper.fromMapFilter(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDOrderObjectFilter getAccount( ) {
    return aofIn;
  }

}
