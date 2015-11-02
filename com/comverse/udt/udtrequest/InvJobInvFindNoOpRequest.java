/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobInvFindNoOpRequest.java
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
 * NoOp class used to simulate a InvJobInvFindNoOpRequest Udt Request/Response
 *
 */
public class InvJobInvFindNoOpRequest extends InvJobInvRequest {
/**
 *
 * Constructor to create a   InvJobInvFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvJobInvFindNoOpRequest(String id, InvJobInvObjectDataList noOpIn) {
    super(id, "InvJobInvFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvJobInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvJobInv", noOpIn);
      }
      addInput("InvJobInv", mapList);
    }
  }
/**
 *
 * Retrieves the InvJobInvObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvJobInvObjectDataList getOutput() {
    return InvJobInvObjectHelper.fromMapList(outputMap, "InvJobInvList");
  }
}
