/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionUpdateRequest.java
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
 * Class used to create a ExclusionUpdateRequest Udt Request
 *
 */

public class ExclusionUpdateRequest extends ExclusionSubRequestParent {
/**
 *
 * Constructor to create a  ExclusionUpdateRequest
 * @param id Unique request name
 * @param excUpdIn ExclusionObjectData for ExclusionUpdateRequest
 *
 */
@JsonCreator
  public ExclusionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Exclusion")ExclusionObjectData excUpdIn) {
    super(id, "ExclusionUpdate");
    if (excUpdIn != null) {
      addInput("Exclusion", ExclusionObjectHelper.toMap(excUpdIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }

/**
 *
 * Retrieves the ExclusionObjectData that results from the ExclusionUpdateRequest call
 * @return ExclusionObjectData resulting from udt call
 *
 */

  public ExclusionObjectData getOutput() {
    return ExclusionObjectHelper.fromMap(outputMap, "Exclusion");
  }
}
