/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByComponentAccountNoOpRequest.java
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
 * NoOp class used to simulate a PackageDefinitionFindByComponentAccountNoOpRequest Udt Request/Response
 *
 */
public class PackageDefinitionFindByComponentAccountNoOpRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a   PackageDefinitionFindByComponentAccountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PackageDefinitionFindByComponentAccountNoOpRequest(String id, PDObjectDataList noOpIn) {
    super(id, "PackageDefinitionFindByComponentAccountNoOpRequest");
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
