/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceDeleteRequest.java
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
 * Class used to create a CitImportanceDeleteRequest Udt Request
 *
 */

public class CitImportanceDeleteRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a  CitImportanceDeleteRequest
 * @param id Unique request name
 * @param citImportanceDeleteIn CitImportanceObjectKeyData for CitImportanceDeleteRequest
 *
 */
@JsonCreator
  public CitImportanceDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitImportance")CitImportanceObjectKeyData citImportanceDeleteIn) {
    super(id, "CitImportanceDelete");
    if (citImportanceDeleteIn != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(citImportanceDeleteIn, new HashMap(), "CitImportanceObjectKeyData").get("CitImportanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitImportanceObjectData that results from the CitImportanceDeleteRequest call
 * @return CitImportanceObjectData resulting from udt call
 *
 */

  public CitImportanceObjectData getOutput() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
