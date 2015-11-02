/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesAlternateGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesAlternateGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesAlternateGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectData ABAlternateGetIn;
/**
 *
 * Constructor to create a  AccountBalancesAlternateGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesAlternateGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData ABAlternateGetInIn) {
    super(id, context, "AccountBalancesAlternateGet");
    ABAlternateGetIn = ABAlternateGetInIn;
  }

  public void translateToMap() {
    if (ABAlternateGetIn != null) {
      ABAlternateGetIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABAlternateGetIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABAlternateGetInIn Value of the ABAlternateGetIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectData ABAlternateGetInIn) {
    ABAlternateGetIn = ABAlternateGetInIn;
  }

  public void translateFromMap() {
    ABAlternateGetIn = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectData getAccountBalances( ) {
    return ABAlternateGetIn;
  }

}
