/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionGetRequest.java
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
 * Class used to create a ExclusionGetRequest Udt Request
 *
 */

public class ExclusionGetRequest extends ExclusionSubRequestParent {
/**
 *
 * Constructor to create a  ExclusionGetRequest
 * @param id Unique request name
 * @param excGetIn ExclusionObjectKeyData for ExclusionGetRequest
 *
 */
@JsonCreator
  public ExclusionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Exclusion")ExclusionObjectKeyData excGetIn) {
    super(id, "ExclusionGet");
    if (excGetIn != null) {
      addInput("Exclusion", ExclusionObjectKeyHelper.toMap(excGetIn, new HashMap(), "ExclusionObjectKeyData").get("ExclusionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ExclusionObjectData that results from the ExclusionGetRequest call
 * @return ExclusionObjectData resulting from udt call
 *
 */

  public ExclusionObjectData getOutput() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
}
