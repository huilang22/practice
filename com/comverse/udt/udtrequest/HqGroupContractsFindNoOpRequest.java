/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsFindNoOpRequest.java
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
 * NoOp class used to simulate a HqGroupContractsFindNoOpRequest Udt Request/Response
 *
 */
public class HqGroupContractsFindNoOpRequest extends HqGroupContractsRequest {
/**
 *
 * Constructor to create a   HqGroupContractsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public HqGroupContractsFindNoOpRequest(String id, HqGroupContractsObjectDataList noOpIn) {
    super(id, "HqGroupContractsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = HqGroupContractsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("HqGroupContracts", noOpIn);
      }
      addInput("HqGroupContracts", mapList);
    }
  }
/**
 *
 * Retrieves the HqGroupContractsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public HqGroupContractsObjectDataList getOutput() {
    return HqGroupContractsObjectHelper.fromMapList(outputMap, "HqGroupContractsList");
  }
}
