/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceFindNoOpRequest.java
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
 * NoOp class used to simulate a ProjectInstanceFindNoOpRequest Udt Request/Response
 *
 */
public class ProjectInstanceFindNoOpRequest extends ProjectInstanceRequest {
/**
 *
 * Constructor to create a   ProjectInstanceFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectInstanceFindNoOpRequest(String id, ProjectInstanceObjectDataList noOpIn) {
    super(id, "ProjectInstanceFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProjectInstanceObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectInstance", noOpIn);
      }
      addInput("ProjectInstance", mapList);
    }
  }
/**
 *
 * Retrieves the ProjectInstanceObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceObjectDataList getOutput() {
    return ProjectInstanceObjectHelper.fromMapList(outputMap, "ProjectInstanceList");
  }
}
