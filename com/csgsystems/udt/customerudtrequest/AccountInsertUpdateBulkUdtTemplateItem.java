/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountInsertUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountInsertUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountInsertObjectData AIupdateIn;
/**
 *
 * Constructor to create a  AccountInsertUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountInsertUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectData AIupdateInIn) {
    super(id, context, "AccountInsertUpdate");
    AIupdateIn = AIupdateInIn;
  }

  public void translateToMap() {
    if (AIupdateIn != null) {
      AIupdateIn.resetFlags(true, true);
      addInput("AccountInsert", AccountInsertObjectHelper.toMap(AIupdateIn, new HashMap(), "AccountInsert").get("AccountInsert"));
    }
  }


/**
 *
 * Sets the AccountInsert
 * @param AIupdateInIn Value of the AIupdateIn
 *
 */

  public void setAccountInsert(AccountInsertObjectData AIupdateInIn) {
    AIupdateIn = AIupdateInIn;
  }

  public void translateFromMap() {
    AIupdateIn = AccountInsertObjectHelper.fromMap(inputMap, "AccountInsert");
  }

/**
 *
 * Gets the AccountInsert
 * @return Value of the AccountInsert
 *
 */

  public AccountInsertObjectData getAccountInsert( ) {
    return AIupdateIn;
  }

}
