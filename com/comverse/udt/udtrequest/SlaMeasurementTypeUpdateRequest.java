/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeUpdateRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SlaMeasurementTypeUpdateRequest Udt Request
 *
 */

public class SlaMeasurementTypeUpdateRequest extends SlaMeasurementTypeSubRequestParent {
/**
 *
 * Constructor to create a  SlaMeasurementTypeUpdateRequest
 * @param id Unique request name
 * @param SLAMTupdate_In SlaMeasurementTypeObjectData for SlaMeasurementTypeUpdateRequest
 *
 */
@JsonCreator
  public SlaMeasurementTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementType")SlaMeasurementTypeObjectData SLAMTupdate_In) {
    super(id, "SlaMeasurementTypeUpdate");
    if (SLAMTupdate_In != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTupdate_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementTypeObjectData that results from the SlaMeasurementTypeUpdateRequest call
 * @return SlaMeasurementTypeObjectData resulting from udt call
 *
 */

  public SlaMeasurementTypeObjectData getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
