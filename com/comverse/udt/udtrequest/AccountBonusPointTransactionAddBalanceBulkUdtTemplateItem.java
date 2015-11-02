/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionAddBalanceBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionAddBalanceBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionAddBalanceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectData ExtBalAddIn;
  protected String AccountExternalId;
  protected BigInteger AccountExternalIdType;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionAddBalanceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionAddBalanceBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData ExtBalAddInIn, String AccountExternalIdIn, BigInteger AccountExternalIdTypeIn) {
    super(id, context, "AccountBonusPointTransactionAddBalance");
    ExtBalAddIn = ExtBalAddInIn;
    AccountExternalId = AccountExternalIdIn;
    AccountExternalIdType = AccountExternalIdTypeIn;
  }

  public void translateToMap() {
    if (ExtBalAddIn != null) {
      ExtBalAddIn.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(ExtBalAddIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param ExtBalAddInIn Value of the ExtBalAddIn
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData ExtBalAddInIn) {
    ExtBalAddIn = ExtBalAddInIn;
  }

/**
 *
 * Sets the AccountExternalId
 * @param AccountExternalIdIn Value of the AccountExternalId
 *
 */

  public void setAccountExternalId(String AccountExternalIdIn) {
    AccountExternalId = AccountExternalIdIn;
  }

/**
 *
 * Sets the AccountExternalIdType
 * @param AccountExternalIdTypeIn Value of the AccountExternalIdType
 *
 */

  public void setAccountExternalIdType(BigInteger AccountExternalIdTypeIn) {
    AccountExternalIdType = AccountExternalIdTypeIn;
  }

  public void translateFromMap() {
    ExtBalAddIn = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
    AccountExternalId = (String)inputMap.get("AccountExternalId");
    AccountExternalIdType = (BigInteger)inputMap.get("AccountExternalIdType");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction( ) {
    return ExtBalAddIn;
  }

/**
 *
 * Gets the AccountExternalId
 * @return Value of the AccountExternalId
 *
 */

  public String getAccountExternalId( ) {
    return AccountExternalId;
  }

/**
 *
 * Gets the AccountExternalIdType
 * @return Value of the AccountExternalIdType
 *
 */

  public BigInteger getAccountExternalIdType( ) {
    return AccountExternalIdType;
  }

}
