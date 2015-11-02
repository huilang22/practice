/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmTableUpdateRequest.java
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
 * Class used to create a CtmTableUpdateRequest Udt Request
 *
 */

public class CtmTableUpdateRequest extends CtmTableSubRequestParent {
/**
 *
 * Constructor to create a  CtmTableUpdateRequest
 * @param id Unique request name
 * @param CtmTableUpdateIn CtmTableObjectData for CtmTableUpdateRequest
 *
 */
@JsonCreator
  public CtmTableUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtmTable")CtmTableObjectData CtmTableUpdateIn) {
    super(id, "CtmTableUpdate");
    if (CtmTableUpdateIn != null) {
      addInput("CtmTable", CtmTableObjectHelper.toMap(CtmTableUpdateIn, new HashMap(), "CtmTable").get("CtmTable"));
    }
  }

/**
 *
 * Retrieves the CtmTableObjectData that results from the CtmTableUpdateRequest call
 * @return CtmTableObjectData resulting from udt call
 *
 */

  public CtmTableObjectData getOutput() {
    return CtmTableObjectHelper.fromMap(outputMap, "CtmTable");
  }
}
