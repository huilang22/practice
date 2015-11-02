/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SlaMeasurementTypeCreateRequest.java
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
 * Class used to create a SlaMeasurementTypeCreateRequest Udt Request
 *
 */

public class SlaMeasurementTypeCreateRequest extends SlaMeasurementTypeSubRequestParent {
/**
 *
 * Constructor to create a  SlaMeasurementTypeCreateRequest
 * @param id Unique request name
 * @param SLAMTcreate_In SlaMeasurementTypeObjectData for SlaMeasurementTypeCreateRequest
 *
 */
@JsonCreator
  public SlaMeasurementTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SlaMeasurementType")SlaMeasurementTypeObjectData SLAMTcreate_In) {
    super(id, "SlaMeasurementTypeCreate");
    if (SLAMTcreate_In != null) {
      addInput("SlaMeasurementType", SlaMeasurementTypeObjectHelper.toMap(SLAMTcreate_In, new HashMap(), "SlaMeasurementType").get("SlaMeasurementType"));
    }
  }

/**
 *
 * Retrieves the SlaMeasurementTypeObjectData that results from the SlaMeasurementTypeCreateRequest call
 * @return SlaMeasurementTypeObjectData resulting from udt call
 *
 */

  public SlaMeasurementTypeObjectData getOutput() {
    return SlaMeasurementTypeObjectHelper.fromMap(outputMap, "SlaMeasurementType");
  }
}
