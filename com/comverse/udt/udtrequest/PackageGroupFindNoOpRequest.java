/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageGroupFindNoOpRequest.java
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
 * NoOp class used to simulate a PackageGroupFindNoOpRequest Udt Request/Response
 *
 */
public class PackageGroupFindNoOpRequest extends PackageGroupRequest {
/**
 *
 * Constructor to create a   PackageGroupFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageGroupFindNoOpRequest(String id, PGObjectDataList noOpIn) {
    super(id, "PackageGroupFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PGObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageGroup", noOpIn);
      }
      addInput("PackageGroup", mapList);
    }
  }
/**
 *
 * Retrieves the PGObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PGObjectDataList getOutput() {
    return PGObjectHelper.fromMapList(outputMap, "PackageGroupList");
  }
}
