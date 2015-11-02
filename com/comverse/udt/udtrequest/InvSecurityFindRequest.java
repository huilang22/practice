/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSecurityFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvSecurityFindRequest Udt Request
 *
 */

public class InvSecurityFindRequest extends InvSecurityRequest {
/**
 *
 * Constructor to create a  InvSecurityFindRequest
 * @param id Unique request name
 * @param InvSecFindIn InvSecurityObjectFilter for InvSecurityFindRequest
 *
 */
@JsonCreator
  public InvSecurityFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSecurity")InvSecurityObjectFilter InvSecFindIn) {
    super(id, "InvSecurityFind");
    if (InvSecFindIn != null) {
      Integer index =  InvSecFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvSecurity", InvSecurityObjectHelper.toMap(InvSecFindIn, new HashMap(), "InvSecurity").get("InvSecurity"));
    }
  }

/**
 *
 * Retrieves the InvSecurityObjectDataList that results from the InvSecurityFindRequest call
 * @return InvSecurityObjectDataList resulting from udt call
 *
 */

  public InvSecurityObjectDataList getOutput() {
    return InvSecurityObjectHelper.fromMapList(outputMap, "InvSecurityList");
  }
}
