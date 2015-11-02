/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a TransSourceTypeFindNoOpRequest Udt Request/Response
 *
 */
public class TransSourceTypeFindNoOpRequest extends TransSourceTypeRequest {
/**
 *
 * Constructor to create a   TransSourceTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransSourceTypeFindNoOpRequest(String id, TransSourceTypeObjectDataList noOpIn) {
    super(id, "TransSourceTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TransSourceTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TransSourceType", noOpIn);
      }
      addInput("TransSourceType", mapList);
    }
  }
/**
 *
 * Retrieves the TransSourceTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TransSourceTypeObjectDataList getOutput() {
    return TransSourceTypeObjectHelper.fromMapList(outputMap, "TransSourceTypeList");
  }
}
