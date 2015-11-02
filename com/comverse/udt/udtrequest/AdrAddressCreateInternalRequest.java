/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressCreateInternalRequest.java
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
 * Class used to create a AdrAddressCreateInternalRequest Udt Request
 *
 */

public class AdrAddressCreateInternalRequest extends AdrAddressSubRequestParent {
/**
 *
 * Constructor to create a  AdrAddressCreateInternalRequest
 * @param id Unique request name
 * @param LocalAddressCreateInternalIn LocalAddressObjectData for AdrAddressCreateInternalRequest
 *
 */
@JsonCreator
  public AdrAddressCreateInternalRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")LocalAddressObjectData LocalAddressCreateInternalIn) {
    super(id, "AdrAddressCreateInternal");
    if (LocalAddressCreateInternalIn != null) {
      addInput("AdrAddress", LocalAddressObjectHelper.toMap(LocalAddressCreateInternalIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the LocalAddressObjectData that results from the AdrAddressCreateInternalRequest call
 * @return LocalAddressObjectData resulting from udt call
 *
 */

  public LocalAddressObjectData getOutput() {
    return LocalAddressObjectHelper.fromMap(outputMap, "AdrAddress");
  }
}
