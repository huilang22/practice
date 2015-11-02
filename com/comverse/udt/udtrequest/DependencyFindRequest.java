/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DependencyFindRequest.java
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
 * Class used to create a DependencyFindRequest Udt Request
 *
 */

public class DependencyFindRequest extends DependencyRequest {
/**
 *
 * Constructor to create a  DependencyFindRequest
 * @param id Unique request name
 * @param depFindIntIn DependencyObjectFilter for DependencyFindRequest
 *
 */
@JsonCreator
  public DependencyFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Dependency")DependencyObjectFilter depFindIntIn) {
    super(id, "DependencyFind");
    if (depFindIntIn != null) {
      Integer index =  depFindIntIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Dependency", DependencyObjectHelper.toMap(depFindIntIn, new HashMap(), "Dependency").get("Dependency"));
    }
  }

/**
 *
 * Retrieves the DependencyObjectDataList that results from the DependencyFindRequest call
 * @return DependencyObjectDataList resulting from udt call
 *
 */

  public DependencyObjectDataList getOutput() {
    return DependencyObjectHelper.fromMapList(outputMap, "DependencyList");
  }
}
