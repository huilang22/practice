/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentDefFindNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentDefFindNoOpRequest extends PackageComponentDefRequest {
/**
 *
 * Constructor to create a   PackageComponentDefFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentDefFindNoOpRequest(String id, PCDObjectDataList noOpIn) {
    super(id, "PackageComponentDefFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PCDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentDef", noOpIn);
      }
      addInput("PackageComponentDef", mapList);
    }
  }
/**
 *
 * Retrieves the PCDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PCDObjectDataList getOutput() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
}
