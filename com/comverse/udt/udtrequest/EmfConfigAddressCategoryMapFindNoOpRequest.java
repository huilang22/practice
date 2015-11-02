/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapFindNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigAddressCategoryMapFindNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigAddressCategoryMapFindNoOpRequest extends EmfConfigAddressCategoryMapRequest {
/**
 *
 * Constructor to create a   EmfConfigAddressCategoryMapFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigAddressCategoryMapFindNoOpRequest(String id, EmfConfigAddressCategoryMapObjectDataList noOpIn) {
    super(id, "EmfConfigAddressCategoryMapFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = EmfConfigAddressCategoryMapObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("EmfConfigAddressCategoryMap", noOpIn);
      }
      addInput("EmfConfigAddressCategoryMap", mapList);
    }
  }
/**
 *
 * Retrieves the EmfConfigAddressCategoryMapObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigAddressCategoryMapObjectDataList getOutput() {
    return EmfConfigAddressCategoryMapObjectHelper.fromMapList(outputMap, "EmfConfigAddressCategoryMapList");
  }
}
