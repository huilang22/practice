/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CollectableGetRequest.java
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

import com.csgsystems.ar.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CollectableGetRequest Udt Request
 *
 */

public class CollectableGetRequest extends CollectableSubRequestParent {
/**
 *
 * Constructor to create a  CollectableGetRequest
 * @param id Unique request name
 * @param getIn CollectableObjectKeyData for CollectableGetRequest
 *
 */
@JsonCreator
  public CollectableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Collectable")CollectableObjectKeyData getIn) {
    super(id, "CollectableGet");
    if (getIn != null) {
      addInput("Collectable", CollectableObjectKeyHelper.toMap(getIn, new HashMap(), "CollectableObjectKeyData").get("CollectableObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CollectableObjectData that results from the CollectableGetRequest call
 * @return CollectableObjectData resulting from udt call
 *
 */

  public CollectableObjectData getOutput() {
    return CollectableObjectHelper.fromMap(outputMap, "Collectable");
  }
}
