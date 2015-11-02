/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectKeyData ABGetIn;
/**
 *
 * Constructor to create a  AccountBalancesGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectKeyData ABGetInIn) {
    super(id, context, "AccountBalancesGet");
    ABGetIn = ABGetInIn;
  }

  public void translateToMap() {
    if (ABGetIn != null) {
      ABGetIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectKeyHelper.toMap(ABGetIn, new HashMap(), "AccountBalancesObjectKeyData").get("AccountBalancesObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABGetInIn Value of the ABGetIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectKeyData ABGetInIn) {
    ABGetIn = ABGetInIn;
  }

  public void translateFromMap() {
    ABGetIn = AccountBalancesObjectKeyHelper.fromMap(inputMap, "AccountBalances");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectKeyData getAccountBalances( ) {
    return ABGetIn;
  }

}
