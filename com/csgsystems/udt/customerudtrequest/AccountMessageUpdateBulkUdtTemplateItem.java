/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectData AMupdateIn;
/**
 *
 * Constructor to create a  AccountMessageUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectData AMupdateInIn) {
    super(id, context, "AccountMessageUpdate");
    AMupdateIn = AMupdateInIn;
  }

  public void translateToMap() {
    if (AMupdateIn != null) {
      AMupdateIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectHelper.toMap(AMupdateIn, new HashMap(), "AccountMessage").get("AccountMessage"));
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMupdateInIn Value of the AMupdateIn
 *
 */

  public void setAccountMessage(AccountMessageObjectData AMupdateInIn) {
    AMupdateIn = AMupdateInIn;
  }

  public void translateFromMap() {
    AMupdateIn = AccountMessageObjectHelper.fromMap(inputMap, "AccountMessage");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectData getAccountMessage( ) {
    return AMupdateIn;
  }

}
