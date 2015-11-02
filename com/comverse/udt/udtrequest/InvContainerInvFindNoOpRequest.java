/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerInvFindNoOpRequest.java
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
 * NoOp class used to simulate a InvContainerInvFindNoOpRequest Udt Request/Response
 *
 */
public class InvContainerInvFindNoOpRequest extends InvContainerInvRequest {
/**
 *
 * Constructor to create a   InvContainerInvFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvContainerInvFindNoOpRequest(String id, InvContainerInvObjectDataList noOpIn) {
    super(id, "InvContainerInvFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvContainerInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvContainerInv", noOpIn);
      }
      addInput("InvContainerInv", mapList);
    }
  }
/**
 *
 * Retrieves the InvContainerInvObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvContainerInvObjectDataList getOutput() {
    return InvContainerInvObjectHelper.fromMapList(outputMap, "InvContainerInvList");
  }
}
