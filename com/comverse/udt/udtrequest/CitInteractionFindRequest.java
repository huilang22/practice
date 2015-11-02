/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitInteractionFindRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitInteractionFindRequest Udt Request
 *
 */

public class CitInteractionFindRequest extends CitInteractionRequest {
/**
 *
 * Constructor to create a  CitInteractionFindRequest
 * @param id Unique request name
 * @param citInteractionFindIn CitInteractionObjectFilter for CitInteractionFindRequest
 *
 */
@JsonCreator
  public CitInteractionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitInteraction")CitInteractionObjectFilter citInteractionFindIn) {
    super(id, "CitInteractionFind");
    if (citInteractionFindIn != null) {
      Integer index =  citInteractionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitInteraction", CitInteractionObjectHelper.toMap(citInteractionFindIn, new HashMap(), "CitInteraction").get("CitInteraction"));
    }
  }

/**
 *
 * Retrieves the CitInteractionObjectDataList that results from the CitInteractionFindRequest call
 * @return CitInteractionObjectDataList resulting from udt call
 *
 */

  public CitInteractionObjectDataList getOutput() {
    return CitInteractionObjectHelper.fromMapList(outputMap, "CitInteractionList");
  }
}
