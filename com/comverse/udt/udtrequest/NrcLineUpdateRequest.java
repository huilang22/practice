/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineUpdateRequest.java
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
 * Class used to create a NrcLineUpdateRequest Udt Request
 *
 */

public class NrcLineUpdateRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a  NrcLineUpdateRequest
 * @param id Unique request name
 * @param nlUpdIn NrcLineObjectData for NrcLineUpdateRequest
 *
 */
@JsonCreator
  public NrcLineUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcLine")NrcLineObjectData nlUpdIn) {
    super(id, "NrcLineUpdate");
    if (nlUpdIn != null) {
      addInput("NrcLine", NrcLineObjectHelper.toMap(nlUpdIn, new HashMap(), "NrcLine").get("NrcLine"));
    }
  }

/**
 *
 * Retrieves the NrcLineObjectData that results from the NrcLineUpdateRequest call
 * @return NrcLineObjectData resulting from udt call
 *
 */

  public NrcLineObjectData getOutput() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
