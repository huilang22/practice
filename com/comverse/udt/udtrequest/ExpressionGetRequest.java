/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionGetRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExpressionGetRequest Udt Request
 *
 */

public class ExpressionGetRequest extends ExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ExpressionGetRequest
 * @param id Unique request name
 * @param getIn ExprObjKeyData for ExpressionGetRequest
 *
 */
@JsonCreator
  public ExpressionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Expression")ExprObjKeyData getIn) {
    super(id, "ExpressionGet");
    if (getIn != null) {
      addInput("Expression", ExprObjKeyHelper.toMap(getIn, new HashMap(), "ExprObjKeyData").get("ExprObjKeyData"));
    }
  }

/**
 *
 * Retrieves the ExprObjData that results from the ExpressionGetRequest call
 * @return ExprObjData resulting from udt call
 *
 */

  public ExprObjData getOutput() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
}
