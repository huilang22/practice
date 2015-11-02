/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchRequestNotifyParameterFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestNotifyParameterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestNotifyParameterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestNotifyParameterObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestNotifyParameterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestNotifyParameterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestNotifyParameterObjectDataList noOpInIn) {
    super(id, context, "BatchRequestNotifyParameterFind");
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
        mapArray[i] = BatchRequestNotifyParameterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestNotifyParameter", noOpIn);
      }
      addInput("BatchRequestNotifyParameter", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestNotifyParameter
 * @param noOpInIn BatchRequestNotifyParameterObjectDataList to set
 *
 */
  public void setBatchRequestNotifyParameter(BatchRequestNotifyParameterObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestNotifyParameter passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestNotifyParameterObjectDataList getBatchRequestNotifyParameter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestNotifyParameterObjectHelper.fromMapList(inputMap, "BatchRequestNotifyParameterList");
  }
}
