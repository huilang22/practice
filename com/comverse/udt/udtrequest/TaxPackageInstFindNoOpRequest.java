/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TaxPackageInstFindNoOpRequest.java
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
 * NoOp class used to simulate a TaxPackageInstFindNoOpRequest Udt Request/Response
 *
 */
public class TaxPackageInstFindNoOpRequest extends TaxPackageInstRequest {
/**
 *
 * Constructor to create a   TaxPackageInstFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TaxPackageInstFindNoOpRequest(String id, TPIObjectDataList noOpIn) {
    super(id, "TaxPackageInstFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = TPIObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("TaxPackageInst", noOpIn);
      }
      addInput("TaxPackageInst", mapList);
    }
  }
/**
 *
 * Retrieves the TPIObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public TPIObjectDataList getOutput() {
    return TPIObjectHelper.fromMapList(outputMap, "TaxPackageInstList");
  }
}
