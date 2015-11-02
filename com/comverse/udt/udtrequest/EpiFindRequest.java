/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EpiFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a EpiFindRequest Udt Request
 *
 */

public class EpiFindRequest extends EpiRequest {
/**
 *
 * Constructor to create a  EpiFindRequest
 * @param id Unique request name
 * @param EpiFindIn EpiObjectFilter for EpiFindRequest
 *
 */
@JsonCreator
  public EpiFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Epi")EpiObjectFilter EpiFindIn) {
    super(id, "EpiFind");
    if (EpiFindIn != null) {
      Integer index =  EpiFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Epi", EpiObjectHelper.toMap(EpiFindIn, new HashMap(), "Epi").get("Epi"));
    }
  }

/**
 *
 * Retrieves the EpiObjectDataList that results from the EpiFindRequest call
 * @return EpiObjectDataList resulting from udt call
 *
 */

  public EpiObjectDataList getOutput() {
    return EpiObjectHelper.fromMapList(outputMap, "EpiList");
  }
}
