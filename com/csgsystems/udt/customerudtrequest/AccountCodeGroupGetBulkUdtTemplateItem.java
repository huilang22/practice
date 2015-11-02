/*
 * Generated code DO NOT EDIT
 * Generated file: AccountCodeGroupGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountCodeGroupGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountCodeGroupGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountCodeGroupObjectKeyData CACGgetIn;
/**
 *
 * Constructor to create a  AccountCodeGroupGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountCodeGroupGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountCodeGroupObjectKeyData CACGgetInIn) {
    super(id, context, "AccountCodeGroupGet");
    CACGgetIn = CACGgetInIn;
  }

  public void translateToMap() {
    if (CACGgetIn != null) {
      CACGgetIn.resetFlags(true, true);
      addInput("AccountCodeGroup", AccountCodeGroupObjectKeyHelper.toMap(CACGgetIn, new HashMap(), "AccountCodeGroupObjectKeyData").get("AccountCodeGroupObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountCodeGroup
 * @param CACGgetInIn Value of the CACGgetIn
 *
 */

  public void setAccountCodeGroup(AccountCodeGroupObjectKeyData CACGgetInIn) {
    CACGgetIn = CACGgetInIn;
  }

  public void translateFromMap() {
    CACGgetIn = AccountCodeGroupObjectKeyHelper.fromMap(inputMap, "AccountCodeGroup");
  }

/**
 *
 * Gets the AccountCodeGroup
 * @return Value of the AccountCodeGroup
 *
 */

  public AccountCodeGroupObjectKeyData getAccountCodeGroup( ) {
    return CACGgetIn;
  }

}
