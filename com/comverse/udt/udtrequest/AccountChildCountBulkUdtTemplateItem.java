/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountChildCountBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * Class used to create a AccountChildCountBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountChildCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData accIn;
/**
 *
 * Constructor to create a  AccountChildCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountChildCountBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData accInIn) {
    super(id, context, "AccountChildCount");
    accIn = accInIn;
  }

  public void translateToMap() {
    if (accIn != null) {
      accIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(accIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }


/**
 *
 * Sets the Account
 * @param accInIn Value of the accIn
 *
 */

  public void setAccount(AccountObjectKeyData accInIn) {
    accIn = accInIn;
  }

  public void translateFromMap() {
    accIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return accIn;
  }

}
