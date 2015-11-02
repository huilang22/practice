/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a BatchParticipantTypeFindNoOpRequest Udt Request/Response
 *
 */
public class BatchParticipantTypeFindNoOpRequest extends BatchParticipantTypeRequest {
/**
 *
 * Constructor to create a   BatchParticipantTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchParticipantTypeFindNoOpRequest(String id, BatchParticipantTypeObjectDataList noOpIn) {
    super(id, "BatchParticipantTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = BatchParticipantTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BatchParticipantType", noOpIn);
      }
      addInput("BatchParticipantType", mapList);
    }
  }
/**
 *
 * Retrieves the BatchParticipantTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public BatchParticipantTypeObjectDataList getOutput() {
    return BatchParticipantTypeObjectHelper.fromMapList(outputMap, "BatchParticipantTypeList");
  }
}
