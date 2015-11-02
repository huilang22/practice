/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MIHSubscriberGetRequest.java
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
 * Class used to create a MIHSubscriberGetRequest Udt Request
 *
 */

public class MIHSubscriberGetRequest extends MIHSubscriberSubRequestParent {
/**
 *
 * Constructor to create a  MIHSubscriberGetRequest
 * @param id Unique request name
 * @param _msisdn String for MIHSubscriberGetRequest
 *
 */
@JsonCreator
  public MIHSubscriberGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Msisdn")String _msisdn) {
    super(id, "MIHSubscriberGet");
    if (_msisdn != null) {
      addInput("Msisdn", _msisdn);
    }
  }

/**
 *
 * Retrieves the MIHSubscriberGetOutputData that results from the MIHSubscriberGetRequest call
 * @return MIHSubscriberGetOutputData resulting from udt call
 *
 */

  public MIHSubscriberGetOutputData getOutput() {
    return MIHSubscriberGetOutputHelper.fromMap(outputMap);
  }
}
