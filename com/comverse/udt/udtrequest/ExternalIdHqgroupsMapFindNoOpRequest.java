/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapFindNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExternalIdHqgroupsMapFindNoOpRequest Udt Request/Response
 *
 */
public class ExternalIdHqgroupsMapFindNoOpRequest extends ExternalIdHqGroupsMapRequest {
/**
 *
 * Constructor to create a   ExternalIdHqgroupsMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExternalIdHqgroupsMapFindNoOpRequest(String id, EIHGMObjectDataList noOpIn) {
    super(id, "ExternalIdHqgroupsMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EIHGMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdHqGroupsMap", noOpIn);
      }
      addInput("ExternalIdHqGroupsMap", mapList);
    }
  }
/**
 *
 * Retrieves the EIHGMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EIHGMObjectDataList getOutput() {
    return EIHGMObjectHelper.fromMapList(outputMap, "ExternalIdHqGroupsMapList");
  }
}
