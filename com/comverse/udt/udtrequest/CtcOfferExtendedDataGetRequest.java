/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataGetRequest.java
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

import com.csgsystems.ctc.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CtcOfferExtendedDataGetRequest Udt Request
 *
 */

public class CtcOfferExtendedDataGetRequest extends CtcOfferExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferExtendedDataGetRequest
 * @param id Unique request name
 * @param GetIn CtcOfferExtendedDataObjectKeyData for CtcOfferExtendedDataGetRequest
 *
 */
@JsonCreator
  public CtcOfferExtendedDataGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferExtendedData")CtcOfferExtendedDataObjectKeyData GetIn) {
    super(id, "CtcOfferExtendedDataGet");
    if (GetIn != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(GetIn, new HashMap(), "CtcOfferExtendedDataObjectKeyData").get("CtcOfferExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferExtendedDataObjectData that results from the CtcOfferExtendedDataGetRequest call
 * @return CtcOfferExtendedDataObjectData resulting from udt call
 *
 */

  public CtcOfferExtendedDataObjectData getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
