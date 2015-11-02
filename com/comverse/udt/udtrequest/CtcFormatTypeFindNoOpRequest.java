/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcFormatTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a CtcFormatTypeFindNoOpRequest Udt Request/Response
 *
 */
public class CtcFormatTypeFindNoOpRequest extends CtcFormatTypeRequest {
/**
 *
 * Constructor to create a   CtcFormatTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcFormatTypeFindNoOpRequest(String id, CtcFormatTypeObjectDataList noOpIn) {
    super(id, "CtcFormatTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtcFormatTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtcFormatType", noOpIn);
      }
      addInput("CtcFormatType", mapList);
    }
  }
/**
 *
 * Retrieves the CtcFormatTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtcFormatTypeObjectDataList getOutput() {
    return CtcFormatTypeObjectHelper.fromMapList(outputMap, "CtcFormatTypeList");
  }
}
