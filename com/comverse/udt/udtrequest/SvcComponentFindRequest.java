/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SvcComponentFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a SvcComponentFindRequest Udt Request
 *
 */

public class SvcComponentFindRequest extends SvcComponentRequest {
/**
 *
 * Constructor to create a  SvcComponentFindRequest
 * @param id Unique request name
 * @param SvcComponentFindIn SvcComponentObjectFilter for SvcComponentFindRequest
 *
 */
@JsonCreator
  public SvcComponentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SvcComponent")SvcComponentObjectFilter SvcComponentFindIn) {
    super(id, "SvcComponentFind");
    if (SvcComponentFindIn != null) {
      Integer index =  SvcComponentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SvcComponent", SvcComponentObjectHelper.toMap(SvcComponentFindIn, new HashMap(), "SvcComponent").get("SvcComponent"));
    }
  }

/**
 *
 * Retrieves the SvcComponentObjectDataList that results from the SvcComponentFindRequest call
 * @return SvcComponentObjectDataList resulting from udt call
 *
 */

  public SvcComponentObjectDataList getOutput() {
    return SvcComponentObjectHelper.fromMapList(outputMap, "SvcComponentList");
  }
}
