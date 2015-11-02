/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcContentTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcContentTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CtcContentTypeFindNoOpRequest extends CtcContentTypeRequest {
/**
 *
 * Constructor to create a   CtcContentTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcContentTypeFindNoOpRequest(String id, CtcContentTypeObjectDataList noOpIn) {
    super(id, "CtcContentTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcContentTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcContentType", noOpIn);
      }
      addInput("CtcContentType", mapList);
    }
  }
/**
 *
 * Retrieves the CtcContentTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcContentTypeObjectDataList getOutput() {
    return CtcContentTypeObjectHelper.fromMapList(outputMap, "CtcContentTypeList");
  }
}
