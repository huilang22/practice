/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SecurityResourceFindRequest.java
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
 * Class used to create a SecurityResourceFindRequest Udt Request
 *
 */

public class SecurityResourceFindRequest extends SecurityResourceRequest {
/**
 *
 * Constructor to create a  SecurityResourceFindRequest
 * @param id Unique request name
 * @param SECFindIn SecurityResourceObjectFilter for SecurityResourceFindRequest
 *
 */
@JsonCreator
  public SecurityResourceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("SecurityResource")SecurityResourceObjectFilter SECFindIn) {
    super(id, "SecurityResourceFind");
    if (SECFindIn != null) {
      Integer index =  SECFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("SecurityResource", SecurityResourceObjectHelper.toMap(SECFindIn, new HashMap(), "SecurityResource").get("SecurityResource"));
    }
  }

/**
 *
 * Retrieves the SecurityResourceObjectDataList that results from the SecurityResourceFindRequest call
 * @return SecurityResourceObjectDataList resulting from udt call
 *
 */

  public SecurityResourceObjectDataList getOutput() {
    return SecurityResourceObjectHelper.fromMapList(outputMap, "SecurityResourceList");
  }
}
