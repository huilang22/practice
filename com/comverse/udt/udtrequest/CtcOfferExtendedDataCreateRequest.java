/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataCreateRequest.java
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
 * Class used to create a CtcOfferExtendedDataCreateRequest Udt Request
 *
 */

public class CtcOfferExtendedDataCreateRequest extends CtcOfferExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferExtendedDataCreateRequest
 * @param id Unique request name
 * @param CreateIn CtcOfferExtendedDataObjectData for CtcOfferExtendedDataCreateRequest
 *
 */
@JsonCreator
  public CtcOfferExtendedDataCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferExtendedData")CtcOfferExtendedDataObjectData CreateIn) {
    super(id, "CtcOfferExtendedDataCreate");
    if (CreateIn != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectHelper.toMap(CreateIn, new HashMap(), "CtcOfferExtendedData").get("CtcOfferExtendedData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferExtendedDataObjectData that results from the CtcOfferExtendedDataCreateRequest call
 * @return CtcOfferExtendedDataObjectData resulting from udt call
 *
 */

  public CtcOfferExtendedDataObjectData getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
