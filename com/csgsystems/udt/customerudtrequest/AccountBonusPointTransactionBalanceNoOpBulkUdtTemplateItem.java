/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionBalanceNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionBalanceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointTransactionBalanceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BigInteger noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointTransactionBalanceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointTransactionBalanceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger noOpInIn) {
    super(id, context, "AccountBonusPointTransactionBalance");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      addInput("Amount", noOpIn);
    }
  }
/**
 *
 * Sets the  Amount
 * @param noOpInIn BigInteger to set
 *
 */
  public void setAmount(BigInteger noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Amount passed into the constructor
 * @return Simulated response
 *
 */
  public BigInteger getAmount() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn =  (BigInteger)inputMap.get("Amount");
  }
}
