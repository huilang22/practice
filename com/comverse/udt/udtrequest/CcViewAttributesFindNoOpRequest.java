/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesFindNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a CcViewAttributesFindNoOpRequest Udt Request/Response
 *
 */
public class CcViewAttributesFindNoOpRequest extends CcViewAttributesRequest {
/**
 *
 * Constructor to create a   CcViewAttributesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcViewAttributesFindNoOpRequest(String id, CcViewAttributesObjectDataList noOpIn) {
    super(id, "CcViewAttributesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CcViewAttributesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcViewAttributes", noOpIn);
      }
      addInput("CcViewAttributes", mapList);
    }
  }
/**
 *
 * Retrieves the CcViewAttributesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewAttributesObjectDataList getOutput() {
    return CcViewAttributesObjectHelper.fromMapList(outputMap, "CcViewAttributesList");
  }
}
