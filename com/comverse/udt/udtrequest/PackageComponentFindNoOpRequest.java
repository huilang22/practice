/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentFindNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentFindNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentFindNoOpRequest extends PackageComponentRequest {
/**
 *
 * Constructor to create a   PackageComponentFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentFindNoOpRequest(String id, PCObjectDataList noOpIn) {
    super(id, "PackageComponentFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponent", noOpIn);
      }
      addInput("PackageComponent", mapList);
    }
  }
/**
 *
 * Retrieves the PCObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PCObjectDataList getOutput() {
    return PCObjectHelper.fromMapList(outputMap, "PackageComponentList");
  }
}
