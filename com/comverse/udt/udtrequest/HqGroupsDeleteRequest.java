/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsDeleteRequest.java
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
 * Class used to create a HqGroupsDeleteRequest Udt Request
 *
 */

public class HqGroupsDeleteRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupsDeleteRequest
 * @param id Unique request name
 * @param hgxIn HqGroupsObjectData for HqGroupsDeleteRequest
 *
 */
@JsonCreator
  public HqGroupsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroups")HqGroupsObjectData hgxIn) {
    super(id, "HqGroupsDelete");
    if (hgxIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgxIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
  }

/**
 *
 * Retrieves the HqGroupsObjectData that results from the HqGroupsDeleteRequest call
 * @return HqGroupsObjectData resulting from udt call
 *
 */

  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
