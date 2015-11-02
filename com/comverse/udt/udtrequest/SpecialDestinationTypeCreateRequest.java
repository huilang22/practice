/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeCreateRequest.java
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
 * Class used to create a SpecialDestinationTypeCreateRequest Udt Request
 *
 */

public class SpecialDestinationTypeCreateRequest extends SpecialDestinationTypeSubRequestParent {
/**
 *
 * Constructor to create a  SpecialDestinationTypeCreateRequest
 * @param id Unique request name
 * @param sdCrIn SpecialDestinationTypeObjectData for SpecialDestinationTypeCreateRequest
 *
 */
@JsonCreator
  public SpecialDestinationTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SpecialDestinationType")SpecialDestinationTypeObjectData sdCrIn) {
    super(id, "SpecialDestinationTypeCreate");
    if (sdCrIn != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdCrIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }

/**
 *
 * Retrieves the SpecialDestinationTypeObjectData that results from the SpecialDestinationTypeCreateRequest call
 * @return SpecialDestinationTypeObjectData resulting from udt call
 *
 */

  public SpecialDestinationTypeObjectData getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
}
