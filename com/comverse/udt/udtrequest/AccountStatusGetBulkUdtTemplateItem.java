/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountStatusGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountStatusGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountStatusGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountStatusObjectKeyData AccountStatusgetIn;
/**
 *
 * Constructor to create a  AccountStatusGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountStatusGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountStatusObjectKeyData AccountStatusgetInIn) {
    super(id, context, "AccountStatusGet");
    AccountStatusgetIn = AccountStatusgetInIn;
  }

  public void translateToMap() {
    if (AccountStatusgetIn != null) {
      AccountStatusgetIn.resetFlags(true, true);
      addInput("AccountStatus", AccountStatusObjectKeyHelper.toMap(AccountStatusgetIn, new HashMap(), "AccountStatusObjectKeyData").get("AccountStatusObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountStatus
 * @param AccountStatusgetInIn Value of the AccountStatusgetIn
 *
 */

  public void setAccountStatus(AccountStatusObjectKeyData AccountStatusgetInIn) {
    AccountStatusgetIn = AccountStatusgetInIn;
  }

  public void translateFromMap() {
    AccountStatusgetIn = AccountStatusObjectKeyHelper.fromMap(inputMap, "AccountStatus");
  }

/**
 *
 * Gets the AccountStatus
 * @return Value of the AccountStatus
 *
 */

  public AccountStatusObjectKeyData getAccountStatus( ) {
    return AccountStatusgetIn;
  }

}
