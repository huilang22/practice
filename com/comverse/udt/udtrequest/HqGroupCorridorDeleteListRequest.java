/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupCorridorDeleteListRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a HqGroupCorridorDeleteListRequest Udt Request
 *
 */

public class HqGroupCorridorDeleteListRequest extends HqGroupCorridorRequest {
/**
 *
 * Constructor to create a  HqGroupCorridorDeleteListRequest
 * @param id Unique request name
 * @param HQGCdeleteListIn HqGroupCorridorObjectFilter for HqGroupCorridorDeleteListRequest
 *
 */
@JsonCreator
  public HqGroupCorridorDeleteListRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupCorridor")HqGroupCorridorObjectFilter HQGCdeleteListIn) {
    super(id, "HqGroupCorridorDeleteList");
    if (HQGCdeleteListIn != null) {
      Integer index =  HQGCdeleteListIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("HqGroupCorridor", HqGroupCorridorObjectHelper.toMap(HQGCdeleteListIn, new HashMap(), "Void").get("Void"));
    }
  }

}
