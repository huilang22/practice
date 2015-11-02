/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountBonusPointTransactionUpdateNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionUpdateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointTransactionUpdateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBonusPointTransactionObjectData noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointTransactionUpdateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointTransactionUpdateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectData noOpInIn) {
    super(id, context, "AccountBonusPointTransactionUpdate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(noOpIn, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
/**
 *
 * Sets the  AccountBonusPointTransaction
 * @param noOpInIn AccountBonusPointTransactionObjectData to set
 *
 */
  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBonusPointTransaction passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransaction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBonusPointTransactionObjectHelper.fromMap(inputMap, "AccountBonusPointTransaction");
  }
}
