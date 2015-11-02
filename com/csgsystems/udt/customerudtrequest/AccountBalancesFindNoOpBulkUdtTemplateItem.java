/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBalancesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountBalancesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountBalancesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountBalancesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountBalancesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountBalancesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountBalancesObjectDataList noOpInIn) {
    super(id, context, "AccountBalancesFind");
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
        mapArray[i] = AccountBalancesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountBalances", noOpIn);
      }
      addInput("AccountBalances", mapList);
    }
  }
/**
 *
 * Sets the  AccountBalances
 * @param noOpInIn AccountBalancesObjectDataList to set
 *
 */
  public void setAccountBalances(AccountBalancesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountBalances passed into the constructor
 * @return Simulated response
 *
 */
  public AccountBalancesObjectDataList getAccountBalances() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountBalancesObjectHelper.fromMapList(inputMap, "AccountBalancesList");
  }
}
