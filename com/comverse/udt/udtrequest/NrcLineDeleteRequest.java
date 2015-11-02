/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcLineDeleteRequest.java
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
 * Class used to create a NrcLineDeleteRequest Udt Request
 *
 */

public class NrcLineDeleteRequest extends NrcLineSubRequestParent {
/**
 *
 * Constructor to create a  NrcLineDeleteRequest
 * @param id Unique request name
 * @param nlDeleteIn NrcLineObjectKeyData for NrcLineDeleteRequest
 *
 */
@JsonCreator
  public NrcLineDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("NrcLine")NrcLineObjectKeyData nlDeleteIn) {
    super(id, "NrcLineDelete");
    if (nlDeleteIn != null) {
      addInput("NrcLine", NrcLineObjectKeyHelper.toMap(nlDeleteIn, new HashMap(), "NrcLineObjectKeyData").get("NrcLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the NrcLineObjectData that results from the NrcLineDeleteRequest call
 * @return NrcLineObjectData resulting from udt call
 *
 */

  public NrcLineObjectData getOutput() {
    return NrcLineObjectHelper.fromMap(outputMap, "NrcLine");
  }
}
