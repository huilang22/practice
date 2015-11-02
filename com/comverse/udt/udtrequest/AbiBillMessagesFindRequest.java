/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AbiBillMessagesFindRequest.java
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
 * Class used to create a AbiBillMessagesFindRequest Udt Request
 *
 */

public class AbiBillMessagesFindRequest extends AbiBillMessagesRequest {
/**
 *
 * Constructor to create a  AbiBillMessagesFindRequest
 * @param id Unique request name
 * @param AbiBillMessagesFindIn AbiBillMessagesObjectFilter for AbiBillMessagesFindRequest
 *
 */
@JsonCreator
  public AbiBillMessagesFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AbiBillMessages")AbiBillMessagesObjectFilter AbiBillMessagesFindIn) {
    super(id, "AbiBillMessagesFind");
    if (AbiBillMessagesFindIn != null) {
      Integer index =  AbiBillMessagesFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("AbiBillMessages", AbiBillMessagesObjectHelper.toMap(AbiBillMessagesFindIn, new HashMap(), "AbiBillMessages").get("AbiBillMessages"));
    }
  }

/**
 *
 * Retrieves the AbiBillMessagesObjectDataList that results from the AbiBillMessagesFindRequest call
 * @return AbiBillMessagesObjectDataList resulting from udt call
 *
 */

  public AbiBillMessagesObjectDataList getOutput() {
    return AbiBillMessagesObjectHelper.fromMapList(outputMap, "AbiBillMessagesList");
  }
}
