/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupUpdateRequest.java
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
 * Class used to create a GroupUpdateRequest Udt Request
 *
 */

public class GroupUpdateRequest extends GroupSubRequestParent {
/**
 *
 * Constructor to create a  GroupUpdateRequest
 * @param id Unique request name
 * @param GupdateIn GroupObjectData for GroupUpdateRequest
 *
 */
@JsonCreator
  public GroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Group")GroupObjectData GupdateIn) {
    super(id, "GroupUpdate");
    if (GupdateIn != null) {
      addInput("Group", GroupObjectHelper.toMap(GupdateIn, new HashMap(), "Group").get("Group"));
    }
  }

/**
 *
 * Retrieves the GroupObjectData that results from the GroupUpdateRequest call
 * @return GroupObjectData resulting from udt call
 *
 */

  public GroupObjectData getOutput() {
    return GroupObjectHelper.fromMap(outputMap, "Group");
  }
}
