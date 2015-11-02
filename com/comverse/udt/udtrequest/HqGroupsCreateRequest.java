/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupsCreateRequest.java
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
 * Class used to create a HqGroupsCreateRequest Udt Request
 *
 */

public class HqGroupsCreateRequest extends HqGroupsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupsCreateRequest
 * @param id Unique request name
 * @param hgcIn HqGroupsObjectData for HqGroupsCreateRequest
 * @param AccountExternalId String for HqGroupsCreateRequest
 * @param AccountExternalIdType Integer for HqGroupsCreateRequest
 *
 */
@JsonCreator
  public HqGroupsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroups")HqGroupsObjectData hgcIn, @JsonProperty("AccountExternalId")String AccountExternalId, @JsonProperty("AccountExternalIdType")Integer AccountExternalIdType) {
    super(id, "HqGroupsCreate");
    if (hgcIn != null) {
      addInput("HqGroups", HqGroupsObjectHelper.toMap(hgcIn, new HashMap(), "HqGroups").get("HqGroups"));
    }
    if (AccountExternalId != null) {
      addInput("AccountExternalId", AccountExternalId);
    }
    if (AccountExternalIdType != null) {
      addInput("AccountExternalIdType", AccountExternalIdType);
    }
  }

/**
 *
 * Retrieves the HqGroupsObjectData that results from the HqGroupsCreateRequest call
 * @return HqGroupsObjectData resulting from udt call
 *
 */

  public HqGroupsObjectData getOutput() {
    return HqGroupsObjectHelper.fromMap(outputMap, "HqGroups");
  }
}
