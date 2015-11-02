/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountAbiSourceGetBulkUdtTemplateItem.java
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
 * Class used to create a AccountAbiSourceGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountAbiSourceGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountAbiSourceObjectKeyData ABIgetIn;
/**
 *
 * Constructor to create a  AccountAbiSourceGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountAbiSourceGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectKeyData ABIgetInIn) {
    super(id, context, "AccountAbiSourceGet");
    ABIgetIn = ABIgetInIn;
  }

  public void translateToMap() {
    if (ABIgetIn != null) {
      ABIgetIn.resetFlags(true, true);
      addInput("AccountAbiSource", AccountAbiSourceObjectKeyHelper.toMap(ABIgetIn, new HashMap(), "AccountAbiSourceObjectKeyData").get("AccountAbiSourceObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountAbiSource
 * @param ABIgetInIn Value of the ABIgetIn
 *
 */

  public void setAccountAbiSource(AccountAbiSourceObjectKeyData ABIgetInIn) {
    ABIgetIn = ABIgetInIn;
  }

  public void translateFromMap() {
    ABIgetIn = AccountAbiSourceObjectKeyHelper.fromMap(inputMap, "AccountAbiSource");
  }

/**
 *
 * Gets the AccountAbiSource
 * @return Value of the AccountAbiSource
 *
 */

  public AccountAbiSourceObjectKeyData getAccountAbiSource( ) {
    return ABIgetIn;
  }

}
