/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeGetRequest.java
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
 * Class used to create a SpecialDestinationTypeGetRequest Udt Request
 *
 */

public class SpecialDestinationTypeGetRequest extends SpecialDestinationTypeSubRequestParent {
/**
 *
 * Constructor to create a  SpecialDestinationTypeGetRequest
 * @param id Unique request name
 * @param sdGetIn SpecialDestinationTypeObjectKeyData for SpecialDestinationTypeGetRequest
 *
 */
@JsonCreator
  public SpecialDestinationTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("SpecialDestinationType")SpecialDestinationTypeObjectKeyData sdGetIn) {
    super(id, "SpecialDestinationTypeGet");
    if (sdGetIn != null) {
      addInput("SpecialDestinationType", SpecialDestinationTypeObjectKeyHelper.toMap(sdGetIn, new HashMap(), "SpecialDestinationTypeObjectKeyData").get("SpecialDestinationTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SpecialDestinationTypeObjectData that results from the SpecialDestinationTypeGetRequest call
 * @return SpecialDestinationTypeObjectData resulting from udt call
 *
 */

  public SpecialDestinationTypeObjectData getOutput() {
    return SpecialDestinationTypeObjectHelper.fromMap(outputMap, "SpecialDestinationType");
  }
}
