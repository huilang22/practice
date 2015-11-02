/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrSymbolFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrSymbolFindNoOpRequest Udt Request/Response
 *
 */
public class RbrSymbolFindNoOpRequest extends RbrSymbolRequest {
/**
 *
 * Constructor to create a   RbrSymbolFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrSymbolFindNoOpRequest(String id, RbrSymbolObjectDataList noOpIn) {
    super(id, "RbrSymbolFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrSymbolObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrSymbol", noOpIn);
      }
      addInput("RbrSymbol", mapList);
    }
  }
/**
 *
 * Retrieves the RbrSymbolObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrSymbolObjectDataList getOutput() {
    return RbrSymbolObjectHelper.fromMapList(outputMap, "RbrSymbolList");
  }
}
