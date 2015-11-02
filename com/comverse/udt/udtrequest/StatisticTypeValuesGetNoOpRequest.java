/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StatisticTypeValuesGetNoOpRequest.java
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
 * NoOp class used to simulate a StatisticTypeValuesGetNoOpRequest Udt Request/Response
 *
 */
public class StatisticTypeValuesGetNoOpRequest extends StatisticTypeValuesSubRequestParent {
/**
 *
 * Constructor to create a   StatisticTypeValuesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public StatisticTypeValuesGetNoOpRequest(String id, StatisticTypeValuesObjectData noOpIn) {
    super(id, "StatisticTypeValuesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("StatisticTypeValues", StatisticTypeValuesObjectHelper.toMap(noOpIn, new HashMap(), "StatisticTypeValues").get("StatisticTypeValues"));
    }
  }
/**
 *
 * Retrieves the StatisticTypeValuesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public StatisticTypeValuesObjectData getOutput() {
    return StatisticTypeValuesObjectHelper.fromMap(outputMap, "StatisticTypeValues");
  }
}
