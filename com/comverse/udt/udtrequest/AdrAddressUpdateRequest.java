/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressUpdateRequest.java
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
 * Class used to create a AdrAddressUpdateRequest Udt Request
 *
 */

public class AdrAddressUpdateRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a  AdrAddressUpdateRequest
 * @param id Unique request name
 * @param LocalAddressUpdateIn LocalAddressObjectData for AdrAddressUpdateRequest
 *
 */
@JsonCreator
  public AdrAddressUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")LocalAddressObjectData LocalAddressUpdateIn) {
    super(id, "AdrAddressUpdate");
    if (LocalAddressUpdateIn != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressUpdateIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the LocalAddressObjectData that results from the AdrAddressUpdateRequest call
 * @return LocalAddressObjectData resulting from udt call
 *
 */

  public LocalAddressObjectData getOutput() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
