/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepartmentFindNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a DepartmentFindNoOpRequest Udt Request/Response
 *
 */
public class DepartmentFindNoOpRequest extends DepartmentRequest {
/**
 *
 * Constructor to create a   DepartmentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DepartmentFindNoOpRequest(String id, DepartmentObjectDataList noOpIn) {
    super(id, "DepartmentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DepartmentObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Department", noOpIn);
      }
      addInput("Department", mapList);
    }
  }
/**
 *
 * Retrieves the DepartmentObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DepartmentObjectDataList getOutput() {
    return DepartmentObjectHelper.fromMapList(outputMap, "DepartmentList");
  }
}
