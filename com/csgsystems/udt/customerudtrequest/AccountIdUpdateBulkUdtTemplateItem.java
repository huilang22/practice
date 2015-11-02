/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountIdObjectData updateIn;
/**
 *
 * Constructor to create a  AccountIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectData updateInIn) {
    super(id, context, "AccountIdUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("AccountId", AccountIdObjectHelper.toMap(updateIn, new HashMap(), "AccountId").get("AccountId"));
    }
  }


/**
 *
 * Sets the AccountId
 * @param updateInIn Value of the updateIn
 *
 */

  public void setAccountId(AccountIdObjectData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = AccountIdObjectHelper.fromMap(inputMap, "AccountId");
  }

/**
 *
 * Gets the AccountId
 * @return Value of the AccountId
 *
 */

  public AccountIdObjectData getAccountId( ) {
    return updateIn;
  }

}
