/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeUpdateRequest.java
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
 * Class used to create a SpecialDestinationTypeUpdateRequest Udt Request
 *
 */

public class SpecialDestinationTypeUpdateRequest extends SpecialDestinationTypeSubRequestParent {
/**
 *
 * Constructor to create a  SpecialDestinationTypeUpdateRequest
 * @param id Unique request name
 * @param sdUpdIn SpecialDestinationTypeObjectData for SpecialDestinationTypeUpdateRequest
 *
 */
@JsonCreator
  public SpecialDestinationTypeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("SpecialDestinationType")SpecialDestinationTypeObjectData sdUpdIn) {
    super(id, "SpecialDestinationTypeUpdate");
    if (sdUpdIn != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectHelper.toMap(sdUpdIn, new HashMap(), "SpecialDestinationType").get("SpecialDestinationType"));
    }
  }

/**
 *
 * Retrieves the SpecialDestinationTypeObjectData that results from the SpecialDestinationTypeUpdateRequest call
 * @return SpecialDestinationTypeObjectData resulting from udt call
 *
 */

  public SpecialDestinationTypeObjectData getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
}
