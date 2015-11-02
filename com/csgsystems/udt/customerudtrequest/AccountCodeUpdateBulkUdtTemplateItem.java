/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectData CACupdateIn;
/**
 *
 * Constructor to create a  AccountCodeUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectData CACupdateInIn) {
    super(id, context, "AccountCodeUpdate");
    CACupdateIn = CACupdateInIn;
  }

  public void translateToMap() {
    if (CACupdateIn != null) {
      CACupdateIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectHelper.toMap(CACupdateIn, new HashMap(), "AccountCode").get("AccountCode"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACupdateInIn Value of the CACupdateIn
 *
 */

  public void setAccountCode(AccountCodeObjectData CACupdateInIn) {
    CACupdateIn = CACupdateInIn;
  }

  public void translateFromMap() {
    CACupdateIn = AccountCodeObjectHelper.fromMap(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectData getAccountCode( ) {
    return CACupdateIn;
  }

}
