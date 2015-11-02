/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionRedeemPointsBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionRedeemPointsBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionRedeemPointsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData RedeemPointIn;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionRedeemPointsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionRedeemPointsBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData RedeemPointInIn) {
    super(id, context, "AccountBonusPointTransactionRedeemPoints");
    RedeemPointIn = RedeemPointInIn;
  }

  public void translateToMap() {
    if (RedeemPointIn != null) {
      RedeemPointIn.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(RedeemPointIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param RedeemPointInIn Value of the RedeemPointIn
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData RedeemPointInIn) {
    RedeemPointIn = RedeemPointInIn;
  }

  public void translateFromMap() {
    RedeemPointIn = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return RedeemPointIn;
  }

}
