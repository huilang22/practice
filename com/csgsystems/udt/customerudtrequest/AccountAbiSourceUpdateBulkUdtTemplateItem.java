/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectData ABIupdateIn;
/**
 *
 * Constructor to create a  AccountAbiSourceUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectData ABIupdateInIn) {
    super(id, context, "AccountAbiSourceUpdate");
    ABIupdateIn = ABIupdateInIn;
  }

  public void translateToMap() {
    if (ABIupdateIn != null) {
      ABIupdateIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIupdateIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABIupdateInIn Value of the ABIupdateIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectData ABIupdateInIn) {
    ABIupdateIn = ABIupdateInIn;
  }

  public void translateFromMap() {
    ABIupdateIn = AccountAbiSourceObjectHelper.fromMap(inputMap, "AccountAbiSource");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectData getAccountAbiSource( ) {
    return ABIupdateIn;
  }

}
