/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseInfoFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClearingHouseInfoFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseInfoFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseInfoObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseInfoFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseInfoFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseInfoObjectDataList noOpInIn) {
    super(id, context, "ClearingHouseInfoFind");
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
        mapArray[i] = ClearingHouseInfoObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouseInfo", noOpIn);
      }
      addInput("ClearingHouseInfo", mapList);
    }
  }
/**
 *
 * Sets the  ClearingHouseInfo
 * @param noOpInIn ClearingHouseInfoObjectDataList to set
 *
 */
  public void setClearingHouseInfo(ClearingHouseInfoObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouseInfo passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseInfoObjectDataList getClearingHouseInfo() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseInfoObjectHelper.fromMapList(inputMap, "ClearingHouseInfoList");
  }
}
