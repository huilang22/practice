/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerDefinitionFindRequest.java
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
 * Class used to create a ServerDefinitionFindRequest Udt Request
 *
 */

public class ServerDefinitionFindRequest extends ServerDefinitionRequest {
/**
 *
 * Constructor to create a  ServerDefinitionFindRequest
 * @param id Unique request name
 * @param SDFindIn ServerDefinitionObjectFilter for ServerDefinitionFindRequest
 *
 */
@JsonCreator
  public ServerDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerDefinition")ServerDefinitionObjectFilter SDFindIn) {
    super(id, "ServerDefinitionFind");
    if (SDFindIn != null) {
      Integer index =  SDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServerDefinition", ServerDefinitionObjectHelper.toMap(SDFindIn, new HashMap(), "ServerDefinition").get("ServerDefinition"));
    }
  }

/**
 *
 * Retrieves the ServerDefinitionObjectDataList that results from the ServerDefinitionFindRequest call
 * @return ServerDefinitionObjectDataList resulting from udt call
 *
 */

  public ServerDefinitionObjectDataList getOutput() {
    return ServerDefinitionObjectHelper.fromMapList(outputMap, "ServerDefinitionList");
  }
}
