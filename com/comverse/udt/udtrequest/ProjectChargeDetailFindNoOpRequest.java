/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectChargeDetailFindNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ProjectChargeDetailFindNoOpRequest Udt Request/Response
 *
 */
public class ProjectChargeDetailFindNoOpRequest extends ProjectChargeDetailRequest {
/**
 *
 * Constructor to create a   ProjectChargeDetailFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectChargeDetailFindNoOpRequest(String id, ProjectChargeDetailObjectDataList noOpIn) {
    super(id, "ProjectChargeDetailFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProjectChargeDetailObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectChargeDetail", noOpIn);
      }
      addInput("ProjectChargeDetail", mapList);
    }
  }
/**
 *
 * Retrieves the ProjectChargeDetailObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectChargeDetailObjectDataList getOutput() {
    return ProjectChargeDetailObjectHelper.fromMapList(outputMap, "ProjectChargeDetailList");
  }
}
