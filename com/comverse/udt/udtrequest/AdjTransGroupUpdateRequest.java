/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupUpdateRequest.java
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
 * Class used to create a AdjTransGroupUpdateRequest Udt Request
 *
 */

public class AdjTransGroupUpdateRequest extends AdjTransGroupSubRequestParent {
/**
 *
 * Constructor to create a  AdjTransGroupUpdateRequest
 * @param id Unique request name
 * @param ADGUpdateIn ATGObjectData for AdjTransGroupUpdateRequest
 *
 */
@JsonCreator
  public AdjTransGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjTransGroup")ATGObjectData ADGUpdateIn) {
    super(id, "AdjTransGroupUpdate");
    if (ADGUpdateIn != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ADGUpdateIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }

/**
 *
 * Retrieves the ATGObjectData that results from the AdjTransGroupUpdateRequest call
 * @return ATGObjectData resulting from udt call
 *
 */

  public ATGObjectData getOutput() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
