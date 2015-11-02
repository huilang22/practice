/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiAssignFindNoOpRequest.java
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
 * NoOp class used to simulate a EpiAssignFindNoOpRequest Udt Request/Response
 *
 */
public class EpiAssignFindNoOpRequest extends EpiAssignRequest {
/**
 *
 * Constructor to create a   EpiAssignFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EpiAssignFindNoOpRequest(String id, EpiAssignObjectDataList noOpIn) {
    super(id, "EpiAssignFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EpiAssignObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EpiAssign", noOpIn);
      }
      addInput("EpiAssign", mapList);
    }
  }
/**
 *
 * Retrieves the EpiAssignObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EpiAssignObjectDataList getOutput() {
    return EpiAssignObjectHelper.fromMapList(outputMap, "EpiAssignList");
  }
}
