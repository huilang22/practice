/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindByServiceNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentDefFindByServiceNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentDefFindByServiceNoOpRequest extends PackageComponentDefRequest {
/**
 *
 * Constructor to create a   PackageComponentDefFindByServiceNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentDefFindByServiceNoOpRequest(String id, PCDObjectDataList noOpIn) {
    super(id, "PackageComponentDefFindByServiceNoOpRequest");
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
