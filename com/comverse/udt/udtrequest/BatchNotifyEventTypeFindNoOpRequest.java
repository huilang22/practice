/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeFindNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchNotifyEventTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyEventTypeFindNoOpRequest extends BatchNotifyEventTypeRequest {
/**
 *
 * Constructor to create a   BatchNotifyEventTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyEventTypeFindNoOpRequest(String id, BatchNotifyEventTypeObjectDataList noOpIn) {
    super(id, "BatchNotifyEventTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchNotifyEventTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchNotifyEventType", noOpIn);
      }
      addInput("BatchNotifyEventType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchNotifyEventTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyEventTypeObjectDataList getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMapList(outputMap, "BatchNotifyEventTypeList");
  }
}
