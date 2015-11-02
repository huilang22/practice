/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrProcedureCreateRequest.java
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
 * Class used to create a RbrProcedureCreateRequest Udt Request
 *
 */

public class RbrProcedureCreateRequest extends RbrProcedureSubRequestParent {
/**
 *
 * Constructor to create a  RbrProcedureCreateRequest
 * @param id Unique request name
 * @param RbrProcCreateIn RbrProcObjectData for RbrProcedureCreateRequest
 *
 */
@JsonCreator
  public RbrProcedureCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrProcedure")RbrProcObjectData RbrProcCreateIn) {
    super(id, "RbrProcedureCreate");
    if (RbrProcCreateIn != null) {
      addInput("RbrProcedure", RbrProcObjectHelper.toMap(RbrProcCreateIn, new HashMap(), "RbrProcedure").get("RbrProcedure"));
    }
  }

/**
 *
 * Retrieves the RbrProcObjectData that results from the RbrProcedureCreateRequest call
 * @return RbrProcObjectData resulting from udt call
 *
 */

  public RbrProcObjectData getOutput() {
    return RbrProcObjectHelper.fromMap(outputMap, "RbrProcedure");
  }
}
