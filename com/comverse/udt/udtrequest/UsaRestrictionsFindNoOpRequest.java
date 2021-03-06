/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsFindNoOpRequest.java
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
 * NoOp class used to simulate a UsaRestrictionsFindNoOpRequest Udt Request/Response
 *
 */
public class UsaRestrictionsFindNoOpRequest extends UsaRestrictionsRequest {
/**
 *
 * Constructor to create a   UsaRestrictionsFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UsaRestrictionsFindNoOpRequest(String id, UsaRestrictionsObjectDataList noOpIn) {
    super(id, "UsaRestrictionsFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = UsaRestrictionsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsaRestrictions", noOpIn);
      }
      addInput("UsaRestrictions", mapList);
    }
  }
/**
 *
 * Retrieves the UsaRestrictionsObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public UsaRestrictionsObjectDataList getOutput() {
    return UsaRestrictionsObjectHelper.fromMapList(outputMap, "UsaRestrictionsList");
  }
}
