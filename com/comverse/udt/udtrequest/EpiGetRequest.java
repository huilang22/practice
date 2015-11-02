/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiGetRequest.java
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
 * Class used to create a EpiGetRequest Udt Request
 *
 */

public class EpiGetRequest extends EpiSubRequestParent {
/**
 *
 * Constructor to create a  EpiGetRequest
 * @param id Unique request name
 * @param EpiGetIn EpiObjectKeyData for EpiGetRequest
 *
 */
@JsonCreator
  public EpiGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Epi")EpiObjectKeyData EpiGetIn) {
    super(id, "EpiGet");
    if (EpiGetIn != null) {
      addInput("Epi", EpiObjectKeyHelper.toMap(EpiGetIn, new HashMap(), "EpiObjectKeyData").get("EpiObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EpiObjectData that results from the EpiGetRequest call
 * @return EpiObjectData resulting from udt call
 *
 */

  public EpiObjectData getOutput() {
    return EpiObjectHelper.fromMap(outputMap, "Epi");
  }
}
