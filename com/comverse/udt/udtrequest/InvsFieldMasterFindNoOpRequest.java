/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterFindNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsFieldMasterFindNoOpRequest Udt Request/Response
 *
 */
public class InvsFieldMasterFindNoOpRequest extends InvsFieldMasterRequest {
/**
 *
 * Constructor to create a   InvsFieldMasterFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsFieldMasterFindNoOpRequest(String id, InvsFieldMasterObjectDataList noOpIn) {
    super(id, "InvsFieldMasterFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsFieldMasterObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsFieldMaster", noOpIn);
      }
      addInput("InvsFieldMaster", mapList);
    }
  }
/**
 *
 * Retrieves the InvsFieldMasterObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsFieldMasterObjectDataList getOutput() {
    return InvsFieldMasterObjectHelper.fromMapList(outputMap, "InvsFieldMasterList");
  }
}
