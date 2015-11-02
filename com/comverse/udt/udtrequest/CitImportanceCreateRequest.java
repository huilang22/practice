/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceCreateRequest.java
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
 * Class used to create a CitImportanceCreateRequest Udt Request
 *
 */

public class CitImportanceCreateRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a  CitImportanceCreateRequest
 * @param id Unique request name
 * @param citImportanceCreateIn CitImportanceObjectData for CitImportanceCreateRequest
 *
 */
@JsonCreator
  public CitImportanceCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitImportance")CitImportanceObjectData citImportanceCreateIn) {
    super(id, "CitImportanceCreate");
    if (citImportanceCreateIn != null) {
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceCreateIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }

/**
 *
 * Retrieves the CitImportanceObjectData that results from the CitImportanceCreateRequest call
 * @return CitImportanceObjectData resulting from udt call
 *
 */

  public CitImportanceObjectData getOutput() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
