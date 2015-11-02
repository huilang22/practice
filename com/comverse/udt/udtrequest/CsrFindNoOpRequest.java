/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrFindNoOpRequest.java
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
 * NoOp class used to simulate a CsrFindNoOpRequest Udt Request/Response
 *
 */
public class CsrFindNoOpRequest extends CsrRequest {
/**
 *
 * Constructor to create a   CsrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrFindNoOpRequest(String id, CsrObjectDataList noOpIn) {
    super(id, "CsrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CsrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Csr", noOpIn);
      }
      addInput("Csr", mapList);
    }
  }
/**
 *
 * Retrieves the CsrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CsrObjectDataList getOutput() {
    return CsrObjectHelper.fromMapList(outputMap, "CsrList");
  }
}
