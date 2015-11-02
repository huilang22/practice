/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentMemberFindPCNoOpRequest.java
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
 * NoOp class used to simulate a PackageComponentMemberFindPCNoOpRequest Udt Request/Response
 *
 */
public class PackageComponentMemberFindPCNoOpRequest extends PackageComponentMemberRequest {
/**
 *
 * Constructor to create a   PackageComponentMemberFindPCNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageComponentMemberFindPCNoOpRequest(String id, PCPCMObjectDataList noOpIn) {
    super(id, "PackageComponentMemberFindPCNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PCPCMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageComponentMember", noOpIn);
      }
      addInput("PackageComponentMember", mapList);
    }
  }
/**
 *
 * Retrieves the PCPCMObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PCPCMObjectDataList getOutput() {
    return PCPCMObjectHelper.fromMapList(outputMap, "PackageComponentMemberList");
  }
}
