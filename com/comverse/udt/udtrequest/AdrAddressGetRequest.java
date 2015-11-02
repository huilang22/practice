/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AdrAddressGetRequest Udt Request
 *
 */

public class AdrAddressGetRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a  AdrAddressGetRequest
 * @param id Unique request name
 * @param AdrAddressGetIn AdrAddressObjectKeyData for AdrAddressGetRequest
 *
 */
@JsonCreator
  public AdrAddressGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")AdrAddressObjectKeyData AdrAddressGetIn) {
    super(id, "AdrAddressGet");
    if (AdrAddressGetIn != null) {
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(AdrAddressGetIn, new HashMap(), "AdrAddressObjectKeyData").get("AdrAddressObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdrAddressObjectData that results from the AdrAddressGetRequest call
 * @return AdrAddressObjectData resulting from udt call
 *
 */

  public AdrAddressObjectData getOutput() {
    return AdrAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
