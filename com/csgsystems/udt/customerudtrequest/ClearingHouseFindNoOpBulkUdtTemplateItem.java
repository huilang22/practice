/*
 * Generated code DO NOT EDIT
 * Generated file: ClearingHouseFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ClearingHouseFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ClearingHouseFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ClearingHouseObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ClearingHouseFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ClearingHouseFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ClearingHouseObjectDataList noOpInIn) {
    super(id, context, "ClearingHouseFind");
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
        mapArray[i] = ClearingHouseObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ClearingHouse", noOpIn);
      }
      addInput("ClearingHouse", mapList);
    }
  }
/**
 *
 * Sets the  ClearingHouse
 * @param noOpInIn ClearingHouseObjectDataList to set
 *
 */
  public void setClearingHouse(ClearingHouseObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ClearingHouse passed into the constructor
 * @return Simulated response
 *
 */
  public ClearingHouseObjectDataList getClearingHouse() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ClearingHouseObjectHelper.fromMapList(inputMap, "ClearingHouseList");
  }
}
