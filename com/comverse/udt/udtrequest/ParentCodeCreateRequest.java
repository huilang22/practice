/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeCreateRequest.java
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
 * Class used to create a ParentCodeCreateRequest Udt Request
 *
 */

public class ParentCodeCreateRequest extends ParentCodeSubRequestParent {
/**
 *
 * Constructor to create a  ParentCodeCreateRequest
 * @param id Unique request name
 * @param ParentCodeCreateIn ParentCodeObjectData for ParentCodeCreateRequest
 *
 */
@JsonCreator
  public ParentCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ParentCode")ParentCodeObjectData ParentCodeCreateIn) {
    super(id, "ParentCodeCreate");
    if (ParentCodeCreateIn != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeCreateIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }

/**
 *
 * Retrieves the ParentCodeObjectData that results from the ParentCodeCreateRequest call
 * @return ParentCodeObjectData resulting from udt call
 *
 */

  public ParentCodeObjectData getOutput() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
