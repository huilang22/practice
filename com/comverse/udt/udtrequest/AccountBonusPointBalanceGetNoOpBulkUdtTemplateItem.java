/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointBalanceGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointBalanceGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointBalanceGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBonusPointBalanceObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointBalanceGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointBalanceGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointBalanceObjectData noOpInIn) {
    super(id, context, "AccountBonusPointBalanceGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountBonusPointBalance", AccountBonusPointBalanceObjectHelper.toMap(noOpIn, new HashMap(), "AccountBonusPointBalance").get("AccountBonusPointBalance"));
    }
  }
/**
 *
 * Sets the  AccountBonusPointBalance
 * @param noOpInIn AccountBonusPointBalanceObjectData to set
 *
 */
  public void setAccountBonusPointBalance(AccountBonusPointBalanceObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBonusPointBalance passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointBalanceObjectData getAccountBonusPointBalance() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBonusPointBalanceObjectHelper.fromMap(inputMap, "AccountBonusPointBalance");
  }
}
