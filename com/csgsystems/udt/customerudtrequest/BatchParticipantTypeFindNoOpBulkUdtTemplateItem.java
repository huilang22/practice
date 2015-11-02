/*
 * Generated code DO NOT EDIT
 * Generated file: BatchParticipantTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchParticipantTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchParticipantTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchParticipantTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BatchParticipantTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchParticipantTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchParticipantTypeObjectDataList noOpInIn) {
    super(id, context, "BatchParticipantTypeFind");
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
        mapArray[i] = BatchParticipantTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchParticipantType", noOpIn);
      }
      addInput("BatchParticipantType", mapList);
    }
  }
/**
 *
 * Sets the  BatchParticipantType
 * @param noOpInIn BatchParticipantTypeObjectDataList to set
 *
 */
  public void setBatchParticipantType(BatchParticipantTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchParticipantType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchParticipantTypeObjectDataList getBatchParticipantType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchParticipantTypeObjectHelper.fromMapList(inputMap, "BatchParticipantTypeList");
  }
}
