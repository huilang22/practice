/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeGetRequest.java
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
 * Class used to create a SlaMeasurementTypeGetRequest Udt Request
 *
 */

public class SlaMeasurementTypeGetRequest extends SlaMeasurementTypeSubRequestParent {
/**
 *
 * Constructor to create a  SlaMeasurementTypeGetRequest
 * @param id Unique request name
 * @param SLAMTget_In SlaMeasurementTypeObjectKeyData for SlaMeasurementTypeGetRequest
 *
 */
@JsonCreator
  public SlaMeasurementTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementType")SlaMeasurementTypeObjectKeyData SLAMTget_In) {
    super(id, "SlaMeasurementTypeGet");
    if (SLAMTget_In != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(SLAMTget_In, new HashMap(), "SlaMeasurementTypeObjectKeyData").get("SlaMeasurementTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementTypeObjectData that results from the SlaMeasurementTypeGetRequest call
 * @return SlaMeasurementTypeObjectData resulting from udt call
 *
 */

  public SlaMeasurementTypeObjectData getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
