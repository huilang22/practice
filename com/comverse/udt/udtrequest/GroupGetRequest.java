/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupGetRequest.java
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
 * Class used to create a GroupGetRequest Udt Request
 *
 */

public class GroupGetRequest extends GroupSubRequestParent {
/**
 *
 * Constructor to create a  GroupGetRequest
 * @param id Unique request name
 * @param GgetIn GroupObjectKeyData for GroupGetRequest
 *
 */
@JsonCreator
  public GroupGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Group")GroupObjectKeyData GgetIn) {
    super(id, "GroupGet");
    if (GgetIn != null) {
      addInput("Group", GroupObjectKeyHelper.toMap(GgetIn, new HashMap(), "GroupObjectKeyData").get("GroupObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GroupObjectData that results from the GroupGetRequest call
 * @return GroupObjectData resulting from udt call
 *
 */

  public GroupObjectData getOutput() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
}
