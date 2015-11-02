/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SupervisorFindRequest.java
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

import com.csgsystems.we.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SupervisorFindRequest Udt Request
 *
 */

public class SupervisorFindRequest extends SupervisorRequest {
/**
 *
 * Constructor to create a  SupervisorFindRequest
 * @param id Unique request name
 * @param SupervisorFindIn SupervisorObjectFilter for SupervisorFindRequest
 *
 */
@JsonCreator
  public SupervisorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Supervisor")SupervisorObjectFilter SupervisorFindIn) {
    super(id, "SupervisorFind");
    if (SupervisorFindIn != null) {
      Integer index =  SupervisorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Supervisor", SupervisorObjectHelper.toMap(SupervisorFindIn, new HashMap(), "Supervisor").get("Supervisor"));
    }
  }

/**
 *
 * Retrieves the SupervisorObjectDataList that results from the SupervisorFindRequest call
 * @return SupervisorObjectDataList resulting from udt call
 *
 */

  public SupervisorObjectDataList getOutput() {
    return SupervisorObjectHelper.fromMapList(outputMap, "SupervisorList");
  }
}
