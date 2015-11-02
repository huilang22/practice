/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefFindNoOpRequest.java
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
 * NoOp class used to simulate a CcAttributesDefFindNoOpRequest Udt Request/Response
 *
 */
public class CcAttributesDefFindNoOpRequest extends CcAttributesDefRequest {
/**
 *
 * Constructor to create a   CcAttributesDefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAttributesDefFindNoOpRequest(String id, CcAttributesDefObjectDataList noOpIn) {
    super(id, "CcAttributesDefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CcAttributesDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcAttributesDef", noOpIn);
      }
      addInput("CcAttributesDef", mapList);
    }
  }
/**
 *
 * Retrieves the CcAttributesDefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CcAttributesDefObjectDataList getOutput() {
    return CcAttributesDefObjectHelper.fromMapList(outputMap, "CcAttributesDefList");
  }
}
