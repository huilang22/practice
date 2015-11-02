/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferSummaryFindRequest.java
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
 * Class used to create a CtcOfferSummaryFindRequest Udt Request
 *
 */

public class CtcOfferSummaryFindRequest extends CtcOfferRequest {
/**
 *
 * Constructor to create a  CtcOfferSummaryFindRequest
 * @param id Unique request name
 * @param SummaryFindIn CtcOfferFilterObjectFilter for CtcOfferSummaryFindRequest
 *
 */
@JsonCreator
  public CtcOfferSummaryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferFilterObjectFilter SummaryFindIn) {
    super(id, "CtcOfferSummaryFind");
    if (SummaryFindIn != null) {
      Integer index =  SummaryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(SummaryFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferSummaryObjectDataList that results from the CtcOfferSummaryFindRequest call
 * @return CtcOfferSummaryObjectDataList resulting from udt call
 *
 */

  public CtcOfferSummaryObjectDataList getOutput() {
    return CtcOfferSummaryObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
}
