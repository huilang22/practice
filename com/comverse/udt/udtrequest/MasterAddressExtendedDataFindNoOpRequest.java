/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressExtendedDataFindNoOpRequest.java
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
 * NoOp class used to simulate a MasterAddressExtendedDataFindNoOpRequest Udt Request/Response
 *
 */
public class MasterAddressExtendedDataFindNoOpRequest extends MasterAddressRequest {
/**
 *
 * Constructor to create a   MasterAddressExtendedDataFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MasterAddressExtendedDataFindNoOpRequest(String id, MasterAddressEDObjectDataList noOpIn) {
    super(id, "MasterAddressExtendedDataFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MasterAddressEDObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MasterAddressExtendedData", noOpIn);
      }
      addInput("MasterAddressExtendedData", mapList);
    }
  }
/**
 *
 * Retrieves the MasterAddressEDObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressEDObjectDataList getOutput() {
    return MasterAddressEDObjectHelper.fromMapList(outputMap, "MasterAddressExtendedDataList");
  }
}
