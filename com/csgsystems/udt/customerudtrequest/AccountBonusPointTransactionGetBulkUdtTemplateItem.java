/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a AccountBonusPointTransactionGetBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectKeyData getIn;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionGetBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectKeyData getInIn) {
    super(id, context, "AccountBonusPointTransactionGet");
    getIn = getInIn;
  }

  public void translateToMap() {
    if (getIn != null) {
      getIn.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(getIn, new HashMap(), "AccountBonusPointTransactionObjectKeyData").get("AccountBonusPointTransactionObjectKeyData"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param getInIn Value of the getIn
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectKeyData getInIn) {
    getIn = getInIn;
  }

  public void translateFromMap() {
    getIn = AccountBonusPointTransactionObjectKeyHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectKeyData getAccountBonusPointTransaction( ) {
    return getIn;
  }

}
