/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeRefGetNoOpRequest.java
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
 * NoOp class used to simulate a StatisticTypeRefGetNoOpRequest Udt Request/Response
 *
 */
public class StatisticTypeRefGetNoOpRequest extends StatisticTypeRefSubRequestParent {
/**
 *
 * Constructor to create a   StatisticTypeRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatisticTypeRefGetNoOpRequest(String id, StatisticTypeRefObjectData noOpIn) {
    super(id, "StatisticTypeRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("StatisticTypeRef", StatisticTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "StatisticTypeRef").get("StatisticTypeRef"));
    }
  }
/**
 *
 * Retrieves the StatisticTypeRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeRefObjectData getOutput() {
    return StatisticTypeRefObjectHelper.fromMap(outputMap, "StatisticTypeRef");
  }
}
