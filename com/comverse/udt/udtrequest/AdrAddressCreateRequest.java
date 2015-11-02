/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressCreateRequest.java
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
 * Class used to create a AdrAddressCreateRequest Udt Request
 *
 */

public class AdrAddressCreateRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a  AdrAddressCreateRequest
 * @param id Unique request name
 * @param LocalAddressCreateIn LocalAddressObjectData for AdrAddressCreateRequest
 *
 */
@JsonCreator
  public AdrAddressCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")LocalAddressObjectData LocalAddressCreateIn) {
    super(id, "AdrAddressCreate");
    if (LocalAddressCreateIn != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressCreateIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the LocalAddressObjectData that results from the AdrAddressCreateRequest call
 * @return LocalAddressObjectData resulting from udt call
 *
 */

  public LocalAddressObjectData getOutput() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
