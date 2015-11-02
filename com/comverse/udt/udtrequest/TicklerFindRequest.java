/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TicklerFindRequest.java
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
 * Class used to create a TicklerFindRequest Udt Request
 *
 */

public class TicklerFindRequest extends TicklerRequest {
/**
 *
 * Constructor to create a  TicklerFindRequest
 * @param id Unique request name
 * @param findIn TicklerObjectFilter for TicklerFindRequest
 *
 */
@JsonCreator
  public TicklerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Tickler")TicklerObjectFilter findIn) {
    super(id, "TicklerFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Tickler", TicklerObjectHelper.toMap(findIn, new HashMap(), "Tickler").get("Tickler"));
    }
  }

/**
 *
 * Retrieves the TicklerObjectDataList that results from the TicklerFindRequest call
 * @return TicklerObjectDataList resulting from udt call
 *
 */

  public TicklerObjectDataList getOutput() {
    return TicklerObjectHelper.fromMapList(outputMap, "TicklerList");
  }
}
