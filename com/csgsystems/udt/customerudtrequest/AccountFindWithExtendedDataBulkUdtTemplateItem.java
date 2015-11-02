/*
 * Generated code DO NOT EDIT
 * Generated file: AccountFindWithExtendedDataBulkUdtTemplateItem.java
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
 * Class used to create a AccountFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountXIDObjectFilter afedIn;
/**
 *
 * Constructor to create a  AccountFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountXIDObjectFilter afedInIn) {
    super(id, context, "AccountFindWithExtendedData");
    afedIn = afedInIn;
  }

  public void translateToMap() {
    if (afedIn != null) {
      Integer index =  afedIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Account", AccountXIDObjectHelper.toMap(afedIn, new HashMap(), "Account").get("Account"));
    }
  }


/**
 *
 * Sets the Account
 * @param afedInIn Value of the afedIn
 *
 */

  public void setAccount(AccountXIDObjectFilter afedInIn) {
    afedIn = afedInIn;
  }

  public void translateFromMap() {
    afedIn = AccountXIDObjectHelper.fromMapFilter(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountXIDObjectFilter getAccount( ) {
    return afedIn;
  }

}
