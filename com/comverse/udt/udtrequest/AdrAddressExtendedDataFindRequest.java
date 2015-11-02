/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressExtendedDataFindRequest.java
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
 * Class used to create a AdrAddressExtendedDataFindRequest Udt Request
 *
 */

public class AdrAddressExtendedDataFindRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a  AdrAddressExtendedDataFindRequest
 * @param id Unique request name
 * @param aedfIn AdrAddressObjectKeyData for AdrAddressExtendedDataFindRequest
 *
 */
@JsonCreator
  public AdrAddressExtendedDataFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")AdrAddressObjectKeyData aedfIn) {
    super(id, "AdrAddressExtendedDataFind");
    if (aedfIn != null) {
      addInput("AdrAddress", AdrAddressObjectKeyHelper.toMap(aedfIn, new HashMap(), "AdrAddressObjectKeyData").get("AdrAddressObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AdrAddressEDObjectDataList that results from the AdrAddressExtendedDataFindRequest call
 * @return AdrAddressEDObjectDataList resulting from udt call
 *
 */

  public AdrAddressEDObjectDataList getOutput() {
    return AdrAddressEDObjectHelper.fromMapList(outputMap, "AdrAddressExtendedDataList");
  }
}
