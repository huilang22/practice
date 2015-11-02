/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeCreateRequest.java
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
 * Class used to create a InvsTypeCreateRequest Udt Request
 *
 */

public class InvsTypeCreateRequest extends InvsTypeSubRequestParent {
/**
 *
 * Constructor to create a  InvsTypeCreateRequest
 * @param id Unique request name
 * @param InvsTypeCreateIn InvsTypeObjectData for InvsTypeCreateRequest
 *
 */
@JsonCreator
  public InvsTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsType")InvsTypeObjectData InvsTypeCreateIn) {
    super(id, "InvsTypeCreate");
    if (InvsTypeCreateIn != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(InvsTypeCreateIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectData that results from the InvsTypeCreateRequest call
 * @return InvsTypeObjectData resulting from udt call
 *
 */

  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
}
