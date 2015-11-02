/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceGetRequest.java
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
 * Class used to create a CitImportanceGetRequest Udt Request
 *
 */

public class CitImportanceGetRequest extends CitImportanceSubRequestParent {
/**
 *
 * Constructor to create a  CitImportanceGetRequest
 * @param id Unique request name
 * @param citImportanceGetIn CitImportanceObjectKeyData for CitImportanceGetRequest
 *
 */
@JsonCreator
  public CitImportanceGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitImportance")CitImportanceObjectKeyData citImportanceGetIn) {
    super(id, "CitImportanceGet");
    if (citImportanceGetIn != null) {
      addInput("CitImportance", CitImportanceObjectKeyHelper.toMap(citImportanceGetIn, new HashMap(), "CitImportanceObjectKeyData").get("CitImportanceObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CitImportanceObjectData that results from the CitImportanceGetRequest call
 * @return CitImportanceObjectData resulting from udt call
 *
 */

  public CitImportanceObjectData getOutput() {
    return CitImportanceObjectHelper.fromMap(outputMap, "CitImportance");
  }
}
