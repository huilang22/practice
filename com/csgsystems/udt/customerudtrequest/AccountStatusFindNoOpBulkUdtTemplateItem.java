/*
 * Generated code DO NOT EDIT
 * Generated file: AccountStatusFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountStatusFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountStatusFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountStatusObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountStatusFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountStatusFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountStatusObjectDataList noOpInIn) {
    super(id, context, "AccountStatusFind");
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
        mapArray[i] = AccountStatusObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountStatus", noOpIn);
      }
      addInput("AccountStatus", mapList);
    }
  }
/**
 *
 * Sets the  AccountStatus
 * @param noOpInIn AccountStatusObjectDataList to set
 *
 */
  public void setAccountStatus(AccountStatusObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountStatus passed into the constructor
 * @return Simulated response
 *
 */
  public AccountStatusObjectDataList getAccountStatus() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountStatusObjectHelper.fromMapList(inputMap, "AccountStatusList");
  }
}
