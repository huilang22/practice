/*
 * Generated code DO NOT EDIT
 * Generated file: AccountIdFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountIdFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountIdFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountIdObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountIdFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountIdFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountIdObjectDataList noOpInIn) {
    super(id, context, "AccountIdFind");
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
        mapArray[i] = AccountIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountId", noOpIn);
      }
      addInput("AccountId", mapList);
    }
  }
/**
 *
 * Sets the  AccountId
 * @param noOpInIn AccountIdObjectDataList to set
 *
 */
  public void setAccountId(AccountIdObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountId passed into the constructor
 * @return Simulated response
 *
 */
  public AccountIdObjectDataList getAccountId() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountIdObjectHelper.fromMapList(inputMap, "AccountIdList");
  }
}
