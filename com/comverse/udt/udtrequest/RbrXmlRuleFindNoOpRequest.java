/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrXmlRuleFindNoOpRequest.java
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
 * NoOp class used to simulate a RbrXmlRuleFindNoOpRequest Udt Request/Response
 *
 */
public class RbrXmlRuleFindNoOpRequest extends RbrXmlRuleRequest {
/**
 *
 * Constructor to create a   RbrXmlRuleFindNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrXmlRuleFindNoOpRequest(String id, RbrXmlRuleObjectDataList noOpIn) {
    super(id, "RbrXmlRuleFindNoOpRequest");
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
        mapArray[i] = RbrXmlRuleObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("RbrXmlRule", noOpIn);
      }
      addInput("RbrXmlRule", mapList);
    }
  }
/**
 *
 * Retrieves the RbrXmlRuleObjectDataList passed into the constructor
 * @return Simulated response
 *
 */
  public RbrXmlRuleObjectDataList getOutput() {
    return RbrXmlRuleObjectHelper.fromMapList(outputMap, "RbrXmlRuleList");
  }
}
