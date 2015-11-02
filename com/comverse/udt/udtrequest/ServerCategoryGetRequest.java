/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryGetRequest.java
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
 * Class used to create a ServerCategoryGetRequest Udt Request
 *
 */

public class ServerCategoryGetRequest extends ServerCategorySubRequestParent {
/**
 *
 * Constructor to create a  ServerCategoryGetRequest
 * @param id Unique request name
 * @param SCGetIn SCObjectKeyData for ServerCategoryGetRequest
 *
 */
@JsonCreator
  public ServerCategoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerCategory")SCObjectKeyData SCGetIn) {
    super(id, "ServerCategoryGet");
    if (SCGetIn != null) {
      addInput("ServerCategory", SCObjectKeyHelper.toMap(SCGetIn, new HashMap(), "SCObjectKeyData").get("SCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the SCObjectData that results from the ServerCategoryGetRequest call
 * @return SCObjectData resulting from udt call
 *
 */

  public SCObjectData getOutput() {
    return SCObjectHelper.fromMap(outputMap, "ServerCategory");
  }
}
