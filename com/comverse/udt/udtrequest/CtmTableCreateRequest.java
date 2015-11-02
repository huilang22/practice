/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableCreateRequest.java
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
 * Class used to create a CtmTableCreateRequest Udt Request
 *
 */

public class CtmTableCreateRequest extends CtmTableSubRequestParent {
/**
 *
 * Constructor to create a  CtmTableCreateRequest
 * @param id Unique request name
 * @param CtmTableCreateIn CtmTableObjectData for CtmTableCreateRequest
 *
 */
@JsonCreator
  public CtmTableCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmTable")CtmTableObjectData CtmTableCreateIn) {
    super(id, "CtmTableCreate");
    if (CtmTableCreateIn != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableCreateIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }

/**
 *
 * Retrieves the CtmTableObjectData that results from the CtmTableCreateRequest call
 * @return CtmTableObjectData resulting from udt call
 *
 */

  public CtmTableObjectData getOutput() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
}
