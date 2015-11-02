/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceUpdateRequest.java
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
 * Class used to create a CitImportanceUpdateRequest Udt Request
 *
 */

public class CitImportanceUpdateRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a  CitImportanceUpdateRequest
 * @param id Unique request name
 * @param citImportanceUpdateIn CitImportanceObjectData for CitImportanceUpdateRequest
 *
 */
@JsonCreator
  public CitImportanceUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitImportance")CitImportanceObjectData citImportanceUpdateIn) {
    super(id, "CitImportanceUpdate");
    if (citImportanceUpdateIn != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceUpdateIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }

/**
 *
 * Retrieves the CitImportanceObjectData that results from the CitImportanceUpdateRequest call
 * @return CitImportanceObjectData resulting from udt call
 *
 */

  public CitImportanceObjectData getOutput() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
