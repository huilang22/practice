/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GroupLocateGetRequest.java
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
 * Class used to create a GroupLocateGetRequest Udt Request
 *
 */

public class GroupLocateGetRequest extends GroupLocateSubRequestParent {
/**
 *
 * Constructor to create a  GroupLocateGetRequest
 * @param id Unique request name
 * @param GLGetIn GroupLocateObjectKeyData for GroupLocateGetRequest
 *
 */
@JsonCreator
  public GroupLocateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("GroupLocate")GroupLocateObjectKeyData GLGetIn) {
    super(id, "GroupLocateGet");
    if (GLGetIn != null) {
      addInput("GroupLocate", GroupLocateObjectKeyHelper.toMap(GLGetIn, new HashMap(), "GroupLocateObjectKeyData").get("GroupLocateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the GroupLocateObjectData that results from the GroupLocateGetRequest call
 * @return GroupLocateObjectData resulting from udt call
 *
 */

  public GroupLocateObjectData getOutput() {
    return GroupLocateObjectHelper.fromMap(outputMap, "GroupLocate");
  }
}
