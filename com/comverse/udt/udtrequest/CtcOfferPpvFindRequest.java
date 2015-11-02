/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferPpvFindRequest.java
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
 * Class used to create a CtcOfferPpvFindRequest Udt Request
 *
 */

public class CtcOfferPpvFindRequest extends CtcOfferRequest {
/**
 *
 * Constructor to create a  CtcOfferPpvFindRequest
 * @param id Unique request name
 * @param PpvFindIn CtcOfferFilterObjectFilter for CtcOfferPpvFindRequest
 *
 */
@JsonCreator
  public CtcOfferPpvFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferFilterObjectFilter PpvFindIn) {
    super(id, "CtcOfferPpvFind");
    if (PpvFindIn != null) {
      Integer index =  PpvFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferFilterObjectHelper.toMap(PpvFindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectDataList that results from the CtcOfferPpvFindRequest call
 * @return CtcOfferObjectDataList resulting from udt call
 *
 */

  public CtcOfferObjectDataList getOutput() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
}
