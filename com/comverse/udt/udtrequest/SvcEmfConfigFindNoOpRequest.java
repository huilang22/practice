/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcEmfConfigFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a SvcEmfConfigFindNoOpRequest Udt Request/Response
 *
 */
public class SvcEmfConfigFindNoOpRequest extends SvcEmfConfigRequest {
/**
 *
 * Constructor to create a   SvcEmfConfigFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SvcEmfConfigFindNoOpRequest(String id, SvcEmfConfigObjectDataList noOpIn) {
    super(id, "SvcEmfConfigFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcEmfConfigObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcEmfConfig", noOpIn);
      }
      addInput("SvcEmfConfig", mapList);
    }
  }
/**
 *
 * Retrieves the SvcEmfConfigObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcEmfConfigObjectDataList getOutput() {
    return SvcEmfConfigObjectHelper.fromMapList(outputMap, "SvcEmfConfigList");
  }
}
