/*
 * Generated code DO NOT EDIT
 * Generated file: AccountAbiSourceFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a AccountAbiSourceFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AccountAbiSourceFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AccountAbiSourceObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AccountAbiSourceFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AccountAbiSourceFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountAbiSourceObjectDataList noOpInIn) {
    super(id, context, "AccountAbiSourceFind");
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
        mapArray[i] = AccountAbiSourceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AccountAbiSource", noOpIn);
      }
      addInput("AccountAbiSource", mapList);
    }
  }
/**
 *
 * Sets the  AccountAbiSource
 * @param noOpInIn AccountAbiSourceObjectDataList to set
 *
 */
  public void setAccountAbiSource(AccountAbiSourceObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AccountAbiSource passed into the constructor
 * @return Simulated response
 *
 */
  public AccountAbiSourceObjectDataList getAccountAbiSource() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AccountAbiSourceObjectHelper.fromMapList(inputMap, "AccountAbiSourceList");
  }
}
