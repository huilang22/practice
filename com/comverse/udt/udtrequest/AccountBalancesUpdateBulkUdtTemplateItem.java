/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesUpdateBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectData ABUpdateIn;
/**
 *
 * Constructor to create a  AccountBalancesUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData ABUpdateInIn) {
    super(id, context, "AccountBalancesUpdate");
    ABUpdateIn = ABUpdateInIn;
  }

  public void translateToMap() {
    if (ABUpdateIn != null) {
      ABUpdateIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABUpdateIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABUpdateInIn Value of the ABUpdateIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectData ABUpdateInIn) {
    ABUpdateIn = ABUpdateInIn;
  }

  public void translateFromMap() {
    ABUpdateIn = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectData getAccountBalances( ) {
    return ABUpdateIn;
  }

}
