/*
 * Generated code DO NOT EDIT
 * Generated file: CitTaskFindForInvalidUserNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cit.data.*;

/**
 *
 * NoOp class used to simulate a CitTaskFindForInvalidUserNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskFindForInvalidUserNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitTaskFindForInvalidUserNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskFindForInvalidUserNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectDataList noOpInIn) {
    super(id, context, "CitTaskFindForInvalidUser");
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
        mapArray[i] = CitTaskObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTask", noOpIn);
      }
      addInput("CitTask", mapList);
    }
  }
/**
 *
 * Sets the  CitTask
 * @param noOpInIn CitTaskObjectDataList to set
 *
 */
  public void setCitTask(CitTaskObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTask passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskObjectDataList getCitTask() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskObjectHelper.fromMapList(inputMap, "CitTaskList");
  }
}
