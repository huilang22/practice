/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableFindRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CollectableFindRequest Udt Request
 *
 */

public class CollectableFindRequest extends CollectableRequest {
/**
 *
 * Constructor to create a  CollectableFindRequest
 * @param id Unique request name
 * @param findIn CollectableObjectFilter for CollectableFindRequest
 *
 */
@JsonCreator
  public CollectableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Collectable")CollectableObjectFilter findIn) {
    super(id, "CollectableFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Collectable", CollectableObjectHelper.toMap(findIn, new HashMap(), "Collectable").get("Collectable"));
    }
  }

/**
 *
 * Retrieves the CollectableObjectDataList that results from the CollectableFindRequest call
 * @return CollectableObjectDataList resulting from udt call
 *
 */

  public CollectableObjectDataList getOutput() {
    return CollectableObjectHelper.fromMapList(outputMap, "CollectableList");
  }
}
