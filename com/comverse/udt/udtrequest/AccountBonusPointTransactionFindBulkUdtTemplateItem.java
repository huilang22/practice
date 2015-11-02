/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionFindBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectFilter findIn;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findInIn) {
    super(id, context, "AccountBonusPointTransactionFind");
    findIn = findInIn;
  }

  public void translateToMap() {
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(findIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param findInIn Value of the findIn
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectFilter findInIn) {
    findIn = findInIn;
  }

  public void translateFromMap() {
    findIn = AccountBonusPointTransactionObjectHelper.fromMapFilter(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectFilter getAccountBonusPointTransaction( ) {
    return findIn;
  }

}
