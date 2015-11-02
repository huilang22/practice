/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineGetRequest.java
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
 * Class used to create a NrcLineGetRequest Udt Request
 *
 */

public class NrcLineGetRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a  NrcLineGetRequest
 * @param id Unique request name
 * @param nlGetIn NrcLineObjectKeyData for NrcLineGetRequest
 *
 */
@JsonCreator
  public NrcLineGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcLine")NrcLineObjectKeyData nlGetIn) {
    super(id, "NrcLineGet");
    if (nlGetIn != null) {
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(nlGetIn, new HashMap(), "NrcLineObjectKeyData").get("NrcLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcLineObjectData that results from the NrcLineGetRequest call
 * @return NrcLineObjectData resulting from udt call
 *
 */

  public NrcLineObjectData getOutput() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
