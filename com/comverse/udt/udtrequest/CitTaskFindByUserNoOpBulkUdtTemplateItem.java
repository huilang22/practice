/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskFindByUserNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CitTaskFindByUserNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CitTaskFindByUserNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CitTaskObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CitTaskFindByUserNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CitTaskFindByUserNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CitTaskObjectDataList noOpInIn) {
    super(id, context, "CitTaskFindByUser");
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
