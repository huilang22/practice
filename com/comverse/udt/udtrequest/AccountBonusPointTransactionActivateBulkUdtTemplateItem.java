/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionActivateBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionActivateBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionActivateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectKeyData actIn1;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionActivateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionActivateBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData actIn1In) {
    super(id, context, "AccountBonusPointTransactionActivate");
    actIn1 = actIn1In;
  }

  public void translateToMap() {
    if (actIn1 != null) {
      actIn1.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(actIn1, new HashMap(), "AccountBonusPointTransactionObjectKeyData").get("AccountBonusPointTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param actIn1In Value of the actIn1
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectKeyData actIn1In) {
    actIn1 = actIn1In;
  }

  public void translateFromMap() {
    actIn1 = AccountBonusPointTransactionObjectKeyHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectKeyData getAccountBonusPointTransaction( ) {
    return actIn1;
  }

}
