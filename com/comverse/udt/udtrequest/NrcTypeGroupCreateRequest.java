/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupCreateRequest.java
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
 * Class used to create a NrcTypeGroupCreateRequest Udt Request
 *
 */

public class NrcTypeGroupCreateRequest extends NrcTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  NrcTypeGroupCreateRequest
 * @param id Unique request name
 * @param NTGCrIn NrcTypeGroupObjectData for NrcTypeGroupCreateRequest
 *
 */
@JsonCreator
  public NrcTypeGroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcTypeGroup")NrcTypeGroupObjectData NTGCrIn) {
    super(id, "NrcTypeGroupCreate");
    if (NTGCrIn != null) {
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGCrIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }

/**
 *
 * Retrieves the NrcTypeGroupObjectData that results from the NrcTypeGroupCreateRequest call
 * @return NrcTypeGroupObjectData resulting from udt call
 *
 */

  public NrcTypeGroupObjectData getOutput() {
    return NrcTypeGroupObjectHelper.fromMap(outputMap, "NrcTypeGroup");
  }
}
