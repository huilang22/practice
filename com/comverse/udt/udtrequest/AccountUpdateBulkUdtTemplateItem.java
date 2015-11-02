/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectData au2In;
/**
 *
 * Constructor to create a  AccountUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectData au2InIn) {
    super(id, context, "AccountUpdate");
    au2In = au2InIn;
  }

  public void translateToMap() {
    if (au2In != null) {
      au2In.resetFlags(true, true);
      addInput("Account", AccountObjectHelper.toMap(au2In, new HashMap(), "Account").get("Account"));
    }
  }


/**
 *
 * Sets the Account
 * @param au2InIn Value of the au2In
 *
 */

  public void setAccount(AccountObjectData au2InIn) {
    au2In = au2InIn;
  }

  public void translateFromMap() {
    au2In = AccountObjectHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData getAccount( ) {
    return au2In;
  }

}
