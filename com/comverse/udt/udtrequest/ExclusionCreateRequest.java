/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionCreateRequest.java
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
 * Class used to create a ExclusionCreateRequest Udt Request
 *
 */

public class ExclusionCreateRequest extends ExclusionSubRequestParent {
/**
 *
 * Constructor to create a  ExclusionCreateRequest
 * @param id Unique request name
 * @param excCrIn ExclusionObjectData for ExclusionCreateRequest
 *
 */
@JsonCreator
  public ExclusionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Exclusion")ExclusionObjectData excCrIn) {
    super(id, "ExclusionCreate");
    if (excCrIn != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(excCrIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }

/**
 *
 * Retrieves the ExclusionObjectData that results from the ExclusionCreateRequest call
 * @return ExclusionObjectData resulting from udt call
 *
 */

  public ExclusionObjectData getOutput() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
}
