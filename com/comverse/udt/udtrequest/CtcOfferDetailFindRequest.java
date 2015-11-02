/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferDetailFindRequest.java
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
 * Class used to create a CtcOfferDetailFindRequest Udt Request
 *
 */

public class CtcOfferDetailFindRequest extends CtcOfferRequest {
/**
 *
 * Constructor to create a  CtcOfferDetailFindRequest
 * @param id Unique request name
 * @param DetailFindIn CtcOfferFilterObjectFilter for CtcOfferDetailFindRequest
 *
 */
@JsonCreator
  public CtcOfferDetailFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferFilterObjectFilter DetailFindIn) {
    super(id, "CtcOfferDetailFind");
    if (DetailFindIn != null) {
      Integer index =  DetailFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(DetailFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferDetailObjectDataList that results from the CtcOfferDetailFindRequest call
 * @return CtcOfferDetailObjectDataList resulting from udt call
 *
 */

  public CtcOfferDetailObjectDataList getOutput() {
    return CtcOfferDetailObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
}
