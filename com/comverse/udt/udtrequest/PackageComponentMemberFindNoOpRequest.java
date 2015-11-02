/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberFindNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentMemberFindNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentMemberFindNoOpRequest extends PackageComponentMemberRequest {
/**
 *
 * Constructor to create a   PackageComponentMemberFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentMemberFindNoOpRequest(String id, PCMObjectDataList noOpIn) {
    super(id, "PackageComponentMemberFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PCMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentMember", noOpIn);
      }
      addInput("PackageComponentMember", mapList);
    }
  }
/**
 *
 * Retrieves the PCMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PCMObjectDataList getOutput() {
    return PCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
}
