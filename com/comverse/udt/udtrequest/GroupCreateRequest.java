/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupCreateRequest.java
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
 * Class used to create a GroupCreateRequest Udt Request
 *
 */

public class GroupCreateRequest extends GroupSubRequestParent {
/**
 *
 * Constructor to create a  GroupCreateRequest
 * @param id Unique request name
 * @param GcreateIn GroupObjectData for GroupCreateRequest
 *
 */
@JsonCreator
  public GroupCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Group")GroupObjectData GcreateIn) {
    super(id, "GroupCreate");
    if (GcreateIn != null) {
      addInput("Group", GroupObjectHelper.toMap(GcreateIn, new HashMap(), "Group").get("Group"));
    }
  }

/**
 *
 * Retrieves the GroupObjectData that results from the GroupCreateRequest call
 * @return GroupObjectData resulting from udt call
 *
 */

  public GroupObjectData getOutput() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
}
