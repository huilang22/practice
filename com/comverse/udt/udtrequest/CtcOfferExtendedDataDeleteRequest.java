/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferExtendedDataDeleteRequest.java
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
 * Class used to create a CtcOfferExtendedDataDeleteRequest Udt Request
 *
 */

public class CtcOfferExtendedDataDeleteRequest extends CtcOfferExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a  CtcOfferExtendedDataDeleteRequest
 * @param id Unique request name
 * @param DeleteIn CtcOfferExtendedDataObjectKeyData for CtcOfferExtendedDataDeleteRequest
 *
 */
@JsonCreator
  public CtcOfferExtendedDataDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOfferExtendedData")CtcOfferExtendedDataObjectKeyData DeleteIn) {
    super(id, "CtcOfferExtendedDataDelete");
    if (DeleteIn != null) {
      addInput("CtcOfferExtendedData", CtcOfferExtendedDataObjectKeyHelper.toMap(DeleteIn, new HashMap(), "CtcOfferExtendedDataObjectKeyData").get("CtcOfferExtendedDataObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CtcOfferExtendedDataObjectData that results from the CtcOfferExtendedDataDeleteRequest call
 * @return CtcOfferExtendedDataObjectData resulting from udt call
 *
 */

  public CtcOfferExtendedDataObjectData getOutput() {
    return CtcOfferExtendedDataObjectHelper.fromMap(outputMap, "CtcOfferExtendedData");
  }
}
