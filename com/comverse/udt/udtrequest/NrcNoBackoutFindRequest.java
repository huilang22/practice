/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcNoBackoutFindRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a NrcNoBackoutFindRequest Udt Request
 *
 */

public class NrcNoBackoutFindRequest extends NrcRequest {
/**
 *
 * Constructor to create a  NrcNoBackoutFindRequest
 * @param id Unique request name
 * @param NrcNoBOFindInput NrcInvObjectFilter for NrcNoBackoutFindRequest
 *
 */
@JsonCreator
  public NrcNoBackoutFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Nrc")NrcInvObjectFilter NrcNoBOFindInput) {
    super(id, "NrcNoBackoutFind");
    if (NrcNoBOFindInput != null) {
      Integer index =  NrcNoBOFindInput.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcInvObjectHelper.toMap(NrcNoBOFindInput, new HashMap(), "Nrc").get("Nrc"));
    }
  }

/**
 *
 * Retrieves the NrcInvObjectDataList that results from the NrcNoBackoutFindRequest call
 * @return NrcInvObjectDataList resulting from udt call
 *
 */

  public NrcInvObjectDataList getOutput() {
    return NrcInvObjectHelper.fromMapList(outputMap, "NrcList");
  }
}
