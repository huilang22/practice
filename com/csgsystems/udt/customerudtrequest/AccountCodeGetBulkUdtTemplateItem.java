/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeObjectKeyData CACgetIn;
/**
 *
 * Constructor to create a  AccountCodeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeObjectKeyData CACgetInIn) {
    super(id, context, "AccountCodeGet");
    CACgetIn = CACgetInIn;
  }

  public void translateToMap() {
    if (CACgetIn != null) {
      CACgetIn.resetFlags(true, true);
      addInput("AccountCode", AccountCodeObjectKeyHelper.toMap(CACgetIn, new HashMap(), "AccountCodeObjectKeyData").get("AccountCodeObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountCode
 * @param CACgetInIn Value of the CACgetIn
 *
 */

  public void setAccountCode(AccountCodeObjectKeyData CACgetInIn) {
    CACgetIn = CACgetInIn;
  }

  public void translateFromMap() {
    CACgetIn = AccountCodeObjectKeyHelper.fromMap(inputMap, "AccountCode");
  }

/**
 *
 * Gets the AccountCode
 * @return Value of the AccountCode
 *
 */

  public AccountCodeObjectKeyData getAccountCode( ) {
    return CACgetIn;
  }

}
