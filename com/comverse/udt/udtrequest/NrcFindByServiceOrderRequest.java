/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcFindByServiceOrderRequest.java
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

import com.csgsystems.bp.data.*;
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcFindByServiceOrderRequest Udt Request
 *
 */

public class NrcFindByServiceOrderRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcFindByServiceOrderRequest
 * @param id Unique request name
 * @param NrcFindByServiceOrderIn NrcObjectBaseFilter for NrcFindByServiceOrderRequest
 * @param ____viewable_only Boolean for NrcFindByServiceOrderRequest
 * @param ServiceOrderId String for NrcFindByServiceOrderRequest
 *
 */
@JsonCreator
  public NrcFindByServiceOrderRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcObjectBaseFilter NrcFindByServiceOrderIn, @JsonProperty("ViewableOnly")Boolean ____viewable_only, @JsonProperty("ServiceOrderId")String ServiceOrderId) {
    super(id, "NrcFindByServiceOrder");
    if (NrcFindByServiceOrderIn != null) {
      Integer index =  NrcFindByServiceOrderIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectBaseHelper.toMap(NrcFindByServiceOrderIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (____viewable_only != null) {
      addInput("ViewableOnly", ____viewable_only);
    }
    if (ServiceOrderId != null) {
      addInput("ServiceOrderId", ServiceOrderId);
    }
  }

/**
 *
 * Retrieves the NrcObjectBaseDataList that results from the NrcFindByServiceOrderRequest call
 * @return NrcObjectBaseDataList resulting from udt call
 *
 */

  public NrcObjectBaseDataList getOutput() {
    return NrcObjectBaseHelper.fromMapList(outputMap, "NrcList");
  }
}
