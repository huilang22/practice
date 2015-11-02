/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData agIn;
/**
 *
 * Constructor to create a  AccountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData agInIn) {
    super(id, context, "AccountGet");
    agIn = agInIn;
  }

  public void translateToMap() {
    if (agIn != null) {
      agIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(agIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }


/**
 *
 * Sets the Account
 * @param agInIn Value of the agIn
 *
 */

  public void setAccount(AccountObjectKeyData agInIn) {
    agIn = agInIn;
  }

  public void translateFromMap() {
    agIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return agIn;
  }

}
