/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefFindNoOpRequest.java
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
 * NoOp class used to simulate a CcViewDefFindNoOpRequest Udt Request/Response
 *
 */
public class CcViewDefFindNoOpRequest extends CcViewDefRequest {
/**
 *
 * Constructor to create a   CcViewDefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcViewDefFindNoOpRequest(String id, CcViewDefObjectDataList noOpIn) {
    super(id, "CcViewDefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CcViewDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcViewDef", noOpIn);
      }
      addInput("CcViewDef", mapList);
    }
  }
/**
 *
 * Retrieves the CcViewDefObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewDefObjectDataList getOutput() {
    return CcViewDefObjectHelper.fromMapList(outputMap, "CcViewDefList");
  }
}
