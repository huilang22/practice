/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiDeleteRequest.java
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
 * Class used to create a EpiDeleteRequest Udt Request
 *
 */

public class EpiDeleteRequest extends EpiSubRequestParent {
/**
 *
 * Constructor to create a  EpiDeleteRequest
 * @param id Unique request name
 * @param EpiDeleteIn EpiObjectKeyData for EpiDeleteRequest
 *
 */
@JsonCreator
  public EpiDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("Epi")EpiObjectKeyData EpiDeleteIn) {
    super(id, "EpiDelete");
    if (EpiDeleteIn != null) {
      addInput("Epi", EpiObjectKeyHelper.toMap(EpiDeleteIn, new HashMap(), "EpiObjectKeyData").get("EpiObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EpiObjectData that results from the EpiDeleteRequest call
 * @return EpiObjectData resulting from udt call
 *
 */

  public EpiObjectData getOutput() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
