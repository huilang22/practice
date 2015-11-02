/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamFindNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataParamFindNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataParamFindNoOpRequest extends ExtendedDataParamRequest {
/**
 *
 * Constructor to create a   ExtendedDataParamFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataParamFindNoOpRequest(String id, XPDObjectDataList noOpIn) {
    super(id, "ExtendedDataParamFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = XPDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataParam", noOpIn);
      }
      addInput("ExtendedDataParam", mapList);
    }
  }
/**
 *
 * Retrieves the XPDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public XPDObjectDataList getOutput() {
    return XPDObjectHelper.fromMapList(outputMap, "ExtendedDataParamList");
  }
}
