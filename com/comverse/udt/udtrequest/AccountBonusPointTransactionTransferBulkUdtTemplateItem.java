/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionTransferBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionTransferBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionTransferBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData AccountBonusPointTransactionTo;
  protected AccountBonusPointTransactionObjectData AccountBonusPointTransactionFrom;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionTransferBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionTransferBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData AccountBonusPointTransactionToIn, AccountBonusPointTransactionObjectData AccountBonusPointTransactionFromIn) {
    super(id, context, "AccountBonusPointTransactionTransfer");
    AccountBonusPointTransactionTo = AccountBonusPointTransactionToIn;
    AccountBonusPointTransactionFrom = AccountBonusPointTransactionFromIn;
  }

  public void translateToMap() {
    if (AccountBonusPointTransactionTo != null) {
      AccountBonusPointTransactionTo.resetFlags(true, true);
      addInput("AccountBonusPointTransactionTo", AccountBonusPointTransactionObjectHelper.toMap(AccountBonusPointTransactionTo, new HashMap(), "AccountBonusPointTransactionTransferOutputData").get("AccountBonusPointTransactionTransferOutputData"));
    }
    if (AccountBonusPointTransactionFrom != null) {
      AccountBonusPointTransactionFrom.resetFlags(true, true);
      addInput("AccountBonusPointTransactionFrom", AccountBonusPointTransactionObjectHelper.toMap(AccountBonusPointTransactionFrom, new HashMap(), "AccountBonusPointTransactionTransferOutputData").get("AccountBonusPointTransactionTransferOutputData"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransactionTo
 * @param AccountBonusPointTransactionToIn Value of the AccountBonusPointTransactionTo
 *
 */

  public void setAccountBonusPointTransactionTo(AccountBonusPointTransactionObjectData AccountBonusPointTransactionToIn) {
    AccountBonusPointTransactionTo = AccountBonusPointTransactionToIn;
  }

/**
 *
 * Sets the AccountBonusPointTransactionFrom
 * @param AccountBonusPointTransactionFromIn Value of the AccountBonusPointTransactionFrom
 *
 */

  public void setAccountBonusPointTransactionFrom(AccountBonusPointTransactionObjectData AccountBonusPointTransactionFromIn) {
    AccountBonusPointTransactionFrom = AccountBonusPointTransactionFromIn;
  }

  public void translateFromMap() {
    AccountBonusPointTransactionTo = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransactionTo");
    AccountBonusPointTransactionFrom = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransactionFrom");
  }

/**
 *
 * Gets the AccountBonusPointTransactionTo
 * @return Value of the AccountBonusPointTransactionTo
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionTo( ) {
    return AccountBonusPointTransactionTo;
  }

/**
 *
 * Gets the AccountBonusPointTransactionFrom
 * @return Value of the AccountBonusPointTransactionFrom
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionFrom( ) {
    return AccountBonusPointTransactionFrom;
  }

}
