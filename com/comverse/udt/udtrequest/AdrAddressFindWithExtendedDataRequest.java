/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AdrAddressFindWithExtendedDataRequest.java
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
 * Class used to create a AdrAddressFindWithExtendedDataRequest Udt Request
 *
 */

public class AdrAddressFindWithExtendedDataRequest extends AdrAddressRequest {
/**
 *
 * Constructor to create a  AdrAddressFindWithExtendedDataRequest
 * @param id Unique request name
 * @param AAFindWithIn AdrAddressObjectFilter for AdrAddressFindWithExtendedDataRequest
 *
 */
@JsonCreator
  public AdrAddressFindWithExtendedDataRequest(@JsonProperty("RequestId") String id, @JsonProperty("AdrAddress")AdrAddressObjectFilter AAFindWithIn) {
    super(id, "AdrAddressFindWithExtendedData");
    if (AAFindWithIn != null) {
      Integer index =  AAFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AdrAddress", AdrAddressObjectHelper.toMap(AAFindWithIn, new HashMap(), "AdrAddress").get("AdrAddress"));
    }
  }

/**
 *
 * Retrieves the AdrAddressObjectDataList that results from the AdrAddressFindWithExtendedDataRequest call
 * @return AdrAddressObjectDataList resulting from udt call
 *
 */

  public AdrAddressObjectDataList getOutput() {
    return AdrAddressObjectHelper.fromMapList(outputMap, "AdrAddressList");
  }
}
