/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CmfPackageOverridesFindNoOpRequest.java
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
 * NoOp class used to simulate a CmfPackageOverridesFindNoOpRequest Udt Request/Response
 *
 */
public class CmfPackageOverridesFindNoOpRequest extends CmfPackageOverridesRequest {
/**
 *
 * Constructor to create a   CmfPackageOverridesFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CmfPackageOverridesFindNoOpRequest(String id, PackageOverridesObjectDataList noOpIn) {
    super(id, "CmfPackageOverridesFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PackageOverridesObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CmfPackageOverrides", noOpIn);
      }
      addInput("CmfPackageOverrides", mapList);
    }
  }
/**
 *
 * Retrieves the PackageOverridesObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PackageOverridesObjectDataList getOutput() {
    return PackageOverridesObjectHelper.fromMapList(outputMap, "CmfPackageOverridesList");
  }
}
