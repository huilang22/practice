/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineCreateRequest.java
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
 * Class used to create a NrcLineCreateRequest Udt Request
 *
 */

public class NrcLineCreateRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a  NrcLineCreateRequest
 * @param id Unique request name
 * @param nlCrIn NrcLineObjectData for NrcLineCreateRequest
 *
 */
@JsonCreator
  public NrcLineCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcLine")NrcLineObjectData nlCrIn) {
    super(id, "NrcLineCreate");
    if (nlCrIn != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlCrIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }

/**
 *
 * Retrieves the NrcLineObjectData that results from the NrcLineCreateRequest call
 * @return NrcLineObjectData resulting from udt call
 *
 */

  public NrcLineObjectData getOutput() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
