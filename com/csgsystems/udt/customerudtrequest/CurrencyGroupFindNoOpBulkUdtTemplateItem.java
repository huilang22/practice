/*
 * Generated code DO NOT EDIT
 * Generated file: CurrencyGroupFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CurrencyGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CurrencyGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CurrencyGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CurrencyGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CurrencyGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CurrencyGroupObjectDataList noOpInIn) {
    super(id, context, "CurrencyGroupFind");
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
        mapArray[i] = CurrencyGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CurrencyGroup", noOpIn);
      }
      addInput("CurrencyGroup", mapList);
    }
  }
/**
 *
 * Sets the  CurrencyGroup
 * @param noOpInIn CurrencyGroupObjectDataList to set
 *
 */
  public void setCurrencyGroup(CurrencyGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CurrencyGroup passed into the constructor
 * @return Simulated response
 *
 */
  public CurrencyGroupObjectDataList getCurrencyGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CurrencyGroupObjectHelper.fromMapList(inputMap, "CurrencyGroupList");
  }
}
