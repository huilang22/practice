/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataUpdateRequest.java
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
 * Class used to create a CtcOfferExtendedDataUpdateRequest Udt Request
 *
 */

public class CtcOfferExtendedDataUpdateRequest extends CtcOfferExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferExtendedDataUpdateRequest
 * @param id Unique request name
 * @param UpdateIn CtcOfferExtendedDataObjectData for CtcOfferExtendedDataUpdateRequest
 *
 */
@JsonCreator
  public CtcOfferExtendedDataUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferExtendedData")CtcOfferExtendedDataObjectData UpdateIn) {
    super(id, "CtcOfferExtendedDataUpdate");
    if (UpdateIn != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(UpdateIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferExtendedDataObjectData that results from the CtcOfferExtendedDataUpdateRequest call
 * @return CtcOfferExtendedDataObjectData resulting from udt call
 *
 */

  public CtcOfferExtendedDataObjectData getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
