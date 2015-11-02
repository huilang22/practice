/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MasterAddressFindNoOpRequest.java
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
 * NoOp class used to simulate a MasterAddressFindNoOpRequest Udt Request/Response
 *
 */
public class MasterAddressFindNoOpRequest extends MasterAddressRequest {
/**
 *
 * Constructor to create a   MasterAddressFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MasterAddressFindNoOpRequest(String id, MasterAddressObjectDataList noOpIn) {
    super(id, "MasterAddressFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = MasterAddressObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MasterAddress", noOpIn);
      }
      addInput("MasterAddress", mapList);
    }
  }
/**
 *
 * Retrieves the MasterAddressObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public MasterAddressObjectDataList getOutput() {
    return MasterAddressObjectHelper.fromMapList(outputMap, "MasterAddressList");
  }
}
