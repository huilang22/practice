/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsFindNoOpRequest.java
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
 * NoOp class used to simulate a VoucherDefinitionsFindNoOpRequest Udt Request/Response
 *
 */
public class VoucherDefinitionsFindNoOpRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a   VoucherDefinitionsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public VoucherDefinitionsFindNoOpRequest(String id, VoucherDefinitionsObjectDataList noOpIn) {
    super(id, "VoucherDefinitionsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = VoucherDefinitionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("VoucherDefinitions", noOpIn);
      }
      addInput("VoucherDefinitions", mapList);
    }
  }
/**
 *
 * Retrieves the VoucherDefinitionsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public VoucherDefinitionsObjectDataList getOutput() {
    return VoucherDefinitionsObjectHelper.fromMapList(outputMap, "VoucherDefinitionsList");
  }
}
