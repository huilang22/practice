/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectKeyData AIgetIn;
/**
 *
 * Constructor to create a  AccountInsertGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectKeyData AIgetInIn) {
    super(id, context, "AccountInsertGet");
    AIgetIn = AIgetInIn;
  }

  public void translateToMap() {
    if (AIgetIn != null) {
      AIgetIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectKeyHelper.toMap(AIgetIn, new HashMap(), "AccountInsertObjectKeyData").get("AccountInsertObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AIgetInIn Value of the AIgetIn
 *
 */

  public void setAccountInsert(AccountInsertObjectKeyData AIgetInIn) {
    AIgetIn = AIgetInIn;
  }

  public void translateFromMap() {
    AIgetIn = AccountInsertObjectKeyHelper.fromMap(inputMap, "AccountInsert");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectKeyData getAccountInsert( ) {
    return AIgetIn;
  }

}
