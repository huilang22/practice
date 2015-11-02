/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationInvAssocFindNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationInvAssocFindNoOpRequest extends InvsLocationInvAssocRequest {
/**
 *
 * Constructor to create a   InvsLocationInvAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationInvAssocFindNoOpRequest(String id, InvsLocationInvAssocObjectDataList noOpIn) {
    super(id, "InvsLocationInvAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvsLocationInvAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsLocationInvAssoc", noOpIn);
      }
      addInput("InvsLocationInvAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the InvsLocationInvAssocObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationInvAssocObjectDataList getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMapList(outputMap, "InvsLocationInvAssocList");
  }
}
