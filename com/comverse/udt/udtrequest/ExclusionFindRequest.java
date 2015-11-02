/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionFindRequest.java
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
 * Class used to create a ExclusionFindRequest Udt Request
 *
 */

public class ExclusionFindRequest extends ExclusionRequest {
/**
 *
 * Constructor to create a  ExclusionFindRequest
 * @param id Unique request name
 * @param excFindIntIn ExclusionObjectFilter for ExclusionFindRequest
 *
 */
@JsonCreator
  public ExclusionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Exclusion")ExclusionObjectFilter excFindIntIn) {
    super(id, "ExclusionFind");
    if (excFindIntIn != null) {
      Integer index =  excFindIntIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Exclusion", ExclusionObjectHelper.toMap(excFindIntIn, new HashMap(), "Exclusion").get("Exclusion"));
    }
  }

/**
 *
 * Retrieves the ExclusionObjectDataList that results from the ExclusionFindRequest call
 * @return ExclusionObjectDataList resulting from udt call
 *
 */

  public ExclusionObjectDataList getOutput() {
    return ExclusionObjectHelper.fromMapList(outputMap, "ExclusionList");
  }
}
