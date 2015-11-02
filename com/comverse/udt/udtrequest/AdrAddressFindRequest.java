/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindRequest.java
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
 * Class used to create a AdrAddressFindRequest Udt Request
 *
 */

public class AdrAddressFindRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a  AdrAddressFindRequest
 * @param id Unique request name
 * @param AdrAddressFindIn AdrAddressObjectFilter for AdrAddressFindRequest
 *
 */
@JsonCreator
  public AdrAddressFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")AdrAddressObjectFilter AdrAddressFindIn) {
    super(id, "AdrAddressFind");
    if (AdrAddressFindIn != null) {
      Integer index =  AdrAddressFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(AdrAddressFindIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the AdrAddressObjectDataList that results from the AdrAddressFindRequest call
 * @return AdrAddressObjectDataList resulting from udt call
 *
 */

  public AdrAddressObjectDataList getOutput() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
}
