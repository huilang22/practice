/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectData ABIcreateIn;
/**
 *
 * Constructor to create a  AccountAbiSourceCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectData ABIcreateInIn) {
    super(id, context, "AccountAbiSourceCreate");
    ABIcreateIn = ABIcreateInIn;
  }

  public void translateToMap() {
    if (ABIcreateIn != null) {
      ABIcreateIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectHelper.toMap(ABIcreateIn, new HashMap(), "AccountAbiSource").get("AccountAbiSource"));
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABIcreateInIn Value of the ABIcreateIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectData ABIcreateInIn) {
    ABIcreateIn = ABIcreateInIn;
  }

  public void translateFromMap() {
    ABIcreateIn = AccountAbiSourceObjectHelper.fromMap(inputMap, "AccountAbiSource");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectData getAccountAbiSource( ) {
    return ABIcreateIn;
  }

}
