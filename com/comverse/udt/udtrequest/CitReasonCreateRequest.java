/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonCreateRequest.java
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
 * Class used to create a CitReasonCreateRequest Udt Request
 *
 */

public class CitReasonCreateRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a  CitReasonCreateRequest
 * @param id Unique request name
 * @param citReasonCreateIn CitReasonObjectData for CitReasonCreateRequest
 *
 */
@JsonCreator
  public CitReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitReason")CitReasonObjectData citReasonCreateIn) {
    super(id, "CitReasonCreate");
    if (citReasonCreateIn != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonCreateIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }

/**
 *
 * Retrieves the CitReasonObjectData that results from the CitReasonCreateRequest call
 * @return CitReasonObjectData resulting from udt call
 *
 */

  public CitReasonObjectData getOutput() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
