/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberDeleteRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a MIHSubscriberDeleteRequest Udt Request
 *
 */

public class MIHSubscriberDeleteRequest extends MIHSubscriberRequest {
/**
 *
 * Constructor to create a  MIHSubscriberDeleteRequest
 * @param id Unique request name
 * @param __msisdn String for MIHSubscriberDeleteRequest
 *
 */
@JsonCreator
  public MIHSubscriberDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Msisdn")String __msisdn) {
    super(id, "MIHSubscriberDelete");
    if (__msisdn != null) {
      addInput("Msisdn", __msisdn);
    }
  }

/**
 *
 * Retrieves the Integer that results from the MIHSubscriberDeleteRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("Output");
  }
}
