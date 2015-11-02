/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectorFindRequest.java
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
 * Class used to create a CollectorFindRequest Udt Request
 *
 */

public class CollectorFindRequest extends CollectorRequest {
/**
 *
 * Constructor to create a  CollectorFindRequest
 * @param id Unique request name
 * @param findIn CollectorObjectFilter for CollectorFindRequest
 *
 */
@JsonCreator
  public CollectorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Collector")CollectorObjectFilter findIn) {
    super(id, "CollectorFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Collector", CollectorObjectHelper.toMap(findIn, new HashMap(), "Collector").get("Collector"));
    }
  }

/**
 *
 * Retrieves the CollectorObjectDataList that results from the CollectorFindRequest call
 * @return CollectorObjectDataList resulting from udt call
 *
 */

  public CollectorObjectDataList getOutput() {
    return CollectorObjectHelper.fromMapList(outputMap, "CollectorList");
  }
}
