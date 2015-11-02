/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataParamTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataParamTypeFindNoOpRequest extends ExtendedDataParamTypeRequest {
/**
 *
 * Constructor to create a   ExtendedDataParamTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataParamTypeFindNoOpRequest(String id, XPTObjectDataList noOpIn) {
    super(id, "ExtendedDataParamTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = XPTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataParamType", noOpIn);
      }
      addInput("ExtendedDataParamType", mapList);
    }
  }
/**
 *
 * Retrieves the XPTObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public XPTObjectDataList getOutput() {
    return XPTObjectHelper.fromMapList(outputMap, "ExtendedDataParamTypeList");
  }
}
