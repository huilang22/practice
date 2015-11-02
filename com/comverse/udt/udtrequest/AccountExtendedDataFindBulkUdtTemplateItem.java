/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountExtendedDataFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountExtendedDataFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountExtendedDataFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectKeyData aedfIn;
/**
 *
 * Constructor to create a  AccountExtendedDataFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountExtendedDataFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectKeyData aedfInIn) {
    super(id, context, "AccountExtendedDataFind");
    aedfIn = aedfInIn;
  }

  public void translateToMap() {
    if (aedfIn != null) {
      aedfIn.resetFlags(true, true);
      addInput("Account", AccountObjectKeyHelper.toMap(aedfIn, new HashMap(), "AccountObjectKeyData").get("AccountObjectKeyData"));
    }
  }


/**
 *
 * Sets the Account
 * @param aedfInIn Value of the aedfIn
 *
 */

  public void setAccount(AccountObjectKeyData aedfInIn) {
    aedfIn = aedfInIn;
  }

  public void translateFromMap() {
    aedfIn = AccountObjectKeyHelper.fromMap(inputMap, "Account");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectKeyData getAccount( ) {
    return aedfIn;
  }

}
