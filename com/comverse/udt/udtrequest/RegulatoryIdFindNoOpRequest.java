/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RegulatoryIdFindNoOpRequest.java
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
 * NoOp class used to simulate a RegulatoryIdFindNoOpRequest Udt Request/Response
 *
 */
public class RegulatoryIdFindNoOpRequest extends RegulatoryIdRequest {
/**
 *
 * Constructor to create a   RegulatoryIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RegulatoryIdFindNoOpRequest(String id, RegulatoryIdObjectDataList noOpIn) {
    super(id, "RegulatoryIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RegulatoryIdObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RegulatoryId", noOpIn);
      }
      addInput("RegulatoryId", mapList);
    }
  }
/**
 *
 * Retrieves the RegulatoryIdObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RegulatoryIdObjectDataList getOutput() {
    return RegulatoryIdObjectHelper.fromMapList(outputMap, "RegulatoryIdList");
  }
}
