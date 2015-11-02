/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionTransferNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionTransferNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointTransactionTransferNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBonusPointTransactionTransferOutputData noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointTransactionTransferNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointTransactionTransferNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionTransferOutputData noOpInIn) {
    super(id, context, "AccountBonusPointTransactionTransfer");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("AccountBonusPointTransactionTransferOutputData", AccountBonusPointTransactionTransferOutputHelper.toMap(noOpIn).get("AccountBonusPointTransactionTransferOutputData"));
    }
  }
/**
 *
 * Sets the  AccountBonusPointTransactionTransferOutputData
 * @param noOpInIn AccountBonusPointTransactionTransferOutputData to set
 *
 */
  public void setAccountBonusPointTransactionTransferOutputData(AccountBonusPointTransactionTransferOutputData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBonusPointTransactionTransferOutputData passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionTransferOutputData getAccountBonusPointTransactionTransferOutputData() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBonusPointTransactionTransferOutputHelper.fromMap(inputMap);
  }
}
