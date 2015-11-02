/*
 * Generated code DO NOT EDIT
 * Generated file: AccountInsertFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountInsertFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountInsertFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountInsertObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountInsertFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountInsertFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountInsertObjectDataList noOpInIn) {
    super(id, context, "AccountInsertFind");
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
        mapArray[i] = AccountInsertObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountInsert", noOpIn);
      }
      addInput("AccountInsert", mapList);
    }
  }
/**
 *
 * Sets the  AccountInsert
 * @param noOpInIn AccountInsertObjectDataList to set
 *
 */
  public void setAccountInsert(AccountInsertObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountInsert passed into the constructor
 * @return Simulated response
 *
 */
  public AccountInsertObjectDataList getAccountInsert() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountInsertObjectHelper.fromMapList(inputMap, "AccountInsertList");
  }
}
