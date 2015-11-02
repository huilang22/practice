/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcCmfPackageFindNoOpRequest.java
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
 * NoOp class used to simulate a SvcCmfPackageFindNoOpRequest Udt Request/Response
 *
 */
public class SvcCmfPackageFindNoOpRequest extends SvcCmfPackageRequest {
/**
 *
 * Constructor to create a   SvcCmfPackageFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SvcCmfPackageFindNoOpRequest(String id, SvcCmfPackageObjectDataList noOpIn) {
    super(id, "SvcCmfPackageFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = SvcCmfPackageObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SvcCmfPackage", noOpIn);
      }
      addInput("SvcCmfPackage", mapList);
    }
  }
/**
 *
 * Retrieves the SvcCmfPackageObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public SvcCmfPackageObjectDataList getOutput() {
    return SvcCmfPackageObjectHelper.fromMapList(outputMap, "SvcCmfPackageList");
  }
}
