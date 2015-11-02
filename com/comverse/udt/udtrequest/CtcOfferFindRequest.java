/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcOfferFindRequest.java
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
 * Class used to create a CtcOfferFindRequest Udt Request
 *
 */

public class CtcOfferFindRequest extends CtcOfferRequest {
/**
 *
 * Constructor to create a  CtcOfferFindRequest
 * @param id Unique request name
 * @param FindIn CtcOfferObjectFilter for CtcOfferFindRequest
 *
 */
@JsonCreator
  public CtcOfferFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CtcOffer")CtcOfferObjectFilter FindIn) {
    super(id, "CtcOfferFind");
    if (FindIn != null) {
      Integer index =  FindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CtcOffer", CtcOfferObjectHelper.toMap(FindIn, new HashMap(), "CtcOffer").get("CtcOffer"));
    }
  }

/**
 *
 * Retrieves the CtcOfferObjectDataList that results from the CtcOfferFindRequest call
 * @return CtcOfferObjectDataList resulting from udt call
 *
 */

  public CtcOfferObjectDataList getOutput() {
    return CtcOfferObjectHelper.fromMapList(outputMap, "CtcOfferList");
  }
}
