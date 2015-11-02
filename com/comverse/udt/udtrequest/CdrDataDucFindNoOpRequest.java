/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CdrDataDucFindNoOpRequest.java
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
 * NoOp class used to simulate a CdrDataDucFindNoOpRequest Udt Request/Response
 *
 */
public class CdrDataDucFindNoOpRequest extends CdrDataDucRequest {
/**
 *
 * Constructor to create a   CdrDataDucFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CdrDataDucFindNoOpRequest(String id, CdrDataDucObjectDataList noOpIn) {
    super(id, "CdrDataDucFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CdrDataDucObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CdrDataDuc", noOpIn);
      }
      addInput("CdrDataDuc", mapList);
    }
  }
/**
 *
 * Retrieves the CdrDataDucObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CdrDataDucObjectDataList getOutput() {
    return CdrDataDucObjectHelper.fromMapList(outputMap, "CdrDataDucList");
  }
}
