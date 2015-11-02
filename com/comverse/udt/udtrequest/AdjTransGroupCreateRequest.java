/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdjTransGroupCreateRequest.java
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
 * Class used to create a AdjTransGroupCreateRequest Udt Request
 *
 */

public class AdjTransGroupCreateRequest extends AdjTransGroupSubRequestParent {
/**
 *
 * Constructor to create a  AdjTransGroupCreateRequest
 * @param id Unique request name
 * @param ATGCreateIn ATGObjectData for AdjTransGroupCreateRequest
 *
 */
@JsonCreator
  public AdjTransGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdjTransGroup")ATGObjectData ATGCreateIn) {
    super(id, "AdjTransGroupCreate");
    if (ATGCreateIn != null) {
      addInput("AdjTransGroup", ATGObjectHelper.toMap(ATGCreateIn, new HashMap(), "AdjTransGroup").get("AdjTransGroup"));
    }
  }

/**
 *
 * Retrieves the ATGObjectData that results from the AdjTransGroupCreateRequest call
 * @return ATGObjectData resulting from udt call
 *
 */

  public ATGObjectData getOutput() {
    return ATGObjectHelper.fromMap(outputMap, "AdjTransGroup");
  }
}
