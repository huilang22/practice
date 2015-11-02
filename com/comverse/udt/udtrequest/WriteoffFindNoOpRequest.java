/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * WriteoffFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a WriteoffFindNoOpRequest Udt Request/Response
 *
 */
public class WriteoffFindNoOpRequest extends WriteoffRequest {
/**
 *
 * Constructor to create a   WriteoffFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public WriteoffFindNoOpRequest(String id, WriteoffObjectDataList noOpIn) {
    super(id, "WriteoffFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = WriteoffObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Writeoff", noOpIn);
      }
      addInput("Writeoff", mapList);
    }
  }
/**
 *
 * Retrieves the WriteoffObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public WriteoffObjectDataList getOutput() {
    return WriteoffObjectHelper.fromMapList(outputMap, "WriteoffList");
  }
}
