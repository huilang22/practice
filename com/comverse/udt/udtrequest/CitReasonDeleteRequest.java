/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonDeleteRequest.java
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
 * Class used to create a CitReasonDeleteRequest Udt Request
 *
 */

public class CitReasonDeleteRequest extends CitReasonSubRequestParent {
/**
 *
 * Constructor to create a  CitReasonDeleteRequest
 * @param id Unique request name
 * @param citReasonDeleteIn CitReasonObjectKeyData for CitReasonDeleteRequest
 *
 */
@JsonCreator
  public CitReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitReason")CitReasonObjectKeyData citReasonDeleteIn) {
    super(id, "CitReasonDelete");
    if (citReasonDeleteIn != null) {
      addInput("CitReason", CitReasonObjectKeyHelper.toMap(citReasonDeleteIn, new HashMap(), "CitReasonObjectKeyData").get("CitReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitReasonObjectData that results from the CitReasonDeleteRequest call
 * @return CitReasonObjectData resulting from udt call
 *
 */

  public CitReasonObjectData getOutput() {
    return CitReasonObjectHelper.fromMap(outputMap, "CitReason");
  }
}
