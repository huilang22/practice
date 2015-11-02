/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskPriorityFindNoOpBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

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
 * NoOp class used to simulate a CitTaskPriorityFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskPriorityFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskPriorityObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitTaskPriorityFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskPriorityFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskPriorityObjectDataList noOpInIn) {
    super(id, context, "CitTaskPriorityFind");
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
        mapArray[i] = CitTaskPriorityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CitTaskPriority", noOpIn);
      }
      addInput("CitTaskPriority", mapList);
    }
  }
/**
 *
 * Sets the  CitTaskPriority
 * @param noOpInIn CitTaskPriorityObjectDataList to set
 *
 */
  public void setCitTaskPriority(CitTaskPriorityObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CitTaskPriority passed into the constructor
 * @return Simulated response
 *
 */
  public CitTaskPriorityObjectDataList getCitTaskPriority() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CitTaskPriorityObjectHelper.fromMapList(inputMap, "CitTaskPriorityList");
  }
}
