/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServPackageTypeFindNoOpRequest.java
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
import com.csgsystems.svbl.data.*;

/**
 *
 * NoOp class used to simulate a ServPackageTypeFindNoOpRequest Udt Request/Response
 *
 */
public class ServPackageTypeFindNoOpRequest extends ServPackageTypeRequest {
/**
 *
 * Constructor to create a   ServPackageTypeFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ServPackageTypeFindNoOpRequest(String id, PDObjectDataList noOpIn) {
    super(id, "ServPackageTypeFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = PDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PackageDefinition", noOpIn);
      }
      addInput("PackageDefinition", mapList);
    }
  }
/**
 *
 * Retrieves the PDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}
