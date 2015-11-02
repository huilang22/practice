/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelUpdateRequest.java
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
 * Class used to create a PrivacyLevelUpdateRequest Udt Request
 *
 */

public class PrivacyLevelUpdateRequest extends PrivacyLevelSubRequestParent {
/**
 *
 * Constructor to create a  PrivacyLevelUpdateRequest
 * @param id Unique request name
 * @param PLUpdateIn PrivacyLevelObjectData for PrivacyLevelUpdateRequest
 *
 */
@JsonCreator
  public PrivacyLevelUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrivacyLevel")PrivacyLevelObjectData PLUpdateIn) {
    super(id, "PrivacyLevelUpdate");
    if (PLUpdateIn != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLUpdateIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }

/**
 *
 * Retrieves the PrivacyLevelObjectData that results from the PrivacyLevelUpdateRequest call
 * @return PrivacyLevelObjectData resulting from udt call
 *
 */

  public PrivacyLevelObjectData getOutput() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
