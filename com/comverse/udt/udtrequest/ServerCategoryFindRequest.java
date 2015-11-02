/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServerCategoryFindRequest.java
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
 * Class used to create a ServerCategoryFindRequest Udt Request
 *
 */

public class ServerCategoryFindRequest extends ServerCategoryRequest {
/**
 *
 * Constructor to create a  ServerCategoryFindRequest
 * @param id Unique request name
 * @param SCFindIn SCObjectFilter for ServerCategoryFindRequest
 *
 */
@JsonCreator
  public ServerCategoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServerCategory")SCObjectFilter SCFindIn) {
    super(id, "ServerCategoryFind");
    if (SCFindIn != null) {
      Integer index =  SCFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ServerCategory", SCObjectHelper.toMap(SCFindIn, new HashMap(), "ServerCategory").get("ServerCategory"));
    }
  }

/**
 *
 * Retrieves the SCObjectDataList that results from the ServerCategoryFindRequest call
 * @return SCObjectDataList resulting from udt call
 *
 */

  public SCObjectDataList getOutput() {
    return SCObjectHelper.fromMapList(outputMap, "ServerCategoryList");
  }
}
