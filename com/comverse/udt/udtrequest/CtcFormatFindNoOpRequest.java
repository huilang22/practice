/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcFormatFindNoOpRequest Udt Request/Response
 *
 */
public class CtcFormatFindNoOpRequest extends CtcFormatRequest {
/**
 *
 * Constructor to create a   CtcFormatFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFormatFindNoOpRequest(String id, CtcFormatObjectDataList noOpIn) {
    super(id, "CtcFormatFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcFormatObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFormat", noOpIn);
      }
      addInput("CtcFormat", mapList);
    }
  }
/**
 *
 * Retrieves the CtcFormatObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatObjectDataList getOutput() {
    return CtcFormatObjectHelper.fromMapList(outputMap, "CtcFormatList");
  }
}
