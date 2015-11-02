/*
 * Generated code DO NOT EDIT
 * Generated file: AppNameFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a AppNameFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class AppNameFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected AppNameObjectDataList noOpIn;

/**
 *
 * Constructor to create a   AppNameFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public AppNameFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, AppNameObjectDataList noOpInIn) {
    super(id, context, "AppNameFind");
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
        mapArray[i] = AppNameObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("AppName", noOpIn);
      }
      addInput("AppName", mapList);
    }
  }
/**
 *
 * Sets the  AppName
 * @param noOpInIn AppNameObjectDataList to set
 *
 */
  public void setAppName(AppNameObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the AppName passed into the constructor
 * @return Simulated response
 *
 */
  public AppNameObjectDataList getAppName() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = AppNameObjectHelper.fromMapList(inputMap, "AppNameList");
  }
}
