/*
 * Generated code DO NOT EDIT
 * Generated file: LogFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a LogFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LogFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LogfileObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LogFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LogFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LogfileObjectDataList noOpInIn) {
    super(id, context, "LogFind");
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
        mapArray[i] = LogfileObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Log", noOpIn);
      }
      addInput("Log", mapList);
    }
  }
/**
 *
 * Sets the  Log
 * @param noOpInIn LogfileObjectDataList to set
 *
 */
  public void setLog(LogfileObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Log passed into the constructor
 * @return Simulated response
 *
 */
  public LogfileObjectDataList getLog() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LogfileObjectHelper.fromMapList(inputMap, "LogList");
  }
}
