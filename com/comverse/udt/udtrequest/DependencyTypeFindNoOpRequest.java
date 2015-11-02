/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyTypeFindNoOpRequest.java
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
 * NoOp class used to simulate a DependencyTypeFindNoOpRequest Udt Request/Response
 *
 */
public class DependencyTypeFindNoOpRequest extends DependencyTypeRequest {
/**
 *
 * Constructor to create a   DependencyTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public DependencyTypeFindNoOpRequest(String id, DependencyTypeObjectDataList noOpIn) {
    super(id, "DependencyTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = DependencyTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("DependencyType", noOpIn);
      }
      addInput("DependencyType", mapList);
    }
  }
/**
 *
 * Retrieves the DependencyTypeObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public DependencyTypeObjectDataList getOutput() {
    return DependencyTypeObjectHelper.fromMapList(outputMap, "DependencyTypeList");
  }
}
