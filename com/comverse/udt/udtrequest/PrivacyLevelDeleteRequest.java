/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelDeleteRequest.java
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
 * Class used to create a PrivacyLevelDeleteRequest Udt Request
 *
 */

public class PrivacyLevelDeleteRequest extends PrivacyLevelSubRequestParent {
/**
 *
 * Constructor to create a  PrivacyLevelDeleteRequest
 * @param id Unique request name
 * @param PLDeleteIn PrivacyLevelObjectKeyData for PrivacyLevelDeleteRequest
 *
 */
@JsonCreator
  public PrivacyLevelDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("PrivacyLevel")PrivacyLevelObjectKeyData PLDeleteIn) {
    super(id, "PrivacyLevelDelete");
    if (PLDeleteIn != null) {
      addInput("PrivacyLevel", PrivacyLevelObjectKeyHelper.toMap(PLDeleteIn, new HashMap(), "PrivacyLevelObjectKeyData").get("PrivacyLevelObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the PrivacyLevelObjectData that results from the PrivacyLevelDeleteRequest call
 * @return PrivacyLevelObjectData resulting from udt call
 *
 */

  public PrivacyLevelObjectData getOutput() {
    return PrivacyLevelObjectHelper.fromMap(outputMap, "PrivacyLevel");
  }
}
