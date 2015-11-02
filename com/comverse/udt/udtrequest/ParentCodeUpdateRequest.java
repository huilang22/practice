/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeUpdateRequest.java
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
 * Class used to create a ParentCodeUpdateRequest Udt Request
 *
 */

public class ParentCodeUpdateRequest extends ParentCodeSubRequestParent {
/**
 *
 * Constructor to create a  ParentCodeUpdateRequest
 * @param id Unique request name
 * @param ParentCodeUpdateIn ParentCodeObjectData for ParentCodeUpdateRequest
 *
 */
@JsonCreator
  public ParentCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ParentCode")ParentCodeObjectData ParentCodeUpdateIn) {
    super(id, "ParentCodeUpdate");
    if (ParentCodeUpdateIn != null) {
      addInput("ParentCode", ParentCodeObjectHelper.toMap(ParentCodeUpdateIn, new HashMap(), "ParentCode").get("ParentCode"));
    }
  }

/**
 *
 * Retrieves the ParentCodeObjectData that results from the ParentCodeUpdateRequest call
 * @return ParentCodeObjectData resulting from udt call
 *
 */

  public ParentCodeObjectData getOutput() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
