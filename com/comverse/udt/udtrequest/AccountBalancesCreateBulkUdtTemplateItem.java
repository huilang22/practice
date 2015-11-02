/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBalancesCreateBulkUdtTemplateItem.java
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
 * Class used to create a AccountBalancesCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBalancesCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBalancesObjectData ABCreateIn;
/**
 *
 * Constructor to create a  AccountBalancesCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBalancesCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectData ABCreateInIn) {
    super(id, context, "AccountBalancesCreate");
    ABCreateIn = ABCreateInIn;
  }

  public void translateToMap() {
    if (ABCreateIn != null) {
      ABCreateIn.resetFlags(true, true);
      addInput("AccountBalances", AccountBalancesObjectHelper.toMap(ABCreateIn, new HashMap(), "AccountBalances").get("AccountBalances"));
    }
  }


/**
 *
 * Sets the AccountBalances
 * @param ABCreateInIn Value of the ABCreateIn
 *
 */

  public void setAccountBalances(AccountBalancesObjectData ABCreateInIn) {
    ABCreateIn = ABCreateInIn;
  }

  public void translateFromMap() {
    ABCreateIn = AccountBalancesObjectHelper.fromMap(inputMap, "AccountBalances");
  }

/**
 *
 * Gets the AccountBalances
 * @return Value of the AccountBalances
 *
 */

  public AccountBalancesObjectData getAccountBalances( ) {
    return ABCreateIn;
  }

}
