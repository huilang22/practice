/*
 * Generated code DO NOT EDIT
 * Generated file: GlobalOpenItemIdMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GlobalOpenItemIdMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GlobalOpenItemIdMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GlobalOpenItemIdMapObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GlobalOpenItemIdMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GlobalOpenItemIdMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GlobalOpenItemIdMapObjectDataList noOpInIn) {
    super(id, context, "GlobalOpenItemIdMapFind");
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
        mapArray[i] = GlobalOpenItemIdMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GlobalOpenItemIdMap", noOpIn);
      }
      addInput("GlobalOpenItemIdMap", mapList);
    }
  }
/**
 *
 * Sets the  GlobalOpenItemIdMap
 * @param noOpInIn GlobalOpenItemIdMapObjectDataList to set
 *
 */
  public void setGlobalOpenItemIdMap(GlobalOpenItemIdMapObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GlobalOpenItemIdMap passed into the constructor
 * @return Simulated response
 *
 */
  public GlobalOpenItemIdMapObjectDataList getGlobalOpenItemIdMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GlobalOpenItemIdMapObjectHelper.fromMapList(inputMap, "GlobalOpenItemIdMapList");
  }
}
