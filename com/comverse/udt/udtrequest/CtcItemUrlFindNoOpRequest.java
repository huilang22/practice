/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemUrlFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemUrlFindNoOpRequest Udt Request/Response
 *
 */
public class CtcItemUrlFindNoOpRequest extends CtcItemUrlRequest {
/**
 *
 * Constructor to create a   CtcItemUrlFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemUrlFindNoOpRequest(String id, CtcItemUrlObjectDataList noOpIn) {
    super(id, "CtcItemUrlFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcItemUrlObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcItemUrl", noOpIn);
      }
      addInput("CtcItemUrl", mapList);
    }
  }
/**
 *
 * Retrieves the CtcItemUrlObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemUrlObjectDataList getOutput() {
    return CtcItemUrlObjectHelper.fromMapList(outputMap, "CtcItemUrlList");
  }
}
