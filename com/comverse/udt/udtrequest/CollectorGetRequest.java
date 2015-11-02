/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorGetRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CollectorGetRequest Udt Request
 *
 */

public class CollectorGetRequest extends CollectorSubRequestParent {
/**
 *
 * Constructor to create a  CollectorGetRequest
 * @param id Unique request name
 * @param getIn CollectorObjectKeyData for CollectorGetRequest
 *
 */
@JsonCreator
  public CollectorGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Collector")CollectorObjectKeyData getIn) {
    super(id, "CollectorGet");
    if (getIn != null) {
      addInput("Collector", CollectorObjectKeyHelper.toMap(getIn, new HashMap(), "CollectorObjectKeyData").get("CollectorObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CollectorObjectData that results from the CollectorGetRequest call
 * @return CollectorObjectData resulting from udt call
 *
 */

  public CollectorObjectData getOutput() {
    return CollectorObjectHelper.fromMap(outputMap, "Collector");
  }
}
