/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapFindNoOpRequest.java
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
 * NoOp class used to simulate a OccConeFxEntityMapFindNoOpRequest Udt Request/Response
 *
 */
public class OccConeFxEntityMapFindNoOpRequest extends OccConeFxEntityMapRequest {
/**
 *
 * Constructor to create a   OccConeFxEntityMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OccConeFxEntityMapFindNoOpRequest(String id, OCFEMObjectDataList noOpIn) {
    super(id, "OccConeFxEntityMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = OCFEMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OccConeFxEntityMap", noOpIn);
      }
      addInput("OccConeFxEntityMap", mapList);
    }
  }
/**
 *
 * Retrieves the OCFEMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public OCFEMObjectDataList getOutput() {
    return OCFEMObjectHelper.fromMapList(outputMap, "OccConeFxEntityMapList");
  }
}
