/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonUpdateRequest.java
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
 * Class used to create a CitReasonUpdateRequest Udt Request
 *
 */

public class CitReasonUpdateRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a  CitReasonUpdateRequest
 * @param id Unique request name
 * @param citReasonUpdateIn CitReasonObjectData for CitReasonUpdateRequest
 *
 */
@JsonCreator
  public CitReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitReason")CitReasonObjectData citReasonUpdateIn) {
    super(id, "CitReasonUpdate");
    if (citReasonUpdateIn != null) {
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonUpdateIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }

/**
 *
 * Retrieves the CitReasonObjectData that results from the CitReasonUpdateRequest call
 * @return CitReasonObjectData resulting from udt call
 *
 */

  public CitReasonObjectData getOutput() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
