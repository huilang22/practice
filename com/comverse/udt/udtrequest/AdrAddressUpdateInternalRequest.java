/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressUpdateInternalRequest.java
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
 * Class used to create a AdrAddressUpdateInternalRequest Udt Request
 *
 */

public class AdrAddressUpdateInternalRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a  AdrAddressUpdateInternalRequest
 * @param id Unique request name
 * @param LocalAddressUpdateInternalIn LocalAddressObjectData for AdrAddressUpdateInternalRequest
 *
 */
@JsonCreator
  public AdrAddressUpdateInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")LocalAddressObjectData LocalAddressUpdateInternalIn) {
    super(id, "AdrAddressUpdateInternal");
    if (LocalAddressUpdateInternalIn != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressUpdateInternalIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the LocalAddressObjectData that results from the AdrAddressUpdateInternalRequest call
 * @return LocalAddressObjectData resulting from udt call
 *
 */

  public LocalAddressObjectData getOutput() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
