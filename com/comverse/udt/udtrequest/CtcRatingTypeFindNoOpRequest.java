/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcRatingTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcRatingTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CtcRatingTypeFindNoOpRequest extends CtcRatingTypeRequest {
/**
 *
 * Constructor to create a   CtcRatingTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcRatingTypeFindNoOpRequest(String id, CtcRatingTypeObjectDataList noOpIn) {
    super(id, "CtcRatingTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcRatingTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcRatingType", noOpIn);
      }
      addInput("CtcRatingType", mapList);
    }
  }
/**
 *
 * Retrieves the CtcRatingTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcRatingTypeObjectDataList getOutput() {
    return CtcRatingTypeObjectHelper.fromMapList(outputMap, "CtcRatingTypeList");
  }
}
