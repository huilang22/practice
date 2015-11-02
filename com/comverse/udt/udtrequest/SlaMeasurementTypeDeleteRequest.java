/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeDeleteRequest.java
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
 * Class used to create a SlaMeasurementTypeDeleteRequest Udt Request
 *
 */

public class SlaMeasurementTypeDeleteRequest extends SlaMeasurementTypeSubRequestParent {
/**
 *
 * Constructor to create a  SlaMeasurementTypeDeleteRequest
 * @param id Unique request name
 * @param SLAMTdelete_In SlaMeasurementTypeObjectKeyData for SlaMeasurementTypeDeleteRequest
 *
 */
@JsonCreator
  public SlaMeasurementTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementType")SlaMeasurementTypeObjectKeyData SLAMTdelete_In) {
    super(id, "SlaMeasurementTypeDelete");
    if (SLAMTdelete_In != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectKeyHelper.toMap(SLAMTdelete_In, new HashMap(), "SlaMeasurementTypeObjectKeyData").get("SlaMeasurementTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementTypeObjectData that results from the SlaMeasurementTypeDeleteRequest call
 * @return SlaMeasurementTypeObjectData resulting from udt call
 *
 */

  public SlaMeasurementTypeObjectData getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
