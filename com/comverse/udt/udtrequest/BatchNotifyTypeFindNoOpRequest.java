/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchNotifyTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchNotifyTypeFindNoOpRequest extends BatchNotifyTypeRequest {
/**
 *
 * Constructor to create a   BatchNotifyTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchNotifyTypeFindNoOpRequest(String id, BatchNotifyTypeObjectDataList noOpIn) {
    super(id, "BatchNotifyTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchNotifyTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchNotifyType", noOpIn);
      }
      addInput("BatchNotifyType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchNotifyTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyTypeObjectDataList getOutput() {
    return BatchNotifyTypeObjectHelper.fromMapList(outputMap, "BatchNotifyTypeList");
  }
}
