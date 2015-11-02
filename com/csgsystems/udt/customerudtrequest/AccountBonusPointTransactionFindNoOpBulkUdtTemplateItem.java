/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBonusPointTransactionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBonusPointTransactionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBonusPointTransactionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountBonusPointTransactionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBonusPointTransactionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBonusPointTransactionObjectDataList noOpInIn) {
    super(id, context, "AccountBonusPointTransactionFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = AccountBonusPointTransactionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBonusPointTransaction", noOpIn);
      }
      addInput("AccountBonusPointTransaction", mapList);
    }
  }
/**
 *
 * Sets the  AccountBonusPointTransaction
 * @param noOpInIn AccountBonusPointTransactionObjectDataList to set
 *
 */
  public void setAccountBonusPointTransaction(AccountBonusPointTransactionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBonusPointTransaction passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBonusPointTransactionObjectDataList getAccountBonusPointTransaction() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBonusPointTransactionObjectHelper.fromMapList(inputMap, "AccountBonusPointTransactionList");
  }
}
