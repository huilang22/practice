/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupRequest.java
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
 * Class used to create a CsrGroupRequest Udt Request
 *
 */

public class CsrGroupRequest extends CsrSubRequestParent {
/**
 *
 * Constructor to create a  CsrGroupRequest
 * @param id Unique request name
 * @param user_name String for CsrGroupRequest
 *
 */
@JsonCreator
  public CsrGroupRequest(@JsonProperty("RequestId") String id, @JsonProperty("UserName")String user_name) {
    super(id, "CsrGroup");
    if (user_name != null) {
      addInput("UserName", user_name);
    }
  }

/**
 *
 * Retrieves the CsrGroupOutputData that results from the CsrGroupRequest call
 * @return CsrGroupOutputData resulting from udt call
 *
 */

  public CsrGroupOutputData getOutput() {
    return CsrGroupOutputHelper.fromMap(outputMap);
  }
}
