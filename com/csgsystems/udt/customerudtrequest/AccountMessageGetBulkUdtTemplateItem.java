/*
 * Generated code DO NOT EDIT
 * Generated file: AccountMessageGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountMessageGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountMessageGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountMessageObjectKeyData AMgetIn;
/**
 *
 * Constructor to create a  AccountMessageGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountMessageGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountMessageObjectKeyData AMgetInIn) {
    super(id, context, "AccountMessageGet");
    AMgetIn = AMgetInIn;
  }

  public void translateToMap() {
    if (AMgetIn != null) {
      AMgetIn.resetFlags(true, true);
      addInput("AccountMessage", AccountMessageObjectKeyHelper.toMap(AMgetIn, new HashMap(), "AccountMessageObjectKeyData").get("AccountMessageObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountMessage
 * @param AMgetInIn Value of the AMgetIn
 *
 */

  public void setAccountMessage(AccountMessageObjectKeyData AMgetInIn) {
    AMgetIn = AMgetInIn;
  }

  public void translateFromMap() {
    AMgetIn = AccountMessageObjectKeyHelper.fromMap(inputMap, "AccountMessage");
  }

/**
 *
 * Gets the AccountMessage
 * @return Value of the AccountMessage
 *
 */

  public AccountMessageObjectKeyData getAccountMessage( ) {
    return AMgetIn;
  }

}
