/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityFindNoOpRequest.java
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
 * NoOp class used to simulate a InvSecurityFindNoOpRequest Udt Request/Response
 *
 */
public class InvSecurityFindNoOpRequest extends InvSecurityRequest {
/**
 *
 * Constructor to create a   InvSecurityFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSecurityFindNoOpRequest(String id, InvSecurityObjectDataList noOpIn) {
    super(id, "InvSecurityFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvSecurityObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvSecurity", noOpIn);
      }
      addInput("InvSecurity", mapList);
    }
  }
/**
 *
 * Retrieves the InvSecurityObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvSecurityObjectDataList getOutput() {
    return InvSecurityObjectHelper.fromMapList(outputMap, "InvSecurityList");
  }
}
