/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectData createIn;
/**
 *
 * Constructor to create a  AccountIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectData createInIn) {
    super(id, context, "AccountIdCreate");
    createIn = createInIn;
  }

  public void translateToMap() {
    if (createIn != null) {
      createIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectHelper.toMap(createIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }


/**
 *
 * Sets the AccountId
 * @param createInIn Value of the createIn
 *
 */

  public void setAccountId(AccountIdObjectData createInIn) {
    createIn = createInIn;
  }

  public void translateFromMap() {
    createIn = AccountIdObjectHelper.fromMap(inputMap, "AccountId");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectData getAccountId( ) {
    return createIn;
  }

}
