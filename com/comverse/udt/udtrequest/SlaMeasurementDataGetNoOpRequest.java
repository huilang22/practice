/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataGetNoOpRequest.java
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
 * NoOp class used to simulate a SlaMeasurementDataGetNoOpRequest Udt Request/Response
 *
 */
public class SlaMeasurementDataGetNoOpRequest extends SlaMeasurementDataSubRequestParent {
/**
 *
 * Constructor to create a   SlaMeasurementDataGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SlaMeasurementDataGetNoOpRequest(String id, SlaMeasurementDataObjectData noOpIn) {
    super(id, "SlaMeasurementDataGetNoOpRequest");
    if (noOpIn != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectHelper.toMap(noOpIn, new HashMap(), "SlaMeasurementData").get("SlaMeasurementData"));
    }
  }
/**
 *
 * Retrieves the SlaMeasurementDataObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementDataObjectData getOutput() {
    return SlaMeasurementDataObjectHelper.fromMap(outputMap, "SlaMeasurementData");
  }
}
