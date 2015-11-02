/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdHqgroupsMapGetRequest.java
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
 * Class used to create a ExternalIdHqgroupsMapGetRequest Udt Request
 *
 */

public class ExternalIdHqgroupsMapGetRequest extends ExternalIdHqGroupsMapSubRequestParent {
/**
 *
 * Constructor to create a  ExternalIdHqgroupsMapGetRequest
 * @param id Unique request name
 * @param getIn EIHGMObjectKeyData for ExternalIdHqgroupsMapGetRequest
 *
 */
@JsonCreator
  public ExternalIdHqgroupsMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExternalIdHqGroupsMap")EIHGMObjectKeyData getIn) {
    super(id, "ExternalIdHqgroupsMapGet");
    if (getIn != null) {
      addInput("ExternalIdHqGroupsMap", EIHGMObjectKeyHelper.toMap(getIn, new HashMap(), "EIHGMObjectKeyData").get("EIHGMObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EIHGMObjectData that results from the ExternalIdHqgroupsMapGetRequest call
 * @return EIHGMObjectData resulting from udt call
 *
 */

  public EIHGMObjectData getOutput() {
    return EIHGMObjectHelper.fromMap(outputMap, "ExternalIdHqGroupsMap");
  }
}
