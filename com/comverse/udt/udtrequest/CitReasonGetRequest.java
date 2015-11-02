/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonGetRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitReasonGetRequest Udt Request
 *
 */

public class CitReasonGetRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a  CitReasonGetRequest
 * @param id Unique request name
 * @param citReasonGetIn CitReasonObjectKeyData for CitReasonGetRequest
 *
 */
@JsonCreator
  public CitReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitReason")CitReasonObjectKeyData citReasonGetIn) {
    super(id, "CitReasonGet");
    if (citReasonGetIn != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(citReasonGetIn, new HashMap(), "CitReasonObjectKeyData").get("CitReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitReasonObjectData that results from the CitReasonGetRequest call
 * @return CitReasonObjectData resulting from udt call
 *
 */

  public CitReasonObjectData getOutput() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
