/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerFindRequest.java
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
 * Class used to create a ServerFindRequest Udt Request
 *
 */

public class ServerFindRequest extends ServerRequest {
/**
 *
 * Constructor to create a  ServerFindRequest
 * @param id Unique request name
 * @param S_DFindIn ServerObjectFilter for ServerFindRequest
 *
 */
@JsonCreator
  public ServerFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Server")ServerObjectFilter S_DFindIn) {
    super(id, "ServerFind");
    if (S_DFindIn != null) {
      Integer index =  S_DFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Server", ServerObjectHelper.toMap(S_DFindIn, new HashMap(), "Server").get("Server"));
    }
  }

/**
 *
 * Retrieves the ServerObjectDataList that results from the ServerFindRequest call
 * @return ServerObjectDataList resulting from udt call
 *
 */

  public ServerObjectDataList getOutput() {
    return ServerObjectHelper.fromMapList(outputMap, "ServerList");
  }
}
