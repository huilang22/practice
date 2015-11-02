/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a SlaMeasurementTypeDeleteNoOpRequest Udt Request/Response
 *
 */
public class SlaMeasurementTypeDeleteNoOpRequest extends SlaMeasurementTypeSubRequestParent {
/**
 *
 * Constructor to create a   SlaMeasurementTypeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public SlaMeasurementTypeDeleteNoOpRequest(String id, SlaMeasurementTypeObjectData noOpIn) {
    super(id, "SlaMeasurementTypeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(noOpIn, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }
/**
 *
 * Retrieves the SlaMeasurementTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public SlaMeasurementTypeObjectData getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
