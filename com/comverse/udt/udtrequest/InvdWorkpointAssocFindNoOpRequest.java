/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocFindNoOpRequest.java
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
 * NoOp class used to simulate a InvdWorkpointAssocFindNoOpRequest Udt Request/Response
 *
 */
public class InvdWorkpointAssocFindNoOpRequest extends InvdWorkpointAssocRequest {
/**
 *
 * Constructor to create a   InvdWorkpointAssocFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdWorkpointAssocFindNoOpRequest(String id, InvdWorkpointAssocObjectDataList noOpIn) {
    super(id, "InvdWorkpointAssocFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = InvdWorkpointAssocObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvdWorkpointAssoc", noOpIn);
      }
      addInput("InvdWorkpointAssoc", mapList);
    }
  }
/**
 *
 * Retrieves the InvdWorkpointAssocObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public InvdWorkpointAssocObjectDataList getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMapList(outputMap, "InvdWorkpointAssocList");
  }
}
