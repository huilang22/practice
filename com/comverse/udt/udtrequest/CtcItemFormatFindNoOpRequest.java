/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemFormatFindNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemFormatFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemFormatFindNoOpRequest extends CtcItemFormatRequest {
/**
 *
 * Constructor to create a   CtcItemFormatFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemFormatFindNoOpRequest(String id, CtcItemFormatObjectDataList noOpIn) {
    super(id, "CtcItemFormatFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemFormat", noOpIn);
      }
      addInput("CtcItemFormat", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemFormatObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemFormatObjectDataList getOutput() {
    return CtcItemFormatObjectHelper.fromMapList(outputMap, "CtcItemFormatList");
  }
}
