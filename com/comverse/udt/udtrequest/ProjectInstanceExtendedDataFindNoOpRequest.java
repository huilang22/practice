/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProjectInstanceExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a ProjectInstanceExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class ProjectInstanceExtendedDataFindNoOpRequest extends ProjectInstanceRequest {
/**
 *
 * Constructor to create a   ProjectInstanceExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProjectInstanceExtendedDataFindNoOpRequest(String id, ProjectInstanceEDObjectDataList noOpIn) {
    super(id, "ProjectInstanceExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = ProjectInstanceEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProjectInstanceExtendedData", noOpIn);
      }
      addInput("ProjectInstanceExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the ProjectInstanceEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public ProjectInstanceEDObjectDataList getOutput() {
    return ProjectInstanceEDObjectHelper.fromMapList(outputMap, "ProjectInstanceExtendedDataList");
  }
}
