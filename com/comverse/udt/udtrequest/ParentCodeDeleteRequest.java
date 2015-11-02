/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ParentCodeDeleteRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ParentCodeDeleteRequest Udt Request
 *
 */

public class ParentCodeDeleteRequest extends ParentCodeSubRequestParent {
/**
 *
 * Constructor to create a  ParentCodeDeleteRequest
 * @param id Unique request name
 * @param ParentCodeDeleteIn ParentCodeObjectKeyData for ParentCodeDeleteRequest
 *
 */
@JsonCreator
  public ParentCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("ParentCode")ParentCodeObjectKeyData ParentCodeDeleteIn) {
    super(id, "ParentCodeDelete");
    if (ParentCodeDeleteIn != null) {
      addInput("ParentCode", ParentCodeObjectKeyHelper.toMap(ParentCodeDeleteIn, new HashMap(), "ParentCodeObjectKeyData").get("ParentCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the ParentCodeObjectData that results from the ParentCodeDeleteRequest call
 * @return ParentCodeObjectData resulting from udt call
 *
 */

  public ParentCodeObjectData getOutput() {
    return ParentCodeObjectHelper.fromMap(outputMap, "ParentCode");
  }
}
