/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchRequestParticipantFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchRequestParticipantFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchRequestParticipantObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchRequestParticipantFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchRequestParticipantFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchRequestParticipantObjectDataList noOpInIn) {
    super(id, context, "BatchRequestParticipantFind");
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
        mapArray[i] = BatchRequestParticipantObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchRequestParticipant", noOpIn);
      }
      addInput("BatchRequestParticipant", mapList);
    }
  }
/**
 *
 * Sets the  BatchRequestParticipant
 * @param noOpInIn BatchRequestParticipantObjectDataList to set
 *
 */
  public void setBatchRequestParticipant(BatchRequestParticipantObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchRequestParticipant passed into the constructor
 * @return Simulated response
 *
 */
  public BatchRequestParticipantObjectDataList getBatchRequestParticipant() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchRequestParticipantObjectHelper.fromMapList(inputMap, "BatchRequestParticipantList");
  }
}
