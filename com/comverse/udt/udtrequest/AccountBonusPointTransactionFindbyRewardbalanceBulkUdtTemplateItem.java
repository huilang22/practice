/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionFindbyRewardbalanceBulkUdtTemplateItem.java
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
 * Class used to create a AccountBonusPointTransactionFindbyRewardbalanceBulkUdtTemplateItem Bulk Template
 *
 */

public class AccountBonusPointTransactionFindbyRewardbalanceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountBonusPointTransactionObjectFilter findByIn;
/**
 *
 * Constructor to create a  AccountBonusPointTransactionFindbyRewardbalanceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public AccountBonusPointTransactionFindbyRewardbalanceBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectFilter findByInIn) {
    super(id, context, "AccountBonusPointTransactionFindbyRewardbalance");
    findByIn = findByInIn;
  }

  public void translateToMap() {
    if (findByIn != null) {
      Integer index =  findByIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(findByIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }


/**
 *
 * Sets the AccountBonusPointTransaction
 * @param findByInIn Value of the findByIn
 *
 */

  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectFilter findByInIn) {
    findByIn = findByInIn;
  }

  public void translateFromMap() {
    findByIn = AccountBonusPointTransactionObjectHelper.fromMapFilter(inputMap, "AccountBonusPointTransaction");
  }

/**
 *
 * Gets the AccountBonusPointTransaction
 * @return Value of the AccountBonusPointTransaction
 *
 */

  public AccountBonusPointTransactionObjectFilter getAccountBonusPointTransaction( ) {
    return findByIn;
  }

}
