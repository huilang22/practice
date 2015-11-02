/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectData AMcreateIn;
/**
 *
 * Constructor to create a  AccountMessageCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectData AMcreateInIn) {
    super(id, context, "AccountMessageCreate");
    AMcreateIn = AMcreateInIn;
  }

  public void translateToMap() {
    if (AMcreateIn != null) {
      AMcreateIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMcreateIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMcreateInIn Value of the AMcreateIn
 *
 */

  public void setAccountMessage(AccountMessageObjectData AMcreateInIn) {
    AMcreateIn = AMcreateInIn;
  }

  public void translateFromMap() {
    AMcreateIn = AccountMessageObjectHelper.fromMap(inputMap, "AccountMessage");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectData getAccountMessage( ) {
    return AMcreateIn;
  }

}
