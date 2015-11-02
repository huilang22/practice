/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdFindNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigIdFindNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigIdFindNoOpRequest extends EmfConfigIdRequest {
/**
 *
 * Constructor to create a   EmfConfigIdFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigIdFindNoOpRequest(String id, ECIObjectDataList noOpIn) {
    super(id, "EmfConfigIdFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ECIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfigId", noOpIn);
      }
      addInput("EmfConfigId", mapList);
    }
  }
/**
 *
 * Retrieves the ECIObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ECIObjectDataList getOutput() {
    return ECIObjectHelper.fromMapList(outputMap, "EmfConfigIdList");
  }
}
