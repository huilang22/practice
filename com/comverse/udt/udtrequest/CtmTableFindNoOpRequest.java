/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableFindNoOpRequest.java
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
 * NoOp class used to simulate a CtmTableFindNoOpRequest Udt Request/Response
 *
 */
public class CtmTableFindNoOpRequest extends CtmTableRequest {
/**
 *
 * Constructor to create a   CtmTableFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmTableFindNoOpRequest(String id, CtmTableObjectDataList noOpIn) {
    super(id, "CtmTableFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = CtmTableObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CtmTable", noOpIn);
      }
      addInput("CtmTable", mapList);
    }
  }
/**
 *
 * Retrieves the CtmTableObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public CtmTableObjectDataList getOutput() {
    return CtmTableObjectHelper.fromMapList(outputMap, "CtmTableList");
  }
}
