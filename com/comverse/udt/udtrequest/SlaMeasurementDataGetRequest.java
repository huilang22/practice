/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementDataGetRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SlaMeasurementDataGetRequest Udt Request
 *
 */

public class SlaMeasurementDataGetRequest extends SlaMeasurementDataSubRequestParent {
/**
 *
 * Constructor to create a  SlaMeasurementDataGetRequest
 * @param id Unique request name
 * @param SlaMeasurementDataGetIn SlaMeasurementDataObjectKeyData for SlaMeasurementDataGetRequest
 *
 */
@JsonCreator
  public SlaMeasurementDataGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementData")SlaMeasurementDataObjectKeyData SlaMeasurementDataGetIn) {
    super(id, "SlaMeasurementDataGet");
    if (SlaMeasurementDataGetIn != null) {
      addInput("SlaMeasurementData", SlaMeasurementDataObjectKeyHelper.toMap(SlaMeasurementDataGetIn, new HashMap(), "SlaMeasurementDataObjectKeyData").get("SlaMeasurementDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementDataObjectData that results from the SlaMeasurementDataGetRequest call
 * @return SlaMeasurementDataObjectData resulting from udt call
 *
 */

  public SlaMeasurementDataObjectData getOutput() {
    return SlaMeasurementDataObjectHelper.fromMap(outputMap, "SlaMeasurementData");
  }
}
