/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalAccountBalancesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GlobalAccountBalancesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalAccountBalancesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalAccountBalancesObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GlobalAccountBalancesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalAccountBalancesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalAccountBalancesObjectDataList noOpInIn) {
    super(id, context, "GlobalAccountBalancesFind");
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
        mapArray[i] = GlobalAccountBalancesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalAccountBalances", noOpIn);
      }
      addInput("GlobalAccountBalances", mapList);
    }
  }
/**
 *
 * Sets the  GlobalAccountBalances
 * @param noOpInIn GlobalAccountBalancesObjectDataList to set
 *
 */
  public void setGlobalAccountBalances(GlobalAccountBalancesObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalAccountBalances passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalAccountBalancesObjectDataList getGlobalAccountBalances() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalAccountBalancesObjectHelper.fromMapList(inputMap, "GlobalAccountBalancesList");
  }
}
