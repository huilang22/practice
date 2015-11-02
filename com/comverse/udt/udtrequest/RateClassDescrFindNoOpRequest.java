/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrFindNoOpRequest.java
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
 * NoOp class used to simulate a RateClassDescrFindNoOpRequest Udt Request/Response
 *
 */
public class RateClassDescrFindNoOpRequest extends RateClassDescrRequest {
/**
 *
 * Constructor to create a   RateClassDescrFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RateClassDescrFindNoOpRequest(String id, RateClassDescrObjectDataList noOpIn) {
    super(id, "RateClassDescrFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RateClassDescrObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RateClassDescr", noOpIn);
      }
      addInput("RateClassDescr", mapList);
    }
  }
/**
 *
 * Retrieves the RateClassDescrObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RateClassDescrObjectDataList getOutput() {
    return RateClassDescrObjectHelper.fromMapList(outputMap, "RateClassDescrList");
  }
}
